import collections

from androguard.core.analysis import analysis

# Features we want from the manifest file:
# Package-id, app components, intent filters, features used, trackers, ad-networks, Types of app components 

def analyzeManifest(a):
    dict_static_features = collections.OrderedDict()

    # Package-id
    dict_static_features["package-name"] = a.get_package()

    # Permissions
    dict_static_features["permissions"] = a.get_permissions()

    # Used features
    dict_static_features["features"] = a.get_features()

    # Activities 
    dict_static_features["main-activities"] = a.get_main_activities()
    dict_static_features["activities"] = a.get_activities()

    # Services
    dict_static_features["services"] = a.get_services()

    # Receivers
    dict_static_features["receivers"] = a.get_receivers()

    # (Content) providers
    dict_static_features["providers"] = a.get_providers()

    # Intent filters
    dict_static_features = extract_intent_filters(a, dict_static_features)

    # Libraries
    dict_static_features["libraries"] = a.get_libraries()

    # Ad networks

    # Trackers

    # Print
    # print(dict_static_features["activity-intents"])
    # print(dict_static_features["service-intents"])
    # print(dict_static_features["receiver-intents"])
    print(dict_static_features["providers"])
    print(dict_static_features["libraries"])
    
# Each type of parent item (activities, services, receivers) can have intent filters. Thus we loop over those and extract all intent filters
def extract_intent_filters(a, dict_static_features):
    # Activity intents
    dict_static_features["activity-intents"] = get_intents(a, dict_static_features["activities"], "activity")

    # Service intents
    dict_static_features["service-intents"] = get_intents(a, dict_static_features["services"], "service")

    # Receiver intents
    dict_static_features["receiver-intents"] = get_intents(a, dict_static_features["receivers"], "receiver")

    return dict_static_features


# Returns a list of intents for the type of feature
def get_intents(a, components, componenttype):
    intents = list()
    for component in components:
        intent = a.get_intent_filters(componenttype, component)
        if intent:
            intents.append(intent)

    return intents


def print_featureList(features):
    for feature in features:
        print(feature)

