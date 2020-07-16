import configparser
import logging
import sys 

from Sourcecode.keyword_extraction import run_keyword_extraction
from Sourcecode.obfuscation_extraction import run_obfuscation_extraction
from Sourcecode.opcodes_extraction import run_opcodes_extraction

# add paths
sys.path.append("../util.py")
from util import get_full_header, write_to_csv, create_complete_dict, write_to_json


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
enable_string_constants = (config["Sourcecode_Settings"]["StringConstants"] == "yes")
enable_string_obfuscations = (config["Sourcecode_Settings"]["StringObfuscations"] == "yes")
enable_api_methods = (config["Sourcecode_Settings"]["APIMethods"] == "yes")


def analyze_dex(a, ds, dx):
    """
    analyze Dex file
    :param ds: list of dalvikVMformat objects
    :param dx: Analysis object
    :return:
    """
    # Initialization
    package_name = a.get_package()

    # Get Opcodes
    if enable_opcodes:
        run_opcodes_extraction(package_name, ds, sourcecode_logger)
        
    # Get obfuscations
    if enable_obfuscation:
        run_obfuscation_extraction(package_name, ds, sourcecode_logger)
   
    # Get keywords
    if enable_keywordusage:
        run_keyword_extraction(package_name, dx, sourcecode_logger)
    
