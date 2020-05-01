import re
import math
import collections
import logging

from androguard.core import bytecodes
from androguard.core import androconf


# parameters:
# d: list of dalvikVMformat objects
# dx: Analysis object 
def analyzeDex(d, dx):
    # Initialization
    # opcodes_dict = collections.OrderedDict()
    obfuscation_score = 0
    obfuscations_dict = collections.OrderedDict()
    # kotlin_dict = collections.OrderedDict()

    # Logic
    for dex in d:
        # opcodes_dict = get_opcodes(dex, opcodes_dict)
        obfuscation_score, obfuscations_dict = get_obfuscation_naming_total(dex, obfuscations_dict)
        # kotlin_dict["kotlin"] = get_kotlin_usage(dex)

    # print(opcodes_dict)
    print(obfuscations_dict)
    print(obfuscation_score)
    # print(kotlin_dict)


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


# Get number of (possible) obfuscated names
# We check for several common obfuscation techniques:
# 1) Check for keywords with < 4 characters
# 2) Check whether non ASCII characters are used
def get_obfuscation_naming_total(app, obfuscations_dict):
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
    return (obfuscation_score/total_evaluated), obfuscations_dict


def add_to_obfuscation_histogram(classname, obfuscations_dict):
    if len(classname) < 4:
        obfuscations_dict = add_to_dict_unique(classname, obfuscations_dict)
        return obfuscations_dict
    if androconf.is_ascii_problem(classname):
        obfuscations_dict = add_to_dict_unique(classname, obfuscations_dict)
    return obfuscations_dict


def obfuscation_evaluator(name):
    """
    evaluates if a given class name, field name or method name is obfuscated with single letter alphabets or non-ascii
    characters
    :param name:
    :return:
    """
    if androconf.is_ascii_problem(name):
        return 1
    name_len = len(name)
    return math.exp(1 - name_len)


def add_to_dict_unique(name, dictionary):
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
        print(mo)
        if mo is None: return total
        total += 1
        start = 1 + mo.start()


# We scan the source code for kotlin keyword usage
def get_kotlin_usage(app):
    key_patterns = [r'String v[\d]*_[\d] = new StringBuilder();$', r'\bkotlin\b', r'\b.kotlin\b']
    keyword_usages = {key_pattern: 0 for key_pattern in key_patterns}

    for cl in app.get_classes():
        src = cl.get_source()
        for key_pattern in key_patterns:
            keyword_usages[key_pattern] += count_overlapping_distinct(key_pattern, src)
    return keyword_usages


def print_feature_list(features):
    for feature in features:
        print(feature)

