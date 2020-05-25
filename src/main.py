import sys
import argparse
import configparser
import collections
from os import listdir
from os.path import isfile, join

from androguard.core.bytecodes import dvm, apk
from androguard.misc import AnalyzeAPK
from androguard.decompiler.dad.graph import logger as glogger
from androguard.decompiler.dad.decompile import logger as dlogger
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD
from androguard.decompiler.decompiler import DecompilerJADX

from util import *
from sourcecode_analysis import analyze_dex
from manifest_analysis import analyze_manifest
from contextual_feat_extraction import run_contextual


# CSV initialization (Relative path to this file)
manifestcsv = "../static_out/manifest_features.csv"
permissionscsv = "../static_out/permissions.csv"
hardwarefeaturescsv = "../static_out/hardwarefeatures.csv"
softwarefeaturescsv = "../static_out/softwarefeatures.csv"
sourcecodecsv = "../static_out/sourcecode_features.csv"
opcodescsv = "../static_out/sourcecode_opcodes.csv"


# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")


enable_contextual = (config["Settings"]["Contextual"] == "yes")
enable_manifest = (config["Settings"]["Manifest"] == "yes")
enable_sourcecode = (config["Settings"]["Sourcecode"] == "yes")
enable_logger = (config["Misc"]["Uselogger"] == "yes")
enable_progresstracker = (config["Misc"]["Progresstracker"] == "yes")


# Progress tracking stuff
processed_apks = None
processed_apks_file = "./processedapks.txt"
if enable_progresstracker:
    processed_apks = get_processed_apks(processed_apks_file)


def main():
    """
    a : APK object; We can obtain all information about the APK here (manifest file stuff)
    d : array of DalvikVMFormat objects; Corresponds to the DEX file. We can obtain classes, methods, strings etc.
        from here. The array contains a d object for each dex file found in the apk
    dx : Analysis object; Contains special classes, which link information about classes.dex and can handle multiple
        dex files meaning that it contains information about all the dex files in the apk
    :return:
    """
    # Argument parsing
    apk_files = parse_arguments()

    for apk_file in apk_files:
        a = apk.APK(apk_file)

        # If the progresstracker is enabled we do not want to process any already processed apks
        processed = False
        if enable_progresstracker:
            if alreadyProcessed(a.get_package(), processed_apks):
                processed = True
        
        if not processed:
            # Contextual features
            if enable_contextual:
                print("Running contextual")
                run_contextual(apk_file=apk_file, app_id=a.get_package())

            # Manifest features
            if enable_manifest:
                print("Running manifest")
                process_manifest(a)

            # Source code features
            if enable_sourcecode:
                print("Running sourcecode")
                process_sourcecode(a)
            
            # Log processed APK
            if enable_progresstracker:
                print("Updating progresstracker file")
                with open(processed_apks_file, 'a') as f:
                    f.write(a.get_package() + '\n')
                    f.close()

    print("Finished")
        

def init_args_parser():
    """
    initializes program argument parser
    either the folder containing APKs or the apk file itself is specified
    :return:
    """
    parser = argparse.ArgumentParser(description='Process program input (and output)')
    group = parser.add_mutually_exclusive_group(required=True)
    group.add_argument('-s', '--sourceFoldr', help='Source folder containing apk files')
    group.add_argument('-sAPK', '--sourceAPK', help='Source apk file')
    # parser.add_argument('-o', '--outputDir', help='Output folder for extracted feature', required=False)
    return parser.parse_args()


def parse_arguments():
    """
    parses command line arguments for the path of the source folder or the apk file
    :return: list of apk file(s) with their relative file path(s)
    """
    args = init_args_parser()
    apk_folder = args.sourceFoldr     # example. apk_folder = "apks/"
    apk_file = args.sourceAPK         # example. apk_file   = "apks/flashlight.apk"
    apk_files = []

    if apk_folder:
        # if an apk folder is specified
        apk_files = [join(apk_folder, file) for file in listdir(apk_folder) if isfile(join(apk_folder, file)) and
                     file.endswith(".apk")]
    else:
        # if an apk file is specified instead of the folder
        apk_files.append(apk_file)
    return apk_files


# Helper functions
def process_manifest(a):
    manifest_dict = analyze_manifest(a)
    write_to_csv(manifestcsv, manifest_dict)

    permissions_header, permissions_dict = get_feature(manifest_dict, "permissions", "../resources/permissions.txt")
    write_to_csv(permissionscsv, permissions_dict, header=permissions_header)

    hardware_header, hardware_dict = get_feature(manifest_dict, "features", "../resources/hardware_features.txt")
    write_to_csv(hardwarefeaturescsv, hardware_dict, header=hardware_header)

    software_header, software_dict = get_feature(manifest_dict, "features", "../resources/software_features.txt")
    write_to_csv(softwarefeaturescsv, software_dict, header=software_header)


def get_feature(manifest_dict, dictkey, headerfile):
    feature = manifest_dict[dictkey]
    feature_header = get_full_header(headerfile)
    feature_dict = create_complete_dict(feature, feature_header, manifest_dict["package-name"])
    return feature_header, feature_dict


def process_sourcecode(a):
    # FIXME Disabled glogger due to "Multiple exit nodes error" in androguard. This seems to be a bug related to
    # the androguard framework so we can't do much about it
    glogger.disabled = True

    # Create the d (DalvikVMFormat object) for each dex, and dx (Analysis object) 
    # for all dex files for sourcecode analysis
    ds = [dvm.DalvikVMFormat(dex) for dex in a.get_all_dex()]
    dx = Analysis()

    for d in ds:
        dx.add(d)

    for d in ds:
        # TODO use JADX instead of DAD because DAD might have issues with decompiling certain sections of code
        decompiler = DecompilerDAD(d, dx)
        d.set_decompiler(decompiler)

    opcodes_dict, sourcecode_dict = analyze_dex(ds, dx)

    glogger.enabled = True

    # Output formatting
    opcodes_header = get_full_header("../resources/opcodes.txt")
    opcodes_dict = create_complete_dict(opcodes_dict, opcodes_header, a.get_package(), frequency=True)

    sourcecode_header = format_sourcecode_header(sourcecode_dict)
    sourcecode_dict = format_sourcecode_dict(sourcecode_header, sourcecode_dict, a.get_package())
   
    write_to_csv(opcodescsv, opcodes_dict, header=opcodes_header)
    write_to_csv(sourcecodecsv, sourcecode_dict, header=sourcecode_header)


def format_sourcecode_header(sourcecode_dict):
    # Header: [pkg-name, obfuscationslist, 1-length obfs, 2-length obfs, 3-length obfs, kotlin1, kotlin2, kotlin3, kotlin4, reflection]
    header = ["package-name"]
    header.extend(sourcecode_dict.keys())
    return header


def format_sourcecode_dict(header, sourcecode_dict, package_name):
    sourcecode_dict["package-name"] = package_name
    return {key: sourcecode_dict[key] for key in header}
 

if __name__ == '__main__':
    main()
