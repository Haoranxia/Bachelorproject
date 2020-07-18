import time
import configparser
import sys

sys.path.append("../util.py")
from util import write_to_csv, write_to_json, add_to_dict_unique, convert_keys_to_string

# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")
csv_enabled = (config["Output_Format"]['CSV'] == 'yes')
json_enabled = (config["Output_Format"]['JSON'] == 'yes')
api_methods_csv = "../output/static_out/api_method_features.csv"
api_methods_json = "../output/static_out/api_method_features.json"


def get_api_methods(dx):
    """
    gets the external method calls (api methods)
    :param dx: dalvik analysis object about apk
    :return:
    """
    api_calls_dict = {}
    for external_class in dx.get_external_classes():
        external_methods = external_class.get_methods()
        for method in external_methods:
            method_name = method.get_method().get_name()
            class_name = method.get_method().get_class_name()
            full_method = class_name.replace(';', '::') + method_name
            add_to_dict_unique(full_method, api_calls_dict)

    return api_calls_dict


def write_to_output(package_name, api_methods_dict):
    """
    Writes collected api methods into csv or json
    :param package_name:
    :param api_methods_dict:
    :return:
    """
    api_methods_dict = {'package-name': package_name, 'api_methods': api_methods_dict}
    if csv_enabled:
        write_to_csv(api_methods_csv, api_methods_dict)
    if json_enabled:
        write_to_json(api_methods_json, api_methods_dict)


def run_api_methods_extraction(dx, package_name, sourcecode_logger):
    """
    extract and present api methods
    :param dx:
    :param package_name:
    :param sourcecode_logger:
    :return:
    """
    start_time = time.time()
    api_methods_dict = get_api_methods(dx)
    api_methods_dict = convert_keys_to_string(api_methods_dict)
    write_to_output(package_name, api_methods_dict)
    current_time = time.time()
    sourcecode_logger.info("Time spent on api methods: " + str(current_time - start_time))
