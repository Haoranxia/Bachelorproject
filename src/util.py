import csv
import sys
import json
import mmap
import shutil
import hashlib
import ntpath
import logging
from os import path, devnull
from tempfile import NamedTemporaryFile


# FIXME: A possible bug might exist where csv writing might break if very odd characters are encountered. This issue has not been encountered so far
def write_to_csv(file, file_dict, key='package-name', header=None):
    """
    Writes the data in file_dict to a csv file where the fieldnames are the keys of the dictionary.
    If the file does not exist it will be created. If it already exists we will use a temporary file
    to update the csv data accordingly and then this file will become the new primary csv file.
    :param key: the key that will be used for checking whether a record is already present or not
    :param file: the path of the csv file (relative or full path)
    :param file_dict: the dictionary to be written to csv
    :param header: table header
    :return:
    """

    # decrease the maxInt value by factor 10 as long as the OverflowError occurs.
    maxInt = sys.maxsize
    while True:
        try:
            csv.field_size_limit(maxInt)
            break
        except OverflowError:
            maxInt = int(maxInt/10)

    # Set default header if its not given as a parameter
    if header is None:
        header = file_dict.keys()

    if not path.exists(file):
        # Create a new file
        with open(file, 'w+', newline='', encoding='utf-8') as f:
            writer = csv.DictWriter(f, fieldnames=header)
            writer.writeheader()
            writer.writerow(file_dict)
        return
    else:
        # Modify existing file
        row_exists = False
        temp_file = NamedTemporaryFile(delete=False, mode='w', newline='', encoding='utf-8')

        with open(file, 'r', encoding='utf-8') as readf, temp_file:
            reader = csv.DictReader(readf, fieldnames=header)
            writer = csv.DictWriter(temp_file, fieldnames=header)

            try:
                for row in reader:
                    if str(row[key]) == str(file_dict[key]):
                        writer.writerow(file_dict)
                        row_exists = True
                    else:
                        writer.writerow(row)

                if not row_exists:
                    writer.writerow(file_dict)
            except Exception:
                # TODO: Properly handle bad writes. We should probably just ignore such issues
                print("Error in writing data. Ignoring...")
        
        shutil.move(temp_file.name, file)


def delete_row(file, key):
    """
    deletes a row from a csv via a primary key
    :param file: csv file
    :param key: the key for a row to be deleted
    :return:
    """
    with open(file, 'r', encoding='utf-8') as read_file, NamedTemporaryFile(delete=False, mode='w', newline='') as temp_file:
        writer = csv.writer(temp_file)
        for row in csv.reader(read_file):
            if row[4] != key:
                writer.writerow(row)
        shutil.move(temp_file.name, file)


def file_contains(file_path, string):
    """
    Returns true if file contains a string
    :param file_path: path of file including the file
    :param string: string to be used
    :return:
    """
    with open(file_path, 'rb', 0) as read_file, mmap.mmap(read_file.fileno(), 0, access=mmap.ACCESS_READ) as s:
        if s.find(bytes(string, 'utf-8')) != -1:
            return True
    return False


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


# This function initializes a csv file containing 
# all the values in the header parameter as the header (column headers)
def initialize_csv(file, header):
    with open(file, 'w+', newline='') as f:
        writer = csv.writer(f)
        writer.writerow(header)


# This function reads a txt file and assumes each line is a value for the header of a column
def read_headers(headerfile):
    return open(headerfile, 'r').read().split('\n')


# This function creates a dict with 'headers' as the keys
# and if the header is present in 'data' then we denote it
# with a 1. Otherwise a 0.
def create_complete_dict(data_dict, headers, package_name, frequency=False):
    returndict = {}
    for header in headers:
        if header in data_dict:
            if frequency is False:
                returndict[header] = 1
            else:
                returndict[header] = data_dict[header]
        else:
            returndict[header] = 0
    returndict["package-name"] = package_name
    return returndict


# This function extends a file containing headers
# for a dictionairy with the package-name key
def get_full_header(path):
    header = ["package-name"]
    header.extend(read_headers(path))
    return header


def already_processed(package_name, processed_apks):
    # TODO Implement more efficient 'in' function
    if package_name in processed_apks: 
        return True
    return False


def get_processed_apks(processed_apks_file):
    return read_headers(processed_apks_file)


def path_leaf(path):
    head, tail = ntpath.split(path)
    return tail or ntpath.basename(head)


def add_to_dict_unique(name, dictionary):
    """
    adds a tally to an occurrence of an obfuscated class, field or method name
    :param name: class, field or method name
    :param dictionary: contains the tally
    :return:
    """
    if name not in dictionary:
        dictionary[name] = 1
    else:
        dictionary[name] += 1

    return dictionary


def convert_keys_to_string(input_dict):
    return_dict = {}
    for key in input_dict:
        return_dict[str(key)] = input_dict[key]
    
    return return_dict