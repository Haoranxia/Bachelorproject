import csv
import json
import play_scraper


def write_to_csv(filename, app_details):
    """
    Writes contextual data to csv file, creates the file if it does not exist
    :param filename: the csv file destination
    :param app_details: the contextual features dictionary
    :return:
    """
    file = open(filename + ".csv", 'w+')
    with file:
        writer = csv.DictWriter(file, fieldnames=app_details.keys())
        writer.writeheader()
        writer.writerow(app_details)


def format_dictionary(app_details):
    """
    format the order of dictionary to have package id (pkgname) as the first column and
    insert escaping for new lines
    :param app_details: a dictionary that contains the contextual features
    :return:
    """
    print(app_details)
    updated_dict = {"pkgname": app_details["app_id"]}
    del app_details["app_id"]
    updated_dict.update(app_details)
    for key, val in updated_dict.items():
        key.encode('utf-8')
        if isinstance(val, str):
            val.encode('utf-8')
            updated_dict[key] = val.replace('\n', '\\n')
    return updated_dict


def write_to_json(filename, app_details):
    """
    writes contextual features to a json file, creates the file if it does not exist
    :param filename: the filename to write dictionary to
    :param app_details: the contextual features as a dictionary
    :return:
    """
    # print(app_details)
    app_details['description_html'] = ""  # TODO :: fix encoding issue of html into json formatting
    dictionary_json = json.dumps(app_details)
    f = open(filename + '.json', "w+", encoding='utf-8')
    f.write(dictionary_json)
    f.close()


def run():
    app_id = 'com.whatsapp'
    filename = 'contextual_features_whatsapp'  # no need to specify filename extension
    app_details = play_scraper.details(app_id)
    formatted_app_details = format_dictionary(app_details)
    write_to_csv(filename, formatted_app_details)
    write_to_json(filename, formatted_app_details)


# main()
