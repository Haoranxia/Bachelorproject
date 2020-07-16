import collections
import logging
import configparser

from util import get_full_header, create_complete_dict, write_to_csv, write_to_json, setup_logger
from androguard.core.analysis import analysis

# Logger
#manifest_logger = setup_logger("manifest_logger", "../log_files/manifest.log")
manifest_logger = logging.getLogger(__name__)
manifest_logger.setLevel(logging.INFO)
logging.basicConfig(filename='main.log', level=logging.INFO)


# Settings
config = configparser.ConfigParser()
config.read("../settings.ini")
enable_csv = (config["Output_Format"]["CSV"] == "yes")

def analyze_manifest(a):
    """
    The main function that handles manifest file feature extraction. 
    We extract the most popular/often used features from the android manifest file.
    :param a: Androguard.APK object
    """
    dict_manifest_features = {}

    # Package-name
    try:
        dict_manifest_features["package-name"] = a.get_package()
    except Exception:
        manifest_logger.warning("Could not extract package name")

    # Permissions
    try:
        dict_manifest_features["permissions"] = a.get_permissions()
    except Exception:
        manifest_logger.warning("Could not extract permissions")

    # Used features
    try:
        dict_manifest_features["features"] = a.get_features()
    except Exception:
        manifest_logger.warning("Could not extract used features")

    # Activities 
    try:
        dict_manifest_features["main-activities"] = a.get_main_activities()
    except Exception:
        manifest_logger.warning("Could not extract main activities")
    
    try:
        dict_manifest_features["activities"] = a.get_activities()
    except Exception:
        manifest_logger.warning("Could not extract activities")

    # Services
    try:
        dict_manifest_features["services"] = a.get_services()
    except Exception:
        manifest_logger.warning("Could not extract services")

    # Receivers
    try:
        dict_manifest_features["receivers"] = a.get_receivers()
    except Exception:
        manifest_logger.warning("Could not extract receivers")

    # (Content) providers
    try:
        dict_manifest_features["providers"] = a.get_providers()
    except Exception:
        manifest_logger.warning("Could not extract providers")

    # Intent filters
    try:
        dict_manifest_features = extract_intent_filters(a, dict_manifest_features)
    except Exception:
        manifest_logger.warning("Could not extract all intent filters")

    # Libraries
    try:
        dict_manifest_features["libraries"] = a.get_libraries()
    except Exception:
        manifest_logger.warning("Could not extract libraries")

    # Write collected data to CSV
    write_output(dict_manifest_features)

    manifest_logger.info("Finished extracting manifest features for apk: " + a.get_package())
    return 
    

def write_output(manifest_dict):

    # Initialization
    permissions_header, permissions_dict = get_feature(manifest_dict, "permissions", "../resources/permissions.txt")
    hardware_header, hardware_dict = get_feature(manifest_dict, "features", "../resources/hardware_features.txt")
    software_header, software_dict = get_feature(manifest_dict, "features", "../resources/software_features.txt")

    if enable_csv:
        # Output CSV files
        manifestcsv = "../output/static_out/manifest_features.csv"
        permissionscsv = "../output/static_out/permissions.csv"
        hardwarefeaturescsv = "../output/static_out/hardware_features.csv"
        softwarefeaturescsv = "../output/static_out/software_features.csv"

        write_to_csv(manifestcsv, manifest_dict)
        write_to_csv(permissionscsv, permissions_dict, header=permissions_header)
        write_to_csv(hardwarefeaturescsv, hardware_dict, header=hardware_header)
        write_to_csv(softwarefeaturescsv, software_dict, header=software_header)

    return 


def get_feature(manifest_dict, dictkey, headerfile):
    feature = manifest_dict[dictkey]
    feature_header = get_full_header(headerfile)
    feature_dict = create_complete_dict(feature, feature_header, manifest_dict["package-name"])
    return feature_header, feature_dict


# Each type of parent item (activities, services, receivers) can have intent filters. Thus we loop over those and
# extract all intent filters
def extract_intent_filters(a, dict_manifest_features):
    # Activity intents
    dict_manifest_features["activity-intents"] = get_intents(a, dict_manifest_features["activities"], "activity")

    # Service intents
    dict_manifest_features["service-intents"] = get_intents(a, dict_manifest_features["services"], "service")

    # Receiver intents
    dict_manifest_features["receiver-intents"] = get_intents(a, dict_manifest_features["receivers"], "receiver")

    return dict_manifest_features


# Returns a list of intents for the type of feature
def get_intents(a, components, componenttype):
    intents = list()
    for component in components:
        intent = a.get_intent_filters(componenttype, component)
        if intent:
            intents.append(intent)

    return intents


def print_feature_list(features):
    for feature in features:
        print(feature)