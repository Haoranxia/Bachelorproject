import csv, shutil
from os import path, devnull

# This function initializes a csv file containing 
# all the permissions as the header (column headers)
def initialize_csv(file, header):
    with open(file, 'w+', newline='') as f:
        writer = csv.writer(f)
        writer.writerow(header)

def read_headers(headerfile):
    with open(headerfile, 'r') as f:
        return f.readlines()

hdrfile = "./allpermissions.txt"
permissions_csv = "./permissions.csv"
headerlist = read_headers(hdrfile)
initialize_csv(permissions_csv, headerlist)
