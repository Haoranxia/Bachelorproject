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
    dict_static_features["main-activity"] = a.get_main_activity()
    dict_static_features["activities"] = a.get_activities()

    # Services
    dict_static_features["services"] = a.get_services()

    # Receivers
    dict_static_features["receivers"] = a.get_receivers()

    # Intent filters
    extract_intent_filters(a, dict_static_features)
    print_featureList(dict_static_features["activity-intents"])
    print_featureList(dict_static_features["service-intents"])
    print_featureList(dict_static_features["receiver-intents"])
    
# Each type of parent item (activities, services, receivers) can have intent filters. Thus we loop over those and extract all intent filters
def extract_intent_filters(a, dict_static_features):
    # Activity intents
    dict_static_features["activity-intents"] = get_intents(a, dict_static_features["activities"], "activity")

    # Service intents
    dict_static_features["service-intents"] = get_intents(a, dict_static_features["services"], "service")

    # Receiver intents
    dict_static_features["receiver-intents"] = get_intents(a, dict_static_features["receivers"], "receiver")


# Returns a list of intents for the type of feature
def get_intents(a, components, componenttype):
    # intents = list()
    # for component in components:
    #     intent = a.get_intent_filters(componenttype, component)
    #     if not intent:
    #         intents.append(a.get_intent_filters(componenttype, component))

    # return intents
    return [a.get_intent_filters(componenttype, component) for component in components]

def print_featureList(features):
    for feature in features:
        print(feature)

