# Convert dex to jar 
# Look up how to execute programs with arguments
# Dex2jar command format: d2j-dex2jar [options] <file0> 
# d2j-dex2jar -o <../static_out/out.jar> <../apks/1.apk>

from os import path, devnull 
import platform, subprocess, zipfile, configparser, re
import collections

isWindows = False
if platform.system() == 'Windows':
    isWindows = True

# Paths
config = configparser.ConfigParser()
config.read("../../settings.ini")

d2j_path = config["Paths"]["dex2jar_path"]
fernflower_path = config["Paths"]["fernflower_path"]
dex2jar_out = "./dex2jar_out/dex2jar_out.jar"
fernflower_out = "./fernflower_out/fernflower_out.jar"

# Pipeline: apk -> dex2jar -> jar with classes -> fernflower -> jar with javacode
def decompile(apk):
    if d2j_path:
        # dex2jar
        dex2jar(apk)

    if fernflower_path:
        # jar (class) to jar (java)
        fernflower_decompile(dex2jar_out)


def dex2jar(apk):
    if isWindows:
        d2j_args = [d2j_path, "-o", dex2jar_out, "--force", apk]
    else:
        d2j_args = ["sh", d2j_path, "-o", dex2jar_out, "--force", apk]

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


def extract_features(file_path):
    # import regex: "import <anything>;"
    import_regex = r'import (.*?);'
    imports_list = []

    decompilation_failure_regex = r"// $FF: Couldn't be decompiled"
    failed_decompilation_count = 0

    # if folder: go into folder
    archive = zipfile.ZipFile(file_path, 'r')
    filenames = archive.namelist()
    for filename in filenames:
        if filename.endswith(".java"):
            with archive.open(filename) as javafile:
                src_string = javafile.read().decode("utf-8")

                # Imports
                imports = re.findall(import_regex, src_string)
                imports_list.extend(imports)

                # Failed decompilations
                failed_decompilation_count += len(re.findall(decompilation_failure_regex, src_string))
        
    return imports_list, failed_decompilation_count


# decompile("/home/yona/PycharmProjects/Bachelorproject/apks/flashlight.apk")
# dex2jar_path = D:\Bachelor_project\Bachelorproject\src\fernflower_decompile\tools\dex2jar-2.0\d2j-dex2jar.bat
# fernflower_path = D:\Bachelor_project\Bachelorproject\src\fernflower_decompile\tools\fernflower.jar

# txt = "import whatever.lmao; import secondClass; class SomeClass{}"
# java_ident = r"[A-Za-z\_\$]+[0-9]*[A-Za-z\_\$]*"
# x = re.findall(r"import " + java_ident + r"(\." + java_ident + r")*;", txt)

path = "../../apks/flashlight.apk"
decompile(path)
imports_list, failed_decompilation_count = extract_features("./fernflower_out/dex2jar_out.jar")
print(imports_list)
print(failed_decompilation_count)



