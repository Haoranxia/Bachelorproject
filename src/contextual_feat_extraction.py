import csv
import json
import hashlib
import requests
import play_scraper

API_KEY = '5cad0bcd69749612edce15f291d2e3a2b800c063446593360d7f4ed57f46c5a2'


def write_to_csv(filename, app_details):
    """
    Writes contextual data to csv file, creates the file if it does not exist
    :param filename: the csv file destination
    :param app_details: the contextual features dictionary
    :return:
    """
    file = open(filename + ".csv", 'w+')
    with file:
        writer = csv.DictWriter(file, fieldnames=app_details.keys())
        writer.writeheader()
        writer.writerow(app_details)


def reformat_dictionary(app_details):
    """
    format the order of dictionary to have package id (pkgname) as the first column and
    insert escaping for new lines
    :param app_details: a dictionary that contains the contextual features
    :return:
    """
    updated_dict = {"pkgname": app_details["app_id"]}
    del app_details["app_id"]
    updated_dict.update(app_details)
    for key, val in updated_dict.items():
        key.encode('utf-8')
        if isinstance(val, str):
            val.encode('utf-8')
            updated_dict[key] = val.replace('\n', '\\n')
    return updated_dict


def write_to_json(filename, app_details):
    """
    writes contextual features to a json file, creates the file if it does not exist
    :param filename: the output filename to write dictionary to
    :param app_details: the contextual features as a dictionary
    :return:
    """
    app_details['description_html'] = str(app_details['description_html'])
    dictionary_json = json.dumps(app_details)
    f = open(filename + '.json', "w+", encoding='utf-8')
    f.write(dictionary_json)
    f.close()


def calculate_sha256(filepath):
    """
    calculates the sha256 hash value of a given file
    :param filepath: the path of given file
    :return:
    """
    sha256_hash = hashlib.sha256()
    with open(filepath, "rb") as f:
        # Read and update hash string value in blocks of 4K
        for byte_block in iter(lambda: f.read(4096), b""):
            sha256_hash.update(byte_block)
        return sha256_hash.hexdigest()


# TODO:: extract the api key, make the user sign in with creds?
def get_virus_total_positives():
    """
    Sends request to get a report from TotalVirus by sending sha256 hash value of an apk file
    :return: the number of positives and list of anti-virus scanners that detected the positive
    """
    url = 'https://www.virustotal.com/vtapi/v2/file/report'
    file = './apks/WhatsApp.apk'
    params = {'apikey': API_KEY, 'resource': calculate_sha256(file)}
    response = requests.get(url, params=params)

    if response.json()['response_code'] == 0:  # apk hash is not found in virusTotal database
        print("VirusTotal found no matching sha256 digest. Uploading source apk...")
        # send the file itself
        url = 'https://www.virustotal.com/vtapi/v2/file/scan'
        params = {'apikey': API_KEY}
        files = {'file': (file, open(file, 'rb'))}
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


def run_contextual():
    """
    runs the contextual component, get contextual details from google play and also request report from VirusTotal
    :return:
    """
    app_id = 'com.whatsapp'
    output_filename = './contextual_out/contextual_features_' + app_id.replace('.', '_')

    app_details = play_scraper.details(app_id)
    app_details['positives'], app_details['positives_list'] = get_virus_total_positives()
    formatted_app_details = reformat_dictionary(app_details)

    write_to_csv(output_filename, formatted_app_details)
    write_to_json(output_filename, formatted_app_details)
