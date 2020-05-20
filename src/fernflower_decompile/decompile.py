# Convert dex to jar 
# Look up how to execute programs with arguments
# Dex2jar command format: d2j-dex2jar [options] <file0> 
# d2j-dex2jar -o <../static_out/out.jar> <../apks/1.apk>

# Input: apk
# dex2jar -> jar with .class files
# fernflower -> jar with .java files

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
        p = subprocess.Popen([d2j_path, "-o", outputfile, apk])
        stdout, stderr = p.communicate()

        if stdout:
            print(stdout)
        if stderr:
            print(stderr)


def fernflower_decompile(file_path):
    if isWindows:
        p = subprocess.Popen(["java", "-jar", fernflower_path, file_path, "./fernflower_out"])
        stdout, stderr = p.communicate()

        if stdout:
            print(stdout)
        if stderr:
            print(stderr)


# import [starting_symbol-any char].
def unpack_jar(file_path):
    
    key_patterns_kotlin = [r'String v[\d]*_[\d] = new StringBuilder();$', r'\bkotlin\b', r'\b.kotlin\b', r'@NotNull']
    keyword_usages_kotlin = collections.OrderedDict()
    keyword_usages_kotlin = {key_pattern: 0 for key_pattern in key_patterns_kotlin}
    
    key_patterns_reflection = [r'java.lang.reflect']
    keyword_usages_reflection = collections.OrderedDict()
    keyword_usages_reflection = {key_pattern: 0 for key_pattern in key_patterns_reflection}
    
    key_patterns_imports = [r'import']
    keyword_usages_imports = {key_pattern: 0 for key_pattern in key_patterns_imports}

    if path.exists(file_path):
        # if folder: go into folder
        archive = zipfile.ZipFile(file_path, 'r')
        filenames = archive.namelist()
        for filename in filenames:
            if filename.endswith(".java"):
                with archive.open(filename) as javafile:
                    src_string = javafile.read().decode("utf-8")

                    # kotlin
                    for key_pattern in key_patterns_kotlin:
                        keyword_usages_kotlin[key_pattern] += count_overlapping_distinct(key_pattern, src_string)

                    # reflection
                    for key_pattern in key_patterns_reflection:
                        keyword_usages_reflection[key_pattern] += src_string.count(key_pattern)
                    
                    # imports
                    for key_pattern in key_patterns_imports:
                        keyword_usages_imports[key_pattern] += src_string.count(key_pattern)
                              
    
    print(keyword_usages_kotlin)
    print(keyword_usages_reflection)
    print(keyword_usages_imports)

        
def unpack_jar_test(file_path):
    if path.exists(file_path):
        # TODO
        print("")


def count_overlapping_distinct(pattern, text):
    """
    counts the number of patterns found in text
    :param pattern: regex pattern
    :param text: the source text to be searched
    :return:
    """
    total = 0
    start = 0
    there = re.compile(pattern)

    while True:
        mo = there.search(text, start)
        if mo is None: return total
        total += 1
        start = 1 + mo.start()


unpack_jar(outputfile)
        

