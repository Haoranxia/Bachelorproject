# Convert dex to jar 
# Look up how to execute programs with arguments
# Dex2jar command format: d2j-dex2jar [options] <file0> 
# d2j-dex2jar -o <../static_out/out.jar> <../apks/1.apk>

# Input: apk
# dex2jar -> jar with .class files
# fernflower -> jar with .java files

from os import path, devnull 
import platform, subprocess, zipfile, configparser, re 

isWindows = False
if platform.system() == 'Windows':
    isWindows = True

# Paths
config = configparser.ConfigParser()
config.read("../../settings.ini")

d2j_path = config["Paths"]["dex2jar_path"]
fernflower_path = config["Paths"]["fernflower_path"]
outputfile = "./fernflower_out/dex2jar_out.jar"


def decompile(apk):
    if d2j_path:
        # dex2jar
        dex2jar(apk)

    if fernflower_path:
        # jar (class) to jar (java)
        fernflower_decompile(outputfile)


def dex2jar(apk):
    if isWindows:
        d2j_args = [d2j_path, "-o", outputfile, apk]
    else:
        d2j_args = ["sh", d2j_path, "-o", outputfile, apk]

    p = subprocess.Popen(d2j_args)
    stdout, stderr = p.communicate()

    if stdout:
        print(stdout)
    if stderr:
        print(stderr)


def fernflower_decompile(file_path):
    if True:  # if isWindows:
        p = subprocess.Popen(["java", "-jar", fernflower_path, file_path, "./fernflower_out"])
        stdout, stderr = p.communicate()

        if stdout:
            print(stdout)
        if stderr:
            print(stderr)


def unpack_jar(file_path):
    # import regex: "import <anything>;"
    import_regex = r'import (.*?);\n'
    # import_regex_count = 0
    imports_list = []

    if path.exists(file_path):
        # if folder: go into folder
        archive = zipfile.ZipFile(file_path, 'r')
        filenames = archive.namelist()
        for filename in filenames:
            if filename.endswith(".java"):
                with archive.open(filename) as javafile:
                    src_string = javafile.read().decode("utf-8")
                    imports = re.findall(import_regex, src_string)
                    imports_list.extend(imports)
    print(imports_list)

        
def unpack_jar_test(file_path):
    if path.exists(file_path):
        # TODO
        print("")


# decompile("/home/yona/PycharmProjects/Bachelorproject/apks/flashlight.apk")

unpack_jar(outputfile)



