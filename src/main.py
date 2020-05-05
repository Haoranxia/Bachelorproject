import sys
import argparse
from os import listdir
from os.path import isfile, join
from androguard.misc import AnalyzeAPK
from src.sourcecode_analysis import analyze_dex
from src.manifest_analysis import analyze_manifest
from src.contextual_feat_extraction import run_contextual


def main():
    """
    a : APK object; We can obtain all information about the APK here (manifest file stuff)
    d : array of DalvikVMFormat objects; Corresponds to the DEX file. We can obtain classes, methods, strings etc.
        from here.
    dx : Analysis object; Contains special classes, which link information about classes.dex and can handle multiple
        DEX files. (Extension of d object basically)
    :return:
    """

    apk_files = parse_arguments()

    for apk_file in apk_files:
        a, d, dx = AnalyzeAPK(apk_file)
        # analyze_manifest(a)
        # analyze_dex(d, dx)
        run_contextual(apk_file=apk_file, app_id=a.get_package())


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


main()
