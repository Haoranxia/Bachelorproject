import sys
import argparse
import configparser
from os import listdir
from os.path import isfile, join

from androguard.core.bytecodes import dvm, apk
from androguard.misc import AnalyzeAPK
from androguard.decompiler.dad.graph import logger as glogger
from androguard.decompiler.dad.decompile import logger as dlogger
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD

from util import write_to_csv, blockPrint, enablePrint
from sourcecode_analysis import analyze_dex
from manifest_analysis import analyze_manifest
from contextual_feat_extraction import run_contextual


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

    # CSV initialization (Relative path to this file)
    manifestcsv = "../static_out/manifest_features.csv"
    sourcecodecsv = "../static_out/sourcecode_features.csv"
    opcodescsv = "../static_out/sourcecode_opcodes.csv"
    obfuscationscsv = "../static_out/sourcecode_obfuscations.csv"
    keywordscsv = "../static_out/sourcecode_keywords.csv"

    # Config file parsing
    config = configparser.ConfigParser()
    config.read("../settings.ini")

    enable_contextual = (config["Settings"]["Contextual"] == "yes")
    enable_manifest = (config["Settings"]["Manifest"] == "yes")
    enable_sourcecode = (config["Settings"]["Sourcecode"] == "yes")

    for apk_file in apk_files:
<<<<<<< HEAD
        a = apk.APK(apk_file)
        
=======
        # glogger.disabled = True
        # dlogger.disabled = True

>>>>>>> 13ebcb8a16b9cfde0efe890cd396f6a242b32a8d
        # Contextual features
        if enable_contextual:
            a = apk.APK(apk_file)
            run_contextual(apk_file=apk_file, app_id=a.get_package())

        # Manifest features
        if enable_manifest:
            a = apk.APK(apk_file)
            manifest_dict = analyze_manifest(a)
            write_to_csv(manifestcsv, manifest_dict)

        # Source code features
        if enable_sourcecode:
<<<<<<< HEAD
            # FIXME Disabled glogger due to "Multiple exit nodes error" in androguard. This seems to be a bug related to
            # the androguard framework so we can't do much about it
            glogger.disabled = True

            # Create the d (DalvikVMFormat object) for each dex, and dx (Analysis object) 
            # for all dex files for sourcecode analysis
            ds = [dvm.DalvikVMFormat(dex) for dex in a.get_all_dex()]
            dx = Analysis()

            for d in ds:
                dx.add(d)

            # TODO use JADX instead of DAD
            decompiler = DecompilerDAD(d, dx)

            for d in ds:
                d.set_decompiler(decompiler)
           
            opcodes_dict, obfuscations_dict, kotlin_dict, reflection_dict = analyze_dex(d, dx)
            keywords_dict = kotlin_dict.update(reflection_dict)

            print(reflection_dict)
            print(kotlin_dict)
            print(keywords_dict)

            glogger.enabled = True
            #write_to_csv(opcodescsv, opcodes_dict)
            #write_to_csv(obfuscationscsv, obfuscations_dict)
            #write_to_csv(keywordscsv, keywords_dict)

    print("Finished")
        
=======
            # Get the DalvikVMFormat objects for each dex file in the apk so that we can analyze them
            _, d, _ = AnalyzeAPK(apk_file)
            # d = [dvm.DalvikVMFormat(dex) for dex in a.get_all_dex()]

            opcodes_dict, obfuscations_dict, kotlin_dict, reflection_dict = analyze_dex(d)
            print(opcodes_dict)
            print(obfuscations_dict)
            print(kotlin_dict)
            print(reflection_dict)
            # write_to_csv(sourcecodecsv, sourcecode_dict)

        # glogger.disabled = False
        # dlogger.disabled = False

    print("Finished")

>>>>>>> 13ebcb8a16b9cfde0efe890cd396f6a242b32a8d

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


if __name__ == '__main__':
    main()
