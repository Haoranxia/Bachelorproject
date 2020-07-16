import configparser
import logging
import sys

from Sourcecode.keyword_extraction import run_keyword_extraction
from Sourcecode.obfuscation_extraction import run_obfuscation_extraction
from Sourcecode.opcodes_extraction import run_opcodes_extraction
from Sourcecode.api_methods import run_api_methods_extraction
from Sourcecode.string_constants import run_string_constants_extraction

from util import get_full_header, write_to_csv, create_complete_dict, write_to_json, add_to_dict_unique

sys.path.append("../util.py")
from util import get_full_header, write_to_csv, create_complete_dict, write_to_json, setup_logger


# Logger
#sourcecode_logger = setup_logger("sourcecode_logger", "../log_files/sourcecode.log")
sourcecode_logger = logging.getLogger(__name__)
sourcecode_logger.setLevel(logging.INFO)
logging.basicConfig(filename='main.log', level=logging.INFO)

# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")

enable_opcodes = (config["Sourcecode_Settings"]["Opcodes"] == "yes")
enable_obfuscation = (config["Sourcecode_Settings"]["Obfuscation"] == "yes")
enable_keywordusage = (config["Sourcecode_Settings"]["Keywordusage"] == "yes")
enable_api_methods = (config["Sourcecode_Settings"]["APIMethods"] == "yes")
enable_string_constants = (config["Sourcecode_Settings"]["StringConstants"] == "yes")
enable_string_obfuscations = (config["Sourcecode_Settings"]["StringObfuscations"] == "yes")


def analyze_dex(a, ds, dx):
    """
    This function analyzes Dex files and extract the enabled features from it
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

    # Get API methods
    if enable_api_methods:
        run_api_methods_extraction(dx, package_name, sourcecode_logger)

    # Get string constants and obfuscation
    if enable_string_constants or enable_string_obfuscations:
        run_string_constants_extraction(dx, package_name, sourcecode_logger)