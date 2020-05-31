from os import path, devnull 
import platform, subprocess, zipfile, configparser, re
import collections
import time
import logging

isWindows = False
if platform.system() == 'Windows':
    isWindows = True


# Logger
fernflower_logger = logging.getLogger()
fernflower_logger.setLevel(logging.INFO)


# Paths
config = configparser.ConfigParser()
config.read("../settings.ini")

d2j_path = config["Paths"]["dex2jar_path"]
fernflower_path = config["Paths"]["fernflower_path"]
dex2jar_out = "./fernflower_decompile/dex2jar_out/dex2jar_out.jar"
fernflower_out = "./fernflower_decompile/fernflower_out/dex2jar_out.jar"

dex2jar_log = "./fernflower_decompile/dex2jar_out/dex2jar.log"
fernflower_log = "./fernflower_decompile/fernflower_out/fernflower.log"


# Pipeline: apk -> dex2jar -> jar with classes -> fernflower -> jar with javacode
def decompile(package_name, apk):
    """
    This is the function that handles the pipeline for decompiling an apks dex files into java sourcecode
    :param package_name: the package name/package id of the apk
    :param apk: the path to the apk to be decompiled
    """
    if d2j_path:
        # dex2jar
        try:
            fernflower_logger.info("### Running d2j ###")
            dex2jar(package_name, apk)
        except FileNotFoundError:
            fernflower_logger.error("Cant find dex2jar or apk file")
        except Exception:
            fernflower_logger.error("Problem with dex2jar decompilation")

    if fernflower_path:
        # jar (class) to jar (java)
        try:
            fernflower_logger.info("### Running fernflower ###")
            fernflower_decompile(package_name, dex2jar_out)
        except FileNotFoundError:
            fernflower_logger.error("Cant find fernflower or apk file")
        except Exception:
            fernflower_logger.error("Problem with fernflower decompilation")


def dex2jar(package_name, apk):
    """
    Transform a given apk's dex files to a jar containing .class files
    :param package_name:
    :param apk: Path to the apk to be transformed
    """
    if isWindows:
        d2j_args = [d2j_path, "-o", dex2jar_out, "--force", apk]
    else:
        d2j_args = ["sh", d2j_path, "-o", dex2jar_out, "--force", apk]

    p = subprocess.Popen(d2j_args, stdout=subprocess.PIPE)
    log = p.communicate()[0]
    if log:
        logfile_path = "./fernflower_decompile/dex2jar_out/" + package_name + "_dex2jar.log"
        write_to_file(logfile_path, log)


def fernflower_decompile(package_name, file_path):
    """
    Decompile the given jar file (containing .class files) to a jar file containing .java files
    :param package_name:
    :param file_path: path to the jar file containing .class files
    """
    fernflower_args = ["java", "-jar", fernflower_path, file_path, "./fernflower_decompile/fernflower_out"]
    p = subprocess.Popen(fernflower_args, stdout=subprocess.PIPE)
    log = p.communicate()[0]
    if log:
        logfile_path = "./fernflower_decompile/fernflower_out/" + package_name + "_fernflower.log"
        write_to_file(logfile_path, log)


def extract_features(file_path):
    """
    Extract the wanted features from a jar file containing .java files
    :param file_path: Path to the jar containing .java files
    """
    import_regex = r'import (.*?);'
    imports_dict = collections.OrderedDict()

    # Fernflower displays this 'pattern' in methods that cant be decompiled. (src: see decompiled fernflower code)
    decompilation_failure_regex = r"// $FF: Couldn't be decompiled"
    failed_decompilation_count = 0

    reflection_regex = r"java.lang.reflect.*;"
    reflection_dict = collections.OrderedDict()

    # if folder: go into folder
    archive = zipfile.ZipFile(file_path, 'r')
    filenames = archive.namelist()
    for filename in filenames:
        if filename.endswith(".java"):
            with archive.open(filename) as javafile:
                src_string = javafile.read().decode("utf-8")
          
                # Imports
                imports_dict = find_pattern(imports_dict, import_regex, src_string)

                # Failed decompilations
                failed_decompilation_count += len(re.findall(decompilation_failure_regex, src_string))

                # Counting reflection occurences
                reflection_dict = find_pattern(reflection_dict, reflection_regex, src_string)
        
    return imports_dict, failed_decompilation_count, reflection_dict


# decompile("/home/yona/PycharmProjects/Bachelorproject/apks/flashlight.apk")
# dex2jar_path = D:\Bachelor_project\Bachelorproject\src\fernflower_decompile\tools\dex2jar-2.0\d2j-dex2jar.bat
# fernflower_path = D:\Bachelor_project\Bachelorproject\src\fernflower_decompile\tools\fernflower.jar

def run_fernflower_decompile(package_name, file_path):
    start_time = time.time()
    decompile(package_name, file_path)
    fernflower_logger.info("Time spent on decompiling: " + str(time.time() - start_time))

    fernflower_logger.info("### Extracting features from decompiled code ###")
    start_time = time.time()
    imports_dict, decompile_error_count, reflection_dict = extract_features(fernflower_out)
    fernflower_logger.info("TIme spent on extractinf features: " + str(time.time() - start_time))
    return imports_dict, decompile_error_count, reflection_dict


# Helper functions
def write_to_file(filepath, data):
    with open(filepath, 'wb+') as f:
        f.write(data)
        f.close()


def find_pattern(pattern_dict, pattern, src):
    pattern_usage = re.findall(pattern, src)
    for pattern in pattern_usage:
        if pattern not in pattern_dict:
            pattern_dict[pattern] = 1
        else:
            pattern_dict[pattern] += 1
    return pattern_dict



