import csv
import json
import shutil
import hashlib
from os import path
from tempfile import NamedTemporaryFile


def write_to_csv(file, file_dict):
    """
    Writes the data in file_dict to a csv file where the fieldnames are the keys of the dictionary.
    If the file does not exist it will be created. If it already exists we will use a temporary file
    to update the csv data accordingly and then this file will become the new primary csv file.
    :param file: the path of the csv file (relative or full path)
    :param file_dict: the dictionary to be written to csv
    :return:
    """

    if not path.exists(file):
        # Create a new file
        with open(file, 'w+', newline='') as f:
            writer = csv.DictWriter(f, fieldnames=file_dict.keys())
            writer.writeheader()
            writer.writerow(file_dict)
        return
    else:
        row_exists = False
        temp_file = NamedTemporaryFile(delete=False, mode='w', newline='')

        # Modify existing file
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


def write_to_json(filename, app_details):  # TODO:: RUN TESTS FOR APPENDING TO JSON
    """
    writes contextual features to a json file, creates the file if it does not exist
    :param filename: the output filename
    :param app_details: the contextual features as a dictionary
    :return:
    """
    if path.exists(filename):
        # Modify existing file
        json_file = open(filename)
        data = json.load(json_file)
        data_app_details = data['app_details']

        # Replace the entry if it already exists
        have_replaced = False
        for idx, app_detail in enumerate(data_app_details):
            if app_detail['package-name'] == app_details['package-name']:
                data_app_details[idx] = app_details
                have_replaced = True

        # If entry is not replaced, then simply append
        if not have_replaced:
            data_app_details.append(app_details)
        f = open(filename, "w")
        json.dump(data, f, indent=4, sort_keys=True)
    else:
        # Create a new file
        f = open(filename, "w+", encoding='utf-8')
        output_dict = {'app_details': [app_details]}
        json.dump(output_dict, f, indent=4, sort_keys=True)


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
