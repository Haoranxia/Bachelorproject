import requests
import play_scraper

from src.util import write_to_json, write_to_csv, calculate_sha256

API_KEY = '5cad0bcd69749612edce15f291d2e3a2b800c063446593360d7f4ed57f46c5a2'


def reformat_dictionary(app_details):
    """
    format the order of dictionary to have package id (package-name) as the first column and
    insert escaping for new lines
    :param app_details: a dictionary that contains the contextual features
    :return:
    """
    updated_dict = {"package-name": app_details["app_id"]}
    del app_details["app_id"]
    updated_dict.update(app_details)
    for key, val in updated_dict.items():
        key.encode('utf-8')
        if isinstance(val, str):
            val.encode('utf-8')
            updated_dict[key] = val.replace('\n', '\\n')
    if 'description_html' in updated_dict:
        updated_dict['description_html'] = str(updated_dict['description_html'])
    return updated_dict


# TODO:: extract the api key, make the user sign in with creds?
def get_virus_total_positives(apk_file):
    """
    Sends request to get a report from TotalVirus by sending sha256 hash value of an apk file
    :return: the number of positives and list of anti-virus scanners that detected the positive
    """
    url = 'https://www.virustotal.com/vtapi/v2/file/report'
    params = {'apikey': API_KEY, 'resource': calculate_sha256(apk_file)}
    response = requests.get(url, params=params)

    if response.json()['response_code'] == 0:  # apk hash is not found in virusTotal database
        print("VirusTotal found no matching sha256 digest. Uploading source apk...")
        # send the file itself
        url = 'https://www.virustotal.com/vtapi/v2/file/scan'
        params = {'apikey': API_KEY}
        files = {'file': (apk_file, open(apk_file, 'rb'))}
        response = requests.post(url, files=files, params=params)

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


def run_contextual(apk_file, app_id):
    """
    runs the contextual component, get contextual details from google play and also request report from VirusTotal
    :return:
    """
    output_filename = './contextual_out/contextual_features'

    app_details = play_scraper.details(app_id)
    app_details['positives'], app_details['positives_list'] = get_virus_total_positives(apk_file)
    formatted_app_details = reformat_dictionary(app_details)

    write_to_csv(output_filename + '.csv', formatted_app_details)
    write_to_json(output_filename + '.json', formatted_app_details)
