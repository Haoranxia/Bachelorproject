import csv
import shutil
import json
import hashlib

from tempfile import NamedTemporaryFile
from os import path

def write_to_csv(file, file_dict):
    rowexists = False
    tempfile = NamedTemporaryFile(delete=False, mode='w', newline='')

    if not path.exists(file):
        # create
        with open(file, 'w+', newline='') as f:
            writer = csv.DictWriter(f, fieldnames=file_dict.keys())
            writer.writeheader()
            writer.writerow(file_dict)
            
    else:
        # edit
        with open(file, 'r') as readf, tempfile:
            reader = csv.DictReader(readf, fieldnames=file_dict.keys())
            writer = csv.DictWriter(tempfile, fieldnames=file_dict.keys())

            for row in reader:
                if str(row['package-name']) == str(file_dict['package-name']):
                    writer.writerow(file_dict)
                    rowexists = True
                else:
                    writer.writerow(row)

            if not rowexists:
                writer.writerow(file_dict)
        
        shutil.move(tempfile.name, file)

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







