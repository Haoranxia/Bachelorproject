import os
from androguard.misc import AnalyzeAPK
from androguard.core.analysis import analysis
from manifest_analysis import *
from sourcecode_analysis import *

def analyzeDex(d, dx):
    print("TODO\n")

# This function retrieves information about the APK itself.
# We analyize the manifest file using androguard functions and return any relevant information.
def analyzeAPK(a):
    print(a.get_app_name())
    print(a.get_permissions())
    print(a.get_activities())
    print(a.get_android_resources())

def main():
    #a : APK object; We can obtain all information about the APK here (manifest file stuff)
    #d : array of DalvikVMFormat objects; Corresponds to the DEX file. We can obtain classes, methods, strings etc. from here.
    #dx : Analysis object; Contains special classes, which link information about classes.dex and can handle multiple DEX files. (Extension of d object basically)
    a, d, dx = AnalyzeAPK("./apks/WhatsApp.apk")

    analyzeAPK(a)
    analyzeDex(d, dx)


main()