import re
import math
import time
import collections
import logging
import traceback
import configparser
from androguard.core import bytecodes
from androguard.core import androconf
from androguard.core.analysis import analysis
from androguard.core.bytecodes.dvm import ClassDefItem, EncodedMethod


# Logger
sourcecode_logger = logging.getLogger()
sourcecode_logger.setLevel(logging.INFO)


# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")

enable_opcodes = (config["Sourcecode_Settings"]["Opcodes"] == "yes")
enable_obfuscation = (config["Sourcecode_Settings"]["Obfuscation"] == "yes")
enable_kotlin = (config["Sourcecode_Settings"]["Kotlin"] == "yes")
enable_reflection = (config["Sourcecode_Settings"]["Reflection"] == "yes")


# TODO: Look for common obfuscation techniques and pattern match for that
# TODO: Look for more kotlin code patterns and pattern match for that
def analyze_dex(ds, dx):
    """
    analyze Dex file
    :param ds: list of dalvikVMformat objects
    :param dx: Analysis object
    :return:
    """
    # Initialization
    opcodes_dict = collections.OrderedDict()
    obfuscation_score = 0
    obfuscations_dict = collections.OrderedDict()
    kotlin_dict = collections.OrderedDict()
    reflection_dict = collections.OrderedDict()

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
                sourcecode_logger.info("Time spent on obfuscation: " + str(current_time - start_time))
            except Exception as e:
                sourcecode_logger.error("Obfuscation extraction failed: " + str(e))

    # Use dx object
    try:
        start_time = time.time()
        kotlin_dict, reflection_dict, keyword_usages_general = get_keyword_usage(dx)
        current_time = time.time()
        sourcecode_logger.info("Time spent on keyword usage: " + str(current_time - start_time))
    except Exception as e:
        sourcecode_logger.error("Koltin/Reflection extraction failed: " + str(e))
        traceback.print_exc()

    obfuscations_dict["obfuscation-score"] = obfuscation_score

    return opcodes_dict, format_sourcecode_dict(obfuscations_dict, count_histogram, kotlin_dict, reflection_dict, keyword_usages_general) 


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
    # TODO explain how obfuscation score is calculated
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


# Function that checks for certain keywords in the sourcecode
# TODO: Refactor function to allow the user to specify a pattern
def get_keyword_usage(app):
    """
    Scan the source code for kotlin keyword/pattern usage
    :param app: app containing the source code
    :return:
    """

    # Kotlin 
    key_patterns_kotlin = [r'new StringBuilder\(\)', r'\bkotlin\b', r'kotlin\.([a-zA-Z]+)', r'@NotNull']
    keyword_usages_kotlin = collections.OrderedDict()
    if enable_kotlin:
        keyword_usages_kotlin = {key_pattern: 0 for key_pattern in key_patterns_kotlin}
    else:
        keyword_usages_kotlin = {key_pattern: None for key_pattern in key_patterns_kotlin}

    # Reflection
    reflection_regex = r'reflect\.([a-zA-Z]+)'
    reflection_dict = collections.OrderedDict()

    # General obfuscation keywords
    general_keywords = [r'goto']
    keyword_usages_general = collections.OrderedDict()
    keyword_usages_general = {key_pattern: 0 for key_pattern in general_keywords}

    if enable_reflection or enable_kotlin:
        for cl in app.get_classes():
            for method in cl.get_methods():
                m = method.get_method()

                # We only care about code in methods. We check those for patterns
                if m and isinstance(m, bytecodes.dvm.EncodedMethod):
                    try:
                        src = m.get_source()
                    except:
                        sourcecode_logger.warning("Could not decompile method: " + m.name)
                        src = None

                    #Kotlin keyword analysis
                    if src and enable_kotlin:
                        for key_pattern in key_patterns_kotlin:
                            keyword_usages_kotlin[key_pattern] += len(re.findall(key_pattern, src))
                            #keyword_usages_kotlin[key_pattern] += count_overlapping_distinct(key_pattern, src)

                    # Java reflection usage analysis
                    if src and enable_reflection:
                        reflections = re.findall(reflection_regex, src)
                        for reflection in reflections:
                            reflection = "java.lang.reflect." + reflection # Specify the full name for formatting sakes
                            if reflection not in reflection_dict:
                                reflection_dict[reflection] = 1
                            else:
                                reflection_dict[reflection] += 1
                    
                    # General keyword analysis
                    if src:
                        for pattern in general_keywords:
                            keyword_usages_general[pattern] += len(re.findall(pattern, src))

            
    return keyword_usages_kotlin, reflection_dict, keyword_usages_general


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


def get_string_obfuscation(dx):
    """
    checks for a possible obfuscated code within string constants
    :param dx: Analysis object
    :return: a count of strings that have possible string obfuscation
    """
    code_sentinels = ['{', ';', 'void', '[', 'if (', 'while(', 'for(']
    possible_str_obfs_cnt = 0
    break_flag = False
    for string in dx.strings.keys():
        # count base64 encoded string constants as possible obfuscations
        if is_base64_encoded(string):
            possible_str_obfs_cnt += 1
            continue
        for sentinel in code_sentinels:
            if break_flag:
                break_flag = False
                break
            for _, method in dx.strings[string].get_xref_from():
                # excluding toString() methods to minimize false detection of string encrypted code
                if sentinel in string and method.name != "toString" or has_uncommon_chars(string):
                    # print(string)
                    # print("Class name: {} -- Method name: {}".format(method.class_name, method.name))
                    possible_str_obfs_cnt += 1
                    break_flag = True
                    break

    return possible_str_obfs_cnt


# Output formatting function
def format_sourcecode_dict(obfuscations_dict, obfuscations_histogram, kotlin_dict, reflection_dict, keyword_usages_general):
    sourcecode_features_dict = collections.OrderedDict()
    sourcecode_features_dict["Possible obfuscations"] = list(obfuscations_dict.items())
    sourcecode_features_dict.update(obfuscations_histogram)
    sourcecode_features_dict.update(kotlin_dict)
    sourcecode_features_dict.update(keyword_usages_general)
    sourcecode_features_dict["Reflection"] = [(key, reflection_dict[key]) for key in reflection_dict.keys()]
    return sourcecode_features_dict
