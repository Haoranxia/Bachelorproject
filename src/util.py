import csv
import json
import shutil
import hashlib
from os import path
from tempfile import NamedTemporaryFile


def write_to_csv(file, file_dict):
    """
    Writes dictionary data to csv file, creates the file if it does not exist
    :param file: the csv file destination
    :param file_dict: the dictionary containing features
    :return:
    """
    row_exists = False
    temp_file = NamedTemporaryFile(delete=False, mode='w', newline='')

    if not path.exists(file):
        # create
        with open(file, 'w+', newline='') as f:
            writer = csv.DictWriter(f, fieldnames=file_dict.keys())
            writer.writeheader()
            writer.writerow(file_dict)

    else:
        # edit
        with open(file, 'r') as readf, temp_file:
            reader = csv.DictReader(readf, fieldnames=file_dict.keys())
            writer = csv.DictWriter(temp_file, fieldnames=file_dict.keys())

            for row in reader:
                if str(row['package-name']) == str(file_dict['package-name']):
                    writer.writerow(file_dict)
                    row_exists = True
                else:
                    writer.writerow(row)

            if not row_exists:
                writer.writerow(file_dict)
        
        shutil.move(temp_file.name, file)


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
