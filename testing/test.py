import sys
from os import path, devnull

def blockPrint():
    sys.stdout = open(devnull, 'w')

def enablePrint():
    sys.stdout = sys.__stdout__

print("no block")

blockPrint()
print("blocked")
enablePrint()