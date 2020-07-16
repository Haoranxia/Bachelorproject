import json
import re
import math
import time
import collections
import logging
import traceback
import configparser
import sys
from androguard.core import bytecodes
from androguard.core import androconf
from androguard.core.analysis import analysis
from androguard.core.bytecodes.dvm import ClassDefItem, EncodedMethod

from Sourcecode.api_methods import run_api_methods_extraction
from Sourcecode.string_constants import run_string_constants_extraction
from util import get_full_header, write_to_csv, create_complete_dict, write_to_json, add_to_dict_unique

# add paths
sys.path.append("../util.py")

# Logger
sourcecode_logger = logging.getLogger()
sourcecode_logger.setLevel(logging.INFO)


# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")

enable_opcodes = (config["Sourcecode_Settings"]["Opcodes"] == "yes")
enable_obfuscation = (config["Sourcecode_Settings"]["Obfuscation"] == "yes")
enable_keywordusage = (config["Sourcecode_Settings"]["Keywordusage"] == "yes")
enable_kotlin = (config["Sourcecode_Settings"]["Kotlin"] == "yes")
enable_reflection = (config["Sourcecode_Settings"]["Reflection"] == "yes")
enable_commonkeywords = (config["Sourcecode_Settings"]["Commonkeywords"] == "yes")


def analyze_dex(a, ds, dx):
    """
    analyze Dex file
    :param ds: list of dalvikVMformat objects
    :param dx: Analysis object
    :return:
    """
    # Initialization
    package_name = a.get_package()

    opcodes_dict = collections.OrderedDict()

    obfuscation_score = 0
    obfuscations_dict = collections.OrderedDict()
    count_histogram = collections.OrderedDict()
    count_histogram["Length 1 identifier"] = 0
    count_histogram["Length 2 identifier"] = 0
    count_histogram["Length 3 identifier"] = 0

    kotlin_dict = collections.OrderedDict()
    reflection_dict = collections.OrderedDict()
    
    string_constants = []
    possible_str_obfs_cnt = 0
    possible_obfus_strings = []
    api_methods_dict = {}
    keyword_usages_general = collections.OrderedDict()
    
    # Use d object
    for dex in ds:
        if enable_opcodes:
            try:
                start_time = time.time()
                opcodes_dict = get_opcodes(dex, opcodes_dict)
                current_time = time.time()
                sourcecode_logger.info("Time spent on opcodes: " + str(current_time - start_time))
            except Exception as e:
                sourcecode_logger.error("Opcodes extraction failed: " + str(e))

        if enable_obfuscation:
            try:
                start_time = time.time()
                obfuscation_score, obfuscations_dict, count_histogram = get_obfuscation_naming_total(dex, obfuscations_dict)
                current_time = time.time()
                obfuscations_dict["obfuscation-score"] = obfuscation_score
                sourcecode_logger.info("Time spent on obfuscation: " + str(current_time - start_time))
            except Exception as e:
                sourcecode_logger.error("Obfuscation extraction failed: " + str(e))

    # Use dx object
    try:
        if enable_keywordusage:
            start_time = time.time()
            kotlin_dict, reflection_dict, keyword_usages_general = get_keyword_usage(dx)
            current_time = time.time()
            sourcecode_logger.info("Time spent on keyword usage: " + str(current_time - start_time))

        run_string_constants_extraction(dx, package_name, sourcecode_logger)
        run_api_methods_extraction(dx, package_name, sourcecode_logger)

    except Exception as e:
        sourcecode_logger.error("Koltin/Reflection extraction failed: " + str(e))

    # Write obtained data to output files
    formatted_sourcecode_dict = format_sourcecode_dict(package_name, obfuscations_dict, count_histogram, kotlin_dict, reflection_dict, keyword_usages_general)
    write_output(package_name, opcodes_dict, api_methods_dict, string_constants, possible_str_obfs_cnt, possible_obfus_strings, formatted_sourcecode_dict)
    return
    

def write_output(package_name, opcodes_dict, api_methods_dict, string_constants_dict, possible_str_obfs_cnt, possible_obfus_strings, formatted_sourcecode_dict):
    # CSV Output files
    sourcecodecsv = "../output/static_out/sourcecode_features.csv"

    opcodescsv = "../output/static_out/sourcecode_opcodes.csv"

    # Header files
    opcodes_header = get_full_header("../resources/opcodes.txt")

    if enable_opcodes:
        opcodes_dict = create_complete_dict(opcodes_dict, opcodes_header, package_name, frequency=True)
        write_to_csv(opcodescsv, opcodes_dict, header=opcodes_header)

    if enable_obfuscation or enable_kotlin or enable_reflection or enable_keywordusage:
        write_to_csv(sourcecodecsv, formatted_sourcecode_dict)


# Return a dictionary of opcodes and the nr of occurrences of that opcode
# src: http://blog.k3170makan.com/2014/11/automated-dex-decompilation-using.html
def get_opcodes(app, opcodes_dict):
    for c in app.get_classes():
        for m in c.get_methods():
            byte_code = m.get_code()
            if byte_code is not None:
                byte_code = byte_code.get_bc()
                for instr in byte_code.get_instructions():
                    instr_name = instr.get_name()
                    if instr_name not in opcodes_dict:
                        opcodes_dict[instr_name] = 1
                    else:
                        opcodes_dict[instr_name] += 1
    return opcodes_dict


# Function that checks of common obfuscation techniques
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
    
    obfuscation_score = 0
    total_evaluated = 0
    count_histogram = collections.OrderedDict()
    count_histogram["Length 1 identifier"] = 0
    count_histogram["Length 2 identifier"] = 0
    count_histogram["Length 3 identifier"] = 0

    for c in app.get_classes():
        total_evaluated += 1
        count_histogram = update_count_histogram(c.get_name(), count_histogram)
        obfuscations_dict = add_to_obfuscation_histogram(c.get_name(), obfuscations_dict)
        obfuscation_score += obfuscation_evaluator(c.get_name())

        for field in c.get_fields():
            total_evaluated += 1
            count_histogram = update_count_histogram(field.get_name(), count_histogram)
            add_to_obfuscation_histogram(field.get_name(), obfuscations_dict)
            obfuscation_score += obfuscation_evaluator(field.get_name())

        for method in c.get_methods():
            total_evaluated += 1
            count_histogram = update_count_histogram(method.get_name(), count_histogram)
            add_to_obfuscation_histogram(method.get_name(), obfuscations_dict)
            obfuscation_score += obfuscation_evaluator(method.get_name())

    return (obfuscation_score / total_evaluated), obfuscations_dict, count_histogram


def get_keyword_usage(app):
    """
    Scan the source code for kotlin keyword/pattern usage
    :param app: app containing the source code
    :return:
    """

    # Kotlin 
    key_patterns_kotlin = [r'new StringBuilder\(\)', r'\bkotlin\b', r'kotlin\.([a-zA-Z]+)', r'@NotNull']
    keyword_usages_kotlin = initialize_keyword_dict(key_patterns_kotlin, enable_kotlin)

    # Reflection
    reflection_regex = r'reflect\.([a-zA-Z]+)'
    reflection_dict = collections.OrderedDict()

    # General obfuscation keywords
    common_keywords = [r'goto']
    keyword_usages_common = initialize_keyword_dict(common_keywords, enable_kotlin)

    for cl in app.get_classes():
        for method in cl.get_methods():
            m = method.get_method()

            # We only care about code in methods. We check those for patterns
            if m and isinstance(m, bytecodes.dvm.EncodedMethod):
                try:
                    src = m.get_source()

                except Exception:
                    sourcecode_logger.warning("Could not decompile method: " + str(m.name))
                    src = None

                # Kotlin keyword analysis
                if src and enable_kotlin:
                    key_patterns_kotlin = find_pattern_usage(src, key_patterns_kotlin, keyword_usages_kotlin)

                # Java reflection usage analysis
                if src and enable_reflection:
                    reflection_dict = find_reflection_usage(src, reflection_regex, reflection_dict)

                # General keyword analysis
                if src and enable_commonkeywords:
                    keyword_usages_common = find_pattern_usage(src, common_keywords, keyword_usages_common)

    return keyword_usages_kotlin, reflection_dict, keyword_usages_common


# Keyword usage helper functions
def find_pattern_usage(src, patterns, dictionary):
    for pattern in patterns:
        dictionary[pattern] += len(re.findall(pattern, src))
    return dictionary


def find_reflection_usage(src, reflection_regex, reflection_dict):
    reflections = re.findall(reflection_regex, src)
    for reflection in reflections:
        reflection = "java.lang.reflect." + reflection  # Specify the full name for formatting sakes
        if reflection not in reflection_dict:
            reflection_dict[reflection] = 1
        else:
            reflection_dict[reflection] += 1
    return reflection_dict


def initialize_keyword_dict(patterns, enable):
    if enable:
        return {pattern: 0 for pattern in patterns}
    else:
        return {pattern: None for pattern in patterns}


def update_count_histogram(identifier_name, count_histogram):
    if len(identifier_name) < 4:
        count_histogram["Length " + str(len(identifier_name)) + " identifier"] += 1

    return count_histogram


# Obfuscation helper functions
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


def obfuscation_evaluator(name):
    """
    evaluates if a given class name, field name or method name is obfuscated with single letter alphabets or non-ascii
    characters
    :param name: class, field or method name
    :return:
    """
    if androconf.is_ascii_problem(name):
        return 1

    name_len = len(name)
    if name_len < 4:
        return math.exp(1 - name_len)

    return 0


def count_overlapping_distinct(pattern, text):
    """
    counts the number of patterns found in text
    :param pattern: regex pattern
    :param text: the source text to be searched
    :return:
    """
    total = 0
    start = 0
    there = re.compile(pattern)

    while True:
        mo = there.search(text, start)
        if mo is None: return total
        total += 1
        start = 1 + mo.start()


# Output formatting function
def format_sourcecode_dict(package_name, obfuscations_dict, obfuscations_histogram, kotlin_dict, reflection_dict, keyword_usages_general):
    sourcecode_features_dict = collections.OrderedDict()
    sourcecode_features_dict["package-name"] = package_name
    sourcecode_features_dict["Possible obfuscations"] = list(obfuscations_dict.items())
    sourcecode_features_dict.update(obfuscations_histogram)
    sourcecode_features_dict.update(kotlin_dict)
    sourcecode_features_dict.update(keyword_usages_general)
    sourcecode_features_dict["Reflection"] = [(key, reflection_dict[key]) for key in reflection_dict.keys()]
    return sourcecode_features_dict
