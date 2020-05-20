import requests
import play_scraper
from requests.exceptions import HTTPError
from util import write_to_json, write_to_csv, calculate_sha256

VT_API_KEY = '5cad0bcd69749612edce15f291d2e3a2b800c063446593360d7f4ed57f46c5a2'
OPSWAT_API_KEY = 'f6ccaaa2ba7d467906cacb303572ef96'


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
    if 'description_html' in updated_dict:
        updated_dict['description_html'] = str(updated_dict['description_html'])
        # TODO:: try this \/
        # updated_dict['description_html'] = updated_dict['description_html'].decode("utf-8")
    return updated_dict


# TODO:: extract the api key, make the user sign in with creds?
def get_virus_total_positives(apk_file):
    """
    Sends request to get a report from TotalVirus by sending sha256 hash value of an apk file
    :return: the number of positives and list of anti-virus scanners that detected the positive
    """
    url = 'https://www.virustotal.com/vtapi/v2/file/report'
    params = {'apikey': VT_API_KEY, 'resource': calculate_sha256(apk_file)}
    response = requests.get(url, params=params)

    # TODO:: Disable or remove apk file upload to virus total
    '''
    if response.json()['response_code'] == 0:  # apk hash is not found in virusTotal database
        print("VirusTotal found no matching sha256 digest. Uploading source apk...")
        # send the file itself
        url = 'https://www.virustotal.com/vtapi/v2/file/scan'
        params = {'apikey': API_KEY}
        files = {'file': (apk_file, open(apk_file, 'rb'))}
        response = requests.post(url, files=files, params=params)
    '''
    try:
        response.raise_for_status()
    except requests.exceptions.RequestException as error:
        raise SystemExit('Error getting VirusTotal report.\n' + str(error))

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


def write_to_output_files(apk_file, app_id, app_details, output_filename):
    """
    adds results from virus scanners and writes to csv and json
    :param apk_file: the apk file for contextual features
    :param app_id: the application id
    :param app_details: a dictionary object containing available contextual features
    :param output_filename: the name of output file with directory
    :return:
    """
    app_details['vt_positives'], app_details['vt_positives_list'] = get_virus_total_positives(apk_file)
    app_details['opswat_result'] = get_opswat_positives(apk_file)
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
        app_details = play_scraper.details(app_id)
        write_to_output_files(apk_file, app_id, app_details, output_filename)
    except ValueError:
        print('AppID not found in the Google Play store')
        empty_app_details = {k: None for k in play_scraper.details('com.whatsapp').keys()}
        write_to_output_files(apk_file, app_id, empty_app_details, output_filename)
