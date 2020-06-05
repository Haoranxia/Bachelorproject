import collections
import logging

from androguard.core.analysis import analysis

# Logger
manifest_logger = logging.getLogger()
manifest_logger.setLevel(logging.INFO)

# Features we want from the manifest file:
# Package-id, app components, intent filters, features used, trackers, ad-networks, Types of app components
def analyze_manifest(a):
    dict_manifest_features = collections.OrderedDict()

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

    # TODO Meta data
    # meta_data = list()
    # meta_data.append(a.get_attribute_value("meta-data", "android:name"))
    # meta_data.append(a.get_attribute_value("meta-data", "android:value"))
    # meta_data.append(a.get_attribute_value("meta-data", "android:resource"))
    # dict_manifest_features["meta-data"] = meta_data
    
    return dict_manifest_features
    

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