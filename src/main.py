import sys
import argparse
import configparser
import collections
import logging
import time
import matplotlib.pyplot as plt
import networkx as nx
from pathlib import Path

from zipfile import BadZipFile
from os import listdir
from os.path import isfile, join
from androguard.core.bytecodes import dvm, apk, axml
from androguard.misc import AnalyzeAPK
from androguard.decompiler.dad.graph import logger as glogger
from androguard.decompiler.dad.decompile import logger as dlogger
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD
from androguard.decompiler.decompiler import DecompilerJADX

from util import *
from fernflower_decompile import run_fernflower_decompile
from sourcecode_analysis import analyze_dex
from manifest_analysis import analyze_manifest
from contextual_feat_extraction import run_contextual

# Logger
main_logger = logging.getLogger()
main_logger.setLevel(logging.INFO)
logging.basicConfig(filename='main.log', level=logging.INFO)

# CSV output files (Relative path to this file)
manifestcsv = "../static_out/manifest_features.csv"
permissionscsv = "../static_out/permissions.csv"
hardwarefeaturescsv = "../static_out/hardware_features.csv"
softwarefeaturescsv = "../static_out/software_features.csv"
sourcecodecsv = "../static_out/sourcecode_features.csv"
apimethodscsv = "../static_out/api_method_features.csv"
stringconstcsv = "../static_out/string_constant_features.csv"
opcodescsv = "../static_out/sourcecode_opcodes.csv"
fernflowercsv = "../static_out/fernflower_features.csv"

# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")
enable_contextual = (config["Settings"]["Contextual"] == "yes")
enable_manifest = (config["Settings"]["Manifest"] == "yes")
enable_sourcecode = (config["Settings"]["Sourcecode"] == "yes")
enable_progresstracker = (config["Misc"]["Progresstracker"] == "yes")
enable_fernflower = (config["Settings"]["Fernflower"] == "yes")
enable_xrefgraph = (config["Settings"]["Xrefgraph"] == "yes")
enable_performancelogging = (config["Settings"]["Performancelogging"] == "yes")


# Progress tracking stuff
processed_apks = None
processed_apks_file = "../resources/processedapks.txt"
if not isfile(processed_apks_file):
    open(processed_apks_file, "w+")
if enable_progresstracker:
    processed_apks = get_processed_apks(processed_apks_file)


# TODOLIST
# TODO: Check kotlin patterns (ask supervisor)
# TODO: Perhaps change logger output
# TODO: Test benign dataset
# TODO: Test malware dataset
# TODO: Compare results between benign/malware
# TODO: Obtain statistics from output (benign/malware)
# TODO: Compare results between fernflower/DAD
# TODO: Possibly write classification algorithms for our obtained results

def main():
    # Argument parsing
    apk_files = parse_arguments()

    start_time = time.time()
    totaltime = 0

    nrapks = len(apk_files)
    for apk_index, apk_file in enumerate(apk_files):
        print("Processing apk: " + str(apk_index) + " out of " + str(nrapks) + " apks")

        # Try to inspect/parse the APK
        try:
            a = inspect_APK(apk_file)
        except Exception:
            update_progresstracker(apk_file)
            continue

        # If the progresstracker is enabled we do not want to process any already processed apks
        processed = False
        if enable_progresstracker and a:
            if alreadyProcessed(path_leaf(apk_file), processed_apks):
                processed = True

        if not processed and a:
            main_logger.info("Processing apk: " + a.get_package() + " || file: " + apk_file)

            # Contextual features
            if enable_contextual:
                main_logger.info("Running contextual")
                run_contextual(apk_file=apk_file, app_id=a.get_package())

            # Manifest features
            if enable_manifest:
                main_logger.info("Running manifest")
                process_manifest(a)

            # Source code features
            if enable_sourcecode:
                main_logger.info("Running sourcecode")
                process_sourcecode(a)

            # Source code features using fernflower decompiler
            if enable_fernflower:
                main_logger.info("Running fernflower decompilation")
                process_fernflower(a.get_package(), apk_file)

            # Log processed APK
            if enable_progresstracker:
                main_logger.info("Updating progresstracker file")
                update_progresstracker(apk_file)

            # Measure time elapsed for each apk
            current_time = time.time()
            process_time = current_time - start_time
            start_time = current_time
            totaltime += process_time

            # Log elapsed time and size per apk
            if enable_performancelogging:
                logtime(a.get_package(), process_time, Path(apk_file).stat().st_size)

            main_logger.info("Total time spent on this apk: " + str(process_time) + "\n")
        else:
            main_logger.info("apk already processed... skipping...")

    main_logger.info("Finished analysis of apks")
    main_logger.info("Total executiontime: " + str(totaltime))


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
    """
    This function processes the extracted information from the manifest file
    :param a: Analysis object from androguard
    :return:
    """
    # Main manifest features
    manifest_dict = analyze_manifest(a)
    write_to_csv(manifestcsv, manifest_dict)

    # Permissions
    permissions_header, permissions_dict = get_feature(manifest_dict, "permissions", "../resources/permissions.txt")
    write_to_csv(permissionscsv, permissions_dict, header=permissions_header)

    # Hardware features
    hardware_header, hardware_dict = get_feature(manifest_dict, "features", "../resources/hardware_features.txt")
    write_to_csv(hardwarefeaturescsv, hardware_dict, header=hardware_header)

    # Software features
    software_header, software_dict = get_feature(manifest_dict, "features", "../resources/software_features.txt")
    write_to_csv(softwarefeaturescsv, software_dict, header=software_header)


def process_sourcecode(a):
    """
    This function constructs the relevant objects for sourcecode analysis using androguard.
    After construction we extract the features we want and process them accordingly.
    :param a: Analysis object from androguard
    """
    # FIXME glogger disables the "multiple exit nodes found" prints (androguard issue/bug)
    glogger.disabled = True

    # FIXME dlogger disables the "Error decompiling method class <object>" message. 
    # It seems like DAD has issues with decompiling some apks and will then show this message
    dlogger.disabled = True

    # Create the d (DalvikVMFormat object) for each dex, and dx (Analysis object) 
    # for all dex files for sourcecode analysis
    ds = [dvm.DalvikVMFormat(dex, using_api=a.get_target_sdk_version()) for dex in a.get_all_dex()]
    dx = Analysis()

    for d in ds:
        dx.add(d)

    for d in ds:
        # NOTE: We use the DAD decompiler (build-in androguard decompiler). Another option would be JADX
        # However, JADX stops decompiling when it encounters a problem (which happens quite often with obfuscated apks)
        decompiler = DecompilerDAD(d, dx)
        d.set_decompiler(decompiler)

    try:
        dx.create_xref()
        if enable_xrefgraph:
            construct_xrefgraph(a, dx)
    except Exception:
        main_logger.warning("Could not create xrefs properly")

    start_time = time.time()

    opcodes_dict, sourcecode_dict, api_methods_dict, string_constants, possible_str_obfs_cnt = analyze_dex(ds, dx)
    glogger.enabled = True
    dlogger.enabled = True

    current_time = time.time()
    main_logger.info("Apk: " + a.get_package() + " || Time spent on analysis: " + str(current_time - start_time))

    # Output formatting
    opcodes_header = get_full_header("../resources/opcodes.txt")
    opcodes_dict = create_complete_dict(opcodes_dict, opcodes_header, a.get_package(), frequency=True)

    sourcecode_dict = format_sourcecode_dict(sourcecode_dict, a.get_package())
    api_methods_dict = format_api_dict(api_methods_dict, a.get_package())
    string_constants_dict = format_string_constants_dict(string_constants, possible_str_obfs_cnt, a.get_package())

    write_to_csv(opcodescsv, opcodes_dict, header=opcodes_header)
    write_to_csv(sourcecodecsv, sourcecode_dict)
    write_to_csv(apimethodscsv, api_methods_dict)
    write_to_csv(stringconstcsv, string_constants_dict)


def format_sourcecode_dict(sourcecode_dict, package_name):
    return_dict = collections.OrderedDict()
    return_dict["package-name"] = package_name
    return_dict.update(sourcecode_dict)
    return return_dict


def format_api_dict(api_methods_dict, package_name):
    return_dict = {'package-name': package_name, 'api-methods': api_methods_dict}
    return return_dict


def format_string_constants_dict(string_constants, possible_str_obfs_cnt, package_name):
    return {'package-name': package_name, 'possible_str_obfs_cnt': possible_str_obfs_cnt,
            'string-constants': string_constants}


def process_fernflower(package_name, apk_file):
    """
    This function formats the output that is obtained by running the fernflower decompiler and extracting our features.
    :param package_name: The package name/package id of the apk
    :param apk_file: the path to the to be analyzed apk file
    """
    start_time = time.time()
    imports_dict, compile_error_count, reflection_dict = run_fernflower_decompile(package_name, apk_file)
    finish_time = time.time()
    main_logger.info("Time spent on feature extraction (fernflower): " + str(finish_time - start_time))

    # Output formatting
    fernflower_dict = collections.OrderedDict()
    fernflower_dict["package-name"] = package_name
    fernflower_dict["imports"] = list(imports_dict.items())
    fernflower_dict["compile-error count"] = compile_error_count
    fernflower_dict["reflection usage"] = list(reflection_dict.items())
    write_to_csv(fernflowercsv, fernflower_dict)


def inspect_APK(apk_file):
    try:
        a = apk.APK(apk_file)
        return a
    except BadZipFile as bzfe:
        main_logger.warning("Could not process apk: " + path_leaf(apk_file) + " ...Is it actually an APK?\n")
        raise(bzfe)
    except FileNotFoundError as fnfe:
        main_logger.warning("Could not find apk: " + path_leaf(apk_file) + " ...Is it actually there?\n")
        raise(fnfe)
    except axml.ResParserError as rpe:
        main_logger.warning("Could not decode APK properly: " + path_leaf(apk_file) + "\n")
        raise(rpe)
    except Exception as e:
        main_logger.warning("Something went wrong with parsing the APK: " + path_leaf(apk_file) + "\n")
        raise(e)


def update_progresstracker(apk_file):
    # with open(processed_apks_file, 'a') as f:
        #     f.write(a.get_package() + '\n')
        #     f.close()

    with open(processed_apks_file, 'a') as f:
        f.write(path_leaf(apk_file) + '\n')
        f.close()


def logtime(apk_name, process_time, apk_size):
    filename = "../static_out/performance.csv"
    time_dict = collections.OrderedDict()
    time_dict["package-name"] = apk_name
    time_dict["process-time (sec)"] = process_time
    time_dict["apk size (KB)"] = float(apk_size) / float(1000)
    write_to_csv(filename, time_dict)
    

# TODO: Implement xref graph
# NOTE: Quite performance heavy
def construct_xrefgraph(a, dx):
    # We only construct a xref graph for the MainActivity component
    print("Drawing xrefgraph")
    callgraph = Analysis.get_call_graph(self=a, classname=r"(.*)MainActivity(.*)")
    nx.draw_networkx(callgraph)
    plt.draw()
    plt.show()


if __name__ == '__main__':
    main()
