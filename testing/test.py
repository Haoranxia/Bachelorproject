import sys
from subprocess import Popen, PIPE
from os import path, devnull

path = 'C:/Program Files (x86)/JADX/bin/jadx'
print(path)
process = Popen([path, '--version'], stdout=PIPE, stderr=PIPE)
stdout, stderr = process.communicate()
print(stdout)
print(stderr)


