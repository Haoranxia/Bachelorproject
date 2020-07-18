import re
import time
import json
import configparser
from util import write_to_csv, write_to_json

config = configparser.ConfigParser()
config.read("../settings.ini")
csv_enabled = (config["Output_Format"]['CSV'] == 'yes')
json_enabled = (config["Output_Format"]['JSON'] == 'yes')
enable_string_constants = (config["Sourcecode_Settings"]["StringConstants"] == "yes")
enable_string_obfuscations = (config["Sourcecode_Settings"]["StringObfuscations"] == "yes")
string_const_csv = "../output/static_out/string_constant_features.csv"
string_const_json = "../output/static_out/string_constant_features.json"


def has_uncommon_chars(string):
    """
    returns true if string contains ascii control characters (non-printable chars) or otherwise non-ascii characters
    :param string: string to be evaluated
    :return:
    """
    return all(32 > ord(c) or ord(c) >= 128 for c in string)


def is_base64_encoded(string):
    """
    returns true if given string is encoded in base64
    :param string: string to be evaluated
    :return:
    """
    pattern = re.compile("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$")
    return pattern.match(string)


def get_strings_with_obfuscation(dx, code_sentinels):
    """
    returns a list of string constants from apk source code and
    checks for a possible obfuscated code within string constants
    :param code_sentinels: are characters/strings/symbols that when found in a string constant count as a possible
    string obfuscation variable
    :param dx: Analysis object
    :return:
    """
    possible_str_obfs_cnt = 0
    break_flag = False
    possible_obfus_strings = []
    const_strings_dict = dx.get_strings_analysis()
    const_strings = list(const_strings_dict.keys())
    for string in const_strings:
        # count base64 encoded string constants as possible obfuscations
        if is_base64_encoded(string):
            possible_str_obfs_cnt += 1
            possible_obfus_strings.append(string)
            continue
        for sentinel in code_sentinels:
            if break_flag:
                break_flag = False
                break
            for _, method in const_strings_dict[string].get_xref_from():
                # excluding toString() methods to minimize false detection of string encrypted code
                if sentinel in string and method.name != "toString" or has_uncommon_chars(string):
                    possible_str_obfs_cnt += 1
                    possible_obfus_strings.append(string)
                    break_flag = True
                    break

    if not enable_string_obfuscations:
        possible_obfus_strings = None
    if not enable_string_constants:
        const_strings = None

    return const_strings, possible_str_obfs_cnt, possible_obfus_strings


def write_to_output(package_name, string_constants, possible_str_obfs_cnt, possible_obfus_strings):
    """
    writes collected features into output (CSV and JSON)
    :param package_name:
    :param string_constants:
    :param possible_str_obfs_cnt:
    :param possible_obfus_strings:
    :return:
    """
    if enable_string_constants or enable_string_obfuscations:
        string_constants_dict = {'package-name': package_name,
                                 'possible_str_obfs_cnt': possible_str_obfs_cnt,
                                 'possible_obfus_strings': possible_obfus_strings,
                                 'all-string-constants': string_constants}
        if csv_enabled:
            write_to_csv(string_const_csv, string_constants_dict)
        if json_enabled:
            write_to_json(string_const_json, string_constants_dict)


def run_string_constants_extraction(dx, package_name, sourcecode_logger):
    """
    extracts string literals and list of possibly obfuscated strings
    :param dx: androguard analysis object
    :param package_name:
    :param sourcecode_logger:
    :return:
    """
    try:
        start_time = time.time()
        str_config = configparser.ConfigParser()
        str_config.read(config['Paths']['string_obfs_sentinel_items'])
        code_sentinels = json.loads(str_config['String_Obfuscation_Sentinel_List']['sentinels'])
        string_constants, possible_str_obfs_cnt, possible_obfus_strings = get_strings_with_obfuscation(dx,
                                                                                                       code_sentinels)
        write_to_output(package_name, string_constants, possible_str_obfs_cnt, possible_obfus_strings)
        current_time = time.time()
        sourcecode_logger.info("Time spent on string constants: " + str(current_time - start_time))
    except Exception as e:
        sourcecode_logger.error("Koltin/Reflection extraction failed: " + str(e))
