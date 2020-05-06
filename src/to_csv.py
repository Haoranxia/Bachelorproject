import csv
import shutil
from tempfile import NamedTemporaryFile
from os import path

def write_to_csv(file, file_dict):
    rowexists = False
    tempfile = NamedTemporaryFile(delete=False, mode='w', newline='')

    if not path.exists(file):
        # create
        with open(file, 'w+', newline='') as f:
            writer = csv.DictWriter(f, fieldnames=file_dict.keys())
            writer.writeheader()
            writer.writerow(file_dict)
    else:
        # edit
        with open(file, 'r') as readf, tempfile:
            reader = csv.DictReader(readf, fieldnames=file_dict.keys())
            writer = csv.DictWriter(tempfile, fieldnames=file_dict.keys())

            for row in reader:
                if str(row['package-name']) == str(file_dict['package-name']):
                    writer.writerow(file_dict)
                    rowexists = True
                else:
                    writer.writerow(row)

            if not rowexists:
                writer.writerow(file_dict)
        
        shutil.move(tempfile.name, file)







