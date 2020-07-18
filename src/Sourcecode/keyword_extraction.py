import collections
import configparser
import re
import sys
import time
from androguard.core import bytecodes

sys.path.append("../util.py")
from util import write_to_csv, write_to_json


config = configparser.ConfigParser()
config.read("../settings.ini")

enable_keywordusage = (config["Sourcecode_Settings"]["Keywordusage"] == "yes")
enable_kotlin = (config["Sourcecode_Settings"]["Kotlin"] == "yes")
enable_reflection = (config["Sourcecode_Settings"]["Reflection"] == "yes")
enable_commonkeywords = (config["Sourcecode_Settings"]["Commonkeywords"] == "yes")
csv_enabled = (config["Output_Format"]['CSV'] == 'yes')
json_enabled = (config["Output_Format"]['JSON'] == 'yes')

def run_keyword_extraction(package_name, app, sourcecode_logger):
    kotlin_dict = {}
    reflection_dict = {}
    keyword_usages_general = {}

    try:
        start_time = time.time()
        kotlin_dict, reflection_dict, keyword_usages_general = get_keyword_usage(app, sourcecode_logger)
        current_time = time.time()
        sourcecode_logger.info("Time spent on keyword usage: " + str(current_time - start_time))
        write_output(package_name, kotlin_dict, reflection_dict, keyword_usages_general)
    except Exception as e:
        sourcecode_logger.error("Keyword extraction failed: " + str(e))


def get_keyword_usage(app, sourcecode_logger):
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
    reflection_dict = {}

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
                    if isinstance(src, bytes):
                        src = src.decode('utf-8')

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


def write_output(package_name, kotlin_dict, reflection_dict, keyword_usages_general):
    keywordcsv = "../output/static_out/keyword_features.csv"
    keywordjson = "../output/static_out/keyword_features.json"
    outputdict = {"package-name": package_name, "Reflection uses": reflection_dict}
    outputdict.update(kotlin_dict)
    outputdict.update(keyword_usages_general)

    if csv_enabled:
        write_to_csv(keywordcsv, outputdict)
    
    if json_enabled:
        write_to_json(keywordjson, outputdict)