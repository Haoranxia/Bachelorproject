import sys, re, codecs
from bs4 import BeautifulSoup
from html.parser import HTMLParser
from os import path

"""
This is a simple script that extracts a list of permissions and hardware/software features 
from the android developers guide html page. These lists will be used by default for their 
respective manifest feature csvs. 
"""
# https://developer.android.com/reference/android/Manifest.permission
# https://developer.android.com/guide/topics/manifest/uses-feature-element#features-reference

permissions_regex = r'<span class="devsite-nav-text" tooltip="">(.*?)</span>'
permissions_path = "./permissions_table.txt"

hardware_regex = r'<span>android.hardware.(.*?)</span>'
hardwarefeatures_path = "./features.txt"

software_regex = r'<span>android.software.(.*?)</span>'
softwarefeatures_path = "./features.txt"

def extractfeatures(filepath, regex):
    with open(filepath, 'rb') as f:
        src = f.read().decode('utf-8')
        features = re.findall(regex, src)
        return features


def write_to_file(file, data):
    with open(file, 'w') as f:
        for item in data:
            f.write(item + "\n")


def format_featurelist(prepend_string, featurelist):
    for i, item in enumerate(featurelist):
        featurelist[i] = str(prepend_string + item)


permissions = extractfeatures(permissions_path, permissions_regex)
permissions.pop(0) # Get rid of the 'Constants' element. (This is not a permission)
format_featurelist("android.permission.", permissions)

hardwarefeatures = extractfeatures(hardwarefeatures_path, hardware_regex)
format_featurelist("android.hardware.", hardwarefeatures)

softwarefeatures = extractfeatures(softwarefeatures_path, software_regex)
format_featurelist("android.software.", softwarefeatures)

write_to_file("./permissions.txt", permissions)
write_to_file("./hardware_features.txt", hardwarefeatures)
write_to_file("./software_features.txt", softwarefeatures)



