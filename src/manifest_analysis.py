import collections

from androguard.core.analysis import analysis


# Features we want from the manifest file:
# Package-id, app components, intent filters, features used, trackers, ad-networks, Types of app components
def analyze_manifest(a):
    dict_manifest_features = collections.OrderedDict()

    # Package-name
    dict_manifest_features["package-name"] = a.get_package()

    # Permissions
    dict_manifest_features["permissions"] = a.get_permissions()

    # Used features
    dict_manifest_features["features"] = a.get_features()

    # Activities 
    dict_manifest_features["main-activities"] = a.get_main_activities()
    dict_manifest_features["activities"] = a.get_activities()

    # Services
    dict_manifest_features["services"] = a.get_services()

    # Receivers
    dict_manifest_features["receivers"] = a.get_receivers()

    # (Content) providers
    dict_manifest_features["providers"] = a.get_providers()

    # Intent filters
    dict_manifest_features = extract_intent_filters(a, dict_manifest_features)

    # Libraries
    dict_manifest_features["libraries"] = a.get_libraries()

    # Meta data

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