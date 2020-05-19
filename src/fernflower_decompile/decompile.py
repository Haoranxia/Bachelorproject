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



def unpack_jar(file_path):
    # import regex: "import <anything>;"
    import_regex = r"import [+];"
    import_regex_count = 0

    if path.exists(file_path):
        # if folder: go into folder
        archive = zipfile.ZipFile(file_path, 'r')
        filenames = archive.namelist()
        for filename in filenames:
            if filename.endswith(".java"):
                with archive.open(filename) as javafile:
                    src_string = javafile.read().decode("utf-8")
                    import_regex_count += src_string.count(import_regex)
                    print(src_string)
                    break
    
    print(import_regex_count)

        
def unpack_jar_test(file_path):
    if path.exists(file_path):
        # TODO
        print("")

# txt = "import whatever.lmao; import secondClass; class SomeClass{}"
# java_ident = r"[A-Za-z\_\$]+[0-9]*[A-Za-z\_\$]*"
# x = re.findall(r"import " + java_ident + r"(\." + java_ident + r")*;", txt)
unpack_jar(outputfile)
        

