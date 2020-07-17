from androguard.core import androconf
import math
import collections
import sys
import time

sys.path.append("../util.py")
from util import write_to_csv


def run_obfuscation_extraction(package_name, ds, sourcecode_logger):
    """
    Main function that extracts obfuscation information from the given apk source
    :param package_name: name of the package
    :param ds: Analysis object from Androguard
    :sourcecode_logger: logger object for sourcecode
    """
    obfuscations_dict = {}
    count_histogram = {}
    count_histogram["Length 1 identifier"] = 0
    count_histogram["Length 2 identifier"] = 0
    count_histogram["Length 3 identifier"] = 0

    try:
        start_time = time.time()
        for dex in ds:
            obfuscations_dict, count_histogram = get_obfuscation_naming_total(dex, obfuscations_dict)
        current_time = time.time()
        sourcecode_logger.info("Time spent on obfuscation: " + str(current_time - start_time))
        write_output(package_name, obfuscations_dict, count_histogram)
    except Exception as e:
        sourcecode_logger.error("Obfuscation extraction failed: " + str(e))


def get_obfuscation_naming_total(app, obfuscations_dict):
    """
    Get number of (possible) obfuscated names
    We check for several common obfuscation techniques:
    1) Check for keywords with < 4 characters
    2) Check whether non ASCII characters are used
    :param app:
    :param obfuscations_dict:
    :return:
    """
    
    count_histogram = collections.OrderedDict()
    count_histogram["Length 1 identifier"] = 0
    count_histogram["Length 2 identifier"] = 0
    count_histogram["Length 3 identifier"] = 0

    for c in app.get_classes():
        count_histogram = update_count_histogram(c.get_name(), count_histogram)
        obfuscations_dict = add_to_obfuscation_histogram(c.get_name(), obfuscations_dict)

        for field in c.get_fields():
            count_histogram = update_count_histogram(field.get_name(), count_histogram)
            add_to_obfuscation_histogram(field.get_name(), obfuscations_dict)

        for method in c.get_methods():
            count_histogram = update_count_histogram(method.get_name(), count_histogram)
            add_to_obfuscation_histogram(method.get_name(), obfuscations_dict)

    return obfuscations_dict, count_histogram


def update_count_histogram(identifier_name, count_histogram):
    if len(identifier_name) < 4:
        count_histogram["Length " + str(len(identifier_name)) + " identifier"] += 1

    return count_histogram


def add_to_obfuscation_histogram(name, obfuscations_dict):
    """
    add obfuscated count using class name, field name or method name to ordered dictionary
    :param name: class, field or method name
    :param obfuscations_dict: ordered dictionary
    :return:
    """
    if len(name) < 4:
        obfuscations_dict = add_to_dict_unique(name, obfuscations_dict)
        return obfuscations_dict

    if androconf.is_ascii_problem(name):
        obfuscations_dict = add_to_dict_unique(name, obfuscations_dict)

    return obfuscations_dict


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


def write_output(package_name, obfuscations_dict, count_histogram):
    obfuscationscsv = "../output/static_out/obfuscation_features.csv"
    output_dict = {}
    output_dict["package-name"] = package_name
    output_dict["Possible obfuscations"] = obfuscations_dict
    output_dict.update(count_histogram)
    write_to_csv(obfuscationscsv, output_dict)
