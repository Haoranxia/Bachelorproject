# Convert dex to jar 
# Look up how to execute programs with arguments
# Dex2jar command format: d2j-dex2jar [options] <file0> 
# d2j-dex2jar -o <../static_out/out.jar> <../apks/1.apk>

from os import path, devnull 
import platform, subprocess
import zipfile

isWindows = False
if platform.system() == 'Windows':
    isWindows = True

test_path = "D:/Bachelor_project/Bachelorproject/dex2jar-2.0/helloworld.bat"
d2j_path = "D:/Bachelor_project/Bachelorproject/dex2jar-2.0/d2j-dex2jar.bat"

def d2j_test():
    input = "../apks/flashlight.apk"
    if isWindows:
        p = subprocess.Popen([d2j_path, "-o", "./out.jar", input])
        stdout, stderr = p.communicate()

def unpack_jar(file_path):
    if path.exists(file_path):
        # if folder: go into folder
        archive = zipfile.ZipFile(file_path, 'r')
        jarlist = archive.namelist()
    print(len(jarlist))

#d2j_test()
file_path = './out.jar'
unpack_jar(file_path)
