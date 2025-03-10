import time
import logging
import argparse
import configparser
from pathlib import Path

from os import listdir, stat
from zipfile import BadZipFile
from os.path import isfile, join
from androguard.core.bytecodes import dvm, apk, axml
from androguard.decompiler.dad.graph import logger as glogger
from androguard.decompiler.dad.decompile import logger as dlogger
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD

from util import *
from Sourcecode.sourcecode_analysis import run_sourcecode
from Manifest.manifest_analysis import process_manifest
from Fernflower.fernflower_decompile import run_fernflower_decompile
from Contextual.contextual_feat_extraction import run_contextual


# Creating Logger
main_logger = logging.getLogger()
main_logger.setLevel(logging.INFO)
logging.basicConfig(filename='main.log', level=logging.INFO)

# Config file parsing
config = configparser.ConfigParser()
config.read("../settings.ini")
enable_contextual = (config["Settings"]["Contextual"] == "yes")
enable_manifest = (config["Settings"]["Manifest"] == "yes")
enable_sourcecode = (config["Settings"]["Sourcecode"] == "yes")
enable_progresstracker = (config["Misc"]["Progresstracker"] == "yes")
enable_fernflower = (config["Settings"]["Fernflower"] == "yes")
enable_performancelogging = (config["Settings"]["Performancelogging"] == "yes")

# Progress tracking
processed_apks = None
processed_apks_file = "../resources/processedapks.txt"
if not isfile(processed_apks_file):
    open(processed_apks_file, "w+")

if enable_progresstracker:
    processed_apks = get_processed_apks(processed_apks_file)


def main():
    # Argument parsing
    apk_files = parse_arguments()

    global enable_progresstracker
    global processed_apks
    if enable_progresstracker and stat(processed_apks_file).st_size != 0:
        g = input("Progress tracking is enabled in the configuration file.\n"
                  "\tContinue from where the tool left off? \t[Y/N] \t or\n"
                  "\tReset the Progress tracker? \t\t\t[R]\n")
        if g.lower() == 'r' or g.lower() == 'reset':
            processed_apks = []
            open(processed_apks_file, 'w').close()
            print('Progress tracker is reset.')
        elif g.lower() != 'y' and g.lower() != 'yes':
            enable_progresstracker = False
            print('Progress tracker will be not used.')

    start_time = time.time()
    totaltime = 0
    nrapks = len(apk_files)
    main_logger.info("STARTING NEW PROCESS")
    for apk_index, apk_file in enumerate(apk_files):
        # Print current progress of the tool
        print("Processing apk: " + str(apk_index + 1) + " out of " + str(nrapks) + " apks")

        # Try to inspect/parse the APK
        try:
            a = inspect_apk(apk_file)
        except Exception:
            update_progresstracker(apk_file)
            continue

        # If the progresstracker is enabled we do not want to process any already processed APKs
        processed = False
        if enable_progresstracker and a:
            if already_processed(path_leaf(apk_file), processed_apks):
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
                log_time(a.get_package(), process_time, Path(apk_file).stat().st_size)

            main_logger.info("Total time spent on this apk: " + str(process_time) + "\n")
        else:
            main_logger.info("apk already processed... skipping...\n")

    main_logger.info("Finished analysis of apks")
    main_logger.info("Total executiontime: " + str(totaltime) + "\n\n")


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
        apk_files = [join(apk_folder, file) for file in listdir(apk_folder) if isfile(join(apk_folder, file)) and file.endswith(".apk")]
    else:
        # if an apk file is specified instead of the folder
        apk_files.append(apk_file)
    return apk_files


def process_sourcecode(a):
    """
    This function constructs the relevant objects for sourcecode analysis using androguard.
    After construction we extract the features we want and process them accordingly.
    :param a: Analysis object from androguard
    """
    # NOTE glogger.disabled disables the "multiple exit nodes found" prints (androguard issue/bug)
    glogger.disabled = True

    # NOTE dlogger disables the "Error decompiling method class <object>" message.
    # It seems like DAD has issues with decompiling some apks and will then show this message.
    # We disable it for a prettier output.
    dlogger.disabled = True

    # Create the d (DalvikVMFormat object) for each dex, and dx (Analysis object) 
    ds = [dvm.DalvikVMFormat(dex, using_api=a.get_target_sdk_version()) for dex in a.get_all_dex()]
    dx = Analysis()

    for d in ds:
        dx.add(d)

    for d in ds:
        decompiler = DecompilerDAD(d, dx)
        d.set_decompiler(decompiler)

    try:
        dx.create_xref()
    except Exception:
        main_logger.warning("Could not create xrefs properly")

    start_time = time.time()

    run_sourcecode(a, ds, dx)

    glogger.enabled = True
    dlogger.enabled = True

    current_time = time.time()
    main_logger.info("Apk: " + a.get_package() + " || Time spent on analysis: " + str(current_time - start_time))


def process_fernflower(package_name, apk_file):
    """
    This function formats the output that is obtained by running the fernflower decompiler and extracting our features.
    :param package_name: The package name/package id of the apk
    :param apk_file: the path to the to be analyzed apk file
    """
    start_time = time.time()
    run_fernflower_decompile(package_name, apk_file)
    finish_time = time.time()
    main_logger.info("Time spent on feature extraction (fernflower): " + str(finish_time - start_time))


# Helper function that catches errors possibly generated when analyzing an APK 
def inspect_apk(apk_file):
    """
    This function creates the APK object which is used for manifest file feature extraction.
    We also catch common exceptions generated in this wrapper function.
    :param apk_file: path to the apk to be analyzed
    """
    try:
        a = apk.APK(apk_file)
        return a
    except BadZipFile as bzfe:
        main_logger.warning("Could not process apk: " + path_leaf(apk_file) + " ...Is it actually an APK?\n")
        raise bzfe
    except FileNotFoundError as fnfe:
        main_logger.warning("Could not find apk: " + path_leaf(apk_file) + " ...Is it actually there?\n")
        raise fnfe
    except axml.ResParserError as rpe:
        main_logger.warning("Could not decode APK properly: " + path_leaf(apk_file) + "\n")
        raise rpe
    except Exception as e:
        main_logger.warning("Something went wrong with parsing the APK: " + path_leaf(apk_file) + "\n")
        raise e


def update_progresstracker(apk_file):
    """
    Updates the processedapks.txt file with the file name (not package name)
    :param apk_file:
    :return:
    """
    with open(processed_apks_file, 'a') as f:
        f.write(path_leaf(apk_file) + '\n')
        f.close()


def log_time(apk_name, process_time, apk_size):
    """
    Function that logs performance per apk
    :param apk_name:
    :param process_time:
    :param apk_size:
    :return:
    """
    filename = "../output/static_out/performance.csv"
    time_dict = {"package-name": apk_name, "process-time (sec)": process_time,
                 "apk size (KB)": float(apk_size) / float(1000)}
    write_to_csv(filename, time_dict)


if __name__ == '__main__':
    main()
