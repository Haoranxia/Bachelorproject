import os

from androguard.misc import AnalyzeAPK
from androguard.core.analysis import analysis
from src.manifest_analysis import analyzeManifest
from src.sourcecode_analysis import analyzeDex
# from src.contextual_feat_extraction import run_contextual


def main():
    # a : APK object; We can obtain all information about the APK here (manifest file stuff)
    # d : array of DalvikVMFormat objects; Corresponds to the DEX file. We can obtain classes, methods, strings etc.
    # from here.
    # dx : Analysis object; Contains special classes, which link information about classes.dex and can handle multiple
    # DEX files. (Extension of d object basically)
    a, d, dx = AnalyzeAPK("../apks/flashlight.apk")
    # analyzeManifest(a)
    analyzeDex(d, dx)
    # run_contextual()


main()