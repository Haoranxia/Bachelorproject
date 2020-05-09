import re
import math
import collections
import logging

from androguard.core import bytecodes
from androguard.core import androconf


# TODO: Look for common obfuscation techniques and pattern match for that
# TODO: Look for more kotlin code patterns and pattern match for that
def analyze_dex(d, dx):
    """
    analyze Dex file
    :param d: list of dalvikVMformat objects
    :param dx: Analysis object
    :return:
    """
    # Initialization
    opcodes_dict = collections.OrderedDict()
    obfuscation_score = 0
    obfuscations_dict = collections.OrderedDict()
    kotlin_dict = collections.OrderedDict()
    reflection_dict = collections.OrderedDict()

    # Logic
    for dex in d:
        opcodes_dict = get_opcodes(dex, opcodes_dict)
        obfuscation_score, obfuscations_dict = get_obfuscation_naming_total(dex, obfuscations_dict)
        kotlin_dict, reflection_dict = get_keyword_usage(dex)

    obfuscations_dict["obfuscation-score"] = obfuscation_score

    # Merge dictionaries
    opcodes_dict.update(obfuscations_dict).update(kotlin_dict).update(reflection_dict)
    return opcodes_dict


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
    for c in app.get_classes():
        total_evaluated += 1
        obfuscations_dict = add_to_obfuscation_histogram(c.get_name(), obfuscations_dict)
        obfuscation_score += obfuscation_evaluator(c.get_name())

        for field in c.get_fields():
            total_evaluated += 1
            add_to_obfuscation_histogram(field.get_name(), obfuscations_dict)
            obfuscation_score += obfuscation_evaluator(field.get_name())

        for method in c.get_methods():
            total_evaluated += 1
            add_to_obfuscation_histogram(method.get_name(), obfuscations_dict)
            obfuscation_score += obfuscation_evaluator(method.get_name())
    return (obfuscation_score / total_evaluated), obfuscations_dict


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


def get_keyword_usage(app):
    """
    Scan the source code for kotlin keyword/pattern usage
    :param app: app containing the source code
    :return:
    """
    key_patterns_kotlin = [r'String v[\d]*_[\d] = new StringBuilder();$', r'\bkotlin\b', r'\b.kotlin\b', r'@NotNull']
    keyword_usages_kotlin = {key_pattern: 0 for key_pattern in key_patterns_kotlin}

    key_patterns_reflection = [r'java.lang.reflect']
    keyword_usages_reflection = {key_pattern: 0 for key_pattern in key_patterns_reflection}

    for cl in app.get_classes():
        src = cl.get_source()

        # Kotlin keyword analysis
        for key_pattern in key_patterns_kotlin:
            keyword_usages_kotlin[key_pattern] += count_overlapping_distinct(key_pattern, src)

        # Java reflection usage analysis
        for key_pattern in key_patterns_reflection:
            keyword_usages_reflection[key_pattern] += src.count(key_pattern)
            
    return keyword_usages_kotlin, keyword_usages_reflection


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
    code_sentinels = ['{', ';', 'void', '[', 'if (', 'while(', 'for(']  # <- TODO:: MAKE THESE REGEX
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


def print_feature_list(features):
    for feature in features:
        print(feature)
