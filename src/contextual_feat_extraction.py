import re
import requests
import configparser
import play_scraper
from pathlib import Path
from subprocess import Popen, PIPE
from google_play_scraper import app
from requests.exceptions import HTTPError
from util import write_to_json, write_to_csv, calculate_sha256, file_contains, delete_row

config = configparser.ConfigParser()
config.read("../settings.ini")

VT_API_KEY = config["Contextual_Settings"]["virus_total_api_key"]
OPSWAT_API_KEY = config["Contextual_Settings"]["opswat_api_key"]
HA_API_KEY = config["Contextual_Settings"]["hybrid_analysis_api_key"]
OPSWAT_enabled = (config["Contextual_Settings"]["opswat"] == 'yes')
google_play_enabled = (config["Contextual_Settings"]["app_store"] == 'yes')
hybrid_analysis_enabled = (config["Contextual_Settings"]["hybrid_analysis"] == 'yes')
virus_total_enabled = (config["Contextual_Settings"]["virus_total"] == 'yes')
file_upload_enabled = (config["Contextual_Settings"]['virus_total_enable_file_upload'] == 'yes')
OPSWAT_THREAT_CODE = 1  # opswat designated code for threats in API response (scan_all_result_i)


def reformat_dictionary(app_details, app_id):
    """
    format the order of dictionary to have package id (package-name) as the first column and
    insert escaping for new lines
    :param app_details: a dictionary that contains the contextual features
    :param app_id: the id of a given app
    :return:
    """
    updated_dict = {"package-name": app_id}
    del app_details["app_id"]
    updated_dict.update(app_details)
    for key, val in updated_dict.items():
        key.encode('utf-8')
        if isinstance(val, str):
            val.encode('utf-8')
            updated_dict[key] = val.replace('\n', '\\n')
    if 'description_html' in updated_dict and updated_dict['description_html']:
        updated_dict['description_html'] = updated_dict['description_html'].decode("utf-8")
    return updated_dict


def get_opswat_positives(apk_file):
    """
    Sends request to get a report from OPSWAT meta-scan api by using sha256 hash value of an apk file
    :param apk_file: apk file to be hashed and queried in the OPSWAT api
    :return:
    """
    try:
        url = "https://api.metadefender.com/v4/hash/" + str(calculate_sha256(apk_file))
        headers = {'apikey': OPSWAT_API_KEY}
        response = requests.request("GET", url, headers=headers)
        response.raise_for_status()
        positives_list = []
        scan_details = response.json()['scan_results']['scan_details']
        for antivirus_name in scan_details:
            if scan_details[antivirus_name]['scan_result_i'] == OPSWAT_THREAT_CODE:  # if av reports apk to be a threat
                positives_list.append(antivirus_name)
        return response.json()['scan_results']['scan_all_result_a'], positives_list
    except requests.exceptions.RequestException:
        print('Apk file not found in Meta-scan database.')
    return None, None


def get_hybrid_analysis_positives(apk_file):
    """
    Sends request to get a report from hybrid-analysis api by using sha256 hash value of an apk file
    :param apk_file: file to be examined for av report
    :return: list of anti-virus scanners that detected the file to be positive
    """
    try:
        sha_digest = calculate_sha256(apk_file)
        url = 'https://www.hybrid-analysis.com/api/v2/overview/' + sha_digest
        response = requests.get(url=url, headers={'api-key': HA_API_KEY, 'user-agent': 'Falcon Sandbox'}, timeout=4)
        response.raise_for_status()
        response_json = response.json()
        positives_list = []
        ha_scanners = response_json['scanners']
        positives = 0
        for scan_item in ha_scanners:
            if scan_item['positives'] and scan_item['positives'] != 0:
                positives_list.append(scan_item['name'])
                positives += scan_item['positives']
        return response_json['threat_score'], positives, positives_list
    except requests.exceptions.RequestException:
        print('Apk file not found in hybrid-analysis database.')
        return None, None, None


# TODO::
#  5. give protobuff another try?
def get_virus_total_positives(apk_file):
    """
    Sends request to get a report from TotalVirus by sending sha256 hash value of an apk file
    or uploading the file if the hash value is not found in vt database
    :return: the number of positives and list of anti-virus scanners that detected the positive
    """
    vt_size_limit = 32000000  # 32MB size limit -> upload file via special url and queue for report
    sha_digest = calculate_sha256(apk_file)

    try:
        url = 'https://www.virustotal.com/vtapi/v2/file/report'
        params = {'apikey': VT_API_KEY, 'resource': sha_digest}
        response = requests.get(url, params=params, timeout=4)
        if response.status_code == 204:
            return None, 'vt quota reached'
        response.raise_for_status()

        if file_upload_enabled and response.json()['response_code'] == 0:  # apk hash is not found in virusTotal
            # send the file itself
            print("VirusTotal found no matching sha256 digest. Uploading source apk...")

            if Path(apk_file).stat().st_size > vt_size_limit:  # apk file size > vt limit -> upload via url
                url = 'https://www.virustotal.com/vtapi/v2/file/scan/upload_url'
                params = {'apikey': VT_API_KEY}
                response = requests.get(url, params=params)
                response.raise_for_status()
                upload_url = response.json()['upload_url']
                return request_vt_response(apk_file, upload_url, None, None)
            else:
                url = 'https://www.virustotal.com/vtapi/v2/file/scan'
                params = {'apikey': VT_API_KEY}
                return request_vt_response(apk_file, None, params, url)
        else:
            return compile_vt_result(response)
    except requests.exceptions.RequestException as error:
        print('Failed to receive VirusTotal report.\n' + str(error))
        return None, None


def request_vt_response(apk_file, upload_url, params, url):
    """
    sends a post request with an apk file to vt api
    :param apk_file: the apk file to be uploaded
    :param upload_url: the url used to upload files greater than 32MB
    :param params: post request parameters (VT_API_KEY)
    :param url: the url used to upload files less than 32MB
    :return:
    """
    files = {'file': (apk_file, open(apk_file, 'rb'))}
    if params:
        response = requests.post(url, files=files, params=params)
    else:
        response = requests.post(upload_url, files=files)
    response.raise_for_status()
    if 'scans' not in response.json():  # if request is queued
        return None, 'Request queued. Rerun to get report'
    else:
        return compile_vt_result(response)


def compile_vt_result(response):
    """
    compile a list of anti-virus scanners that return a positive on a virus scan of given apk
    :param response: a response from virus total scan request
    :return:
    """
    positives_list = []
    for antivirus_name in response.json()['scans']:
        if response.json()['scans'][antivirus_name]['detected']:
            positives_list.append(antivirus_name)
    return response.json()['positives'], positives_list


def get_app_stores_availability(app_id):
    """ TODO:: GET REQUESTS NEED A TIME LIMIT!!!!
    gets the list of app store a given apk exits in
    :param app_id: application id
    :return:
    """
    available_stores = []
    app_stores = ['Google Play', 'F-Droid', 'apk-monk', 'apk-support']
    app_store_urls = ['https://play.google.com/store/apps/details?id=' + str(app_id),
                      'https://f-droid.org/en/packages/' + str(app_id),
                      'https://www.apkmonk.com/app/' + str(app_id),
                      'https://apk.support/app/' + str(app_id)
                      ]
    for app_store, url in zip(app_stores, app_store_urls):
        try:
            response = requests.get(url, timeout=4)
            response.raise_for_status()
        except HTTPError:
            print(app_id + ' not found in ' + app_store + ' app store.')
        except Exception as err:
            print('Error occurred: ' + str(err))
        else:
            available_stores.append(app_store)  # no raised exceptions
    return available_stores


def add_results_to_output(apk_file, app_id, app_details, output_filename):
    """
    adds results from virus scanners and writes to csv and json
    :param apk_file: the apk file for contextual features
    :param app_id: the application id
    :param app_details: a dictionary object containing available contextual features
    :param output_filename: the name of output file with directory
    :return:
    """
    if virus_total_enabled:
        app_details['vt_positives'], app_details['vt_positives_list'] = get_virus_total_positives(apk_file)
    else:
        app_details['vt_positives'], app_details['vt_positives_list'] = (None, None)
    if OPSWAT_enabled:
        app_details['opswat_result'], app_details['opswat_positives_list'] = get_opswat_positives(apk_file)
    else:
        app_details['opswat_result'], app_details['opswat_positives_list'] = (None, None)
    if hybrid_analysis_enabled:
        app_details['HA_threat_score'], app_details['HA_positives'], app_details['HA_positives_list'] = \
            get_hybrid_analysis_positives(apk_file)
    else:
        app_details['HA_threat_score'], app_details['HA_positives'], app_details['HA_positives_list'] = (None, None,
                                                                                                         None)

    app_details['store-availability'] = get_app_stores_availability(app_id)
    formatted_app_details = reformat_dictionary(app_details, app_id)
    write_to_csv(output_filename + '.csv', formatted_app_details, key='package-name')
    write_to_json(output_filename + '.json', formatted_app_details)


def extend_app_details(app_id, app_details, gp_available):
    """
    extends contextual features using an additional google play web scraper
    :param app_id: application id of android application
    :param app_details: app details dictionary to be extended
    :param gp_available: boolean to denote if app is available in google play (used to initialize an empty extended \
    app_details dictionary)
    :return:
    """
    key_list = ['score', 'histogram', 'price', 'free', 'currency', 'sale', 'saleTime', 'androidVersion', 'privacyPolicy'
        , 'headerImage', 'contentRatingDescription', 'adSupported', 'containsAds', 'released', 'comments']
    if gp_available:
        extended_dict = app(app_id)
        extended_details = {key: extended_dict[key] for key in key_list}
        app_details.update(extended_details)
    else:
        extended_details = {key: None for key in key_list}
        app_details.update(extended_details)


def get_app_id(apk_file):
    """
    gets an app id given an apk file
    :param apk_file: an android app
    :return:
    """
    meta_info = Popen(['aapt', 'dump', 'badging', apk_file], stdout=PIPE, stderr=PIPE)
    meta_info_stdout, stderr = meta_info.communicate()
    print(re.findall(r"package: name='(.*?)'", meta_info_stdout.decode('utf-8'))[0])


def run_contextual(apk_file, app_id):
    """
    runs the contextual component, get contextual details from google play and also request report from VirusTotal
    :return:
    """
    output_filename = '../contextual_out/contextual_features'
    try:
        if google_play_enabled:
            app_details = play_scraper.details(app_id)
            extend_app_details(app_id, app_details, True)
            add_results_to_output(apk_file, app_id, app_details, output_filename)
        else:
            empty_app_details = {k: None for k in play_scraper.details('com.whatsapp').keys()}
            extend_app_details(None, empty_app_details, False)
            add_results_to_output(apk_file, app_id, empty_app_details, output_filename)
    except (ValueError, requests.exceptions.HTTPError):
        print('AppID not found in the Google Play store')
        empty_app_details = {k: None for k in play_scraper.details('com.whatsapp').keys()}
        extend_app_details(None, empty_app_details, False)
        add_results_to_output(apk_file, app_id, empty_app_details, output_filename)


# run_contextual('../apks/flashlight.apk', 'com.torch.lampe.flashlight')
