import requests
import configparser
import play_scraper
from pathlib import Path
from requests.exceptions import HTTPError
from util import write_to_json, write_to_csv, calculate_sha256


config = configparser.ConfigParser()
config.read("../settings.ini")

VT_API_KEY = config["Contextual_Settings"]["virus_total_api_key"]
OPSWAT_API_KEY = config["Contextual_Settings"]["opswat_api_key"]
OPSWAT_enabled = (config["Contextual_Settings"]["opswat"] == 'yes')
google_play_enabled = (config["Contextual_Settings"]["app_store"] == 'yes')
virus_total_enabled = (config["Contextual_Settings"]["virus_total"] == 'yes')
file_upload_enabled = (config["Contextual_Settings"]['virus_total_enable_file_upload'] == 'yes')


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


def get_virus_total_positives(apk_file):
    """
    Sends request to get a report from TotalVirus by sending sha256 hash value of an apk file
    :return: the number of positives and list of anti-virus scanners that detected the positive
    """
    url = 'https://www.virustotal.com/vtapi/v2/file/report'
    params = {'apikey': VT_API_KEY, 'resource': calculate_sha256(apk_file)}
    response = requests.get(url, params=params)
    vt_size_limit = 32000000  # 32MB size limit -> upload file via url and wait for report
    # TODO::
    #  1. IF APK > 32 MB upload using special url
    #  2. get report using resource: scan_id
    #  3. push new and "default" settings.ini to git
    #  4. error handling when quota is reached
    #  5. give protobuff another try?
    if file_upload_enabled and response.json()['response_code'] == 0:  # apk hash is not found in virusTotal
        # send the file itself
        print("VirusTotal found no matching sha256 digest. Uploading source apk...")
        try:
            if Path(apk_file).stat().st_size > vt_size_limit:
                url = 'https://www.virustotal.com/vtapi/v2/file/scan/upload_url'
                params = {'apikey': VT_API_KEY}
                response = requests.get(url, params=params)
                upload_url = response.json()['upload_url']
                files = {'file': (apk_file, open(apk_file, 'rb'))}
                response = requests.post(upload_url, files=files)
            else:
                url = 'https://www.virustotal.com/vtapi/v2/file/scan'
                params = {'apikey': VT_API_KEY}
                files = {'file': (apk_file, open(apk_file, 'rb'))}
                response = requests.post(url, files=files, params=params)

            response.raise_for_status()
        except requests.exceptions.RequestException as error:
            print('Error getting VirusTotal report.\n' + str(error))
            return None, None
    # compile a list of anti-virus scanners that return a positive on a virus scan of given apk
    positives_list = []
    for antivirus_name in response.json()['scans']:
        if response.json()['scans'][antivirus_name]['detected']:
            positives_list.append(antivirus_name)
    return response.json()['positives'], positives_list


def get_opswat_positives(apk_file):
    url = "https://api.metadefender.com/v4/hash/" + str(calculate_sha256(apk_file))
    headers = {'apikey': OPSWAT_API_KEY}
    response = requests.request("GET", url, headers=headers)
    # print(response.text)
    return response.json()['process_info']['result']


def get_app_stores_availability(app_id, app_name):
    available_stores = []
    app_stores = ['Google Play', 'F-Droid', 'Uptodown']
    app_store_urls = ['https://play.google.com/store/apps/details?id=' + str(app_id),
                      'https://f-droid.org/en/packages/' + str(app_id),
                      'https://' + str(app_name) + '.en.uptodown.com/android']
    for app_store, url in zip(app_stores, app_store_urls):
        try:
            response = requests.get(url)
            response.raise_for_status()
        except HTTPError as http_err:
            print('HTTP error occurred: ' + str(http_err))
        except Exception as err:
            print('Error occurred: ' + str(err))
        else:  # no raised exceptions
            available_stores.append(app_store)
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
        app_details['opswat_result'] = get_opswat_positives(apk_file)
    else:
        app_details['opswat_result'] = None
    formatted_app_details = reformat_dictionary(app_details, app_id)
    write_to_csv(output_filename + '.csv', formatted_app_details)
    write_to_json(output_filename + '.json', formatted_app_details)


def run_contextual(apk_file, app_id):
    """
    runs the contextual component, get contextual details from google play and also request report from VirusTotal
    :return:
    """

    # TODO:: GET CONFIG ITEMS, -> appid, API KEYS, vt on/off, opswat on/off, opswat file upload on/off,
    #  vt file upload on/off
    #  error when vt or opswat quota is reached
    output_filename = '../contextual_out/contextual_features'
    try:
        if google_play_enabled:
            app_details = play_scraper.details(app_id)
            add_results_to_output(apk_file, app_id, app_details, output_filename)
        else:
            empty_app_details = {k: None for k in play_scraper.details('com.whatsapp').keys()}
            add_results_to_output(apk_file, app_id, empty_app_details, output_filename)
    except ValueError:
        print('AppID not found in the Google Play store')
        empty_app_details = {k: None for k in play_scraper.details('com.whatsapp').keys()}
        add_results_to_output(apk_file, app_id, empty_app_details, output_filename)
