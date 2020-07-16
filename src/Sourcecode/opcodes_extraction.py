import collections
import sys
import time

sys.path.append("../util.py")
from util import create_complete_dict, write_to_csv, get_full_header

def run_opcodes_extraction(package_name, ds, sourcecode_logger):
    opcodes_dict = {}
    try:
        start_time = time.time()
        for dex in ds:
            opcodes_dict = get_opcodes(dex, opcodes_dict)
        current_time = time.time()
        sourcecode_logger.info("Time spent on opcodes: " + str(current_time - start_time))

        write_output(package_name, opcodes_dict)
    except Exception as e:
        sourcecode_logger.error("Opcodes extraction failed: " + str(e))

# Return a dictionary of opcodes and the nr of occurrences of that opcode
# src: http://blog.k3170makan.com/2014/11/automated-dex-decompilation-using.html
def get_opcodes(app, opcodes_dict):
    for c in app.get_classes():
        for m in c.get_methods():
            byte_code = m.get_code()
            if byte_code is not None:
                byte_code = byte_code.get_bc()
                for instr in byte_code.get_instructions():
                    instr_name = instr.get_name()
                    if instr_name not in opcodes_dict:
                        opcodes_dict[instr_name] = 1
                    else:
                        opcodes_dict[instr_name] += 1
    return opcodes_dict


def write_output(package_name, opcodes_dict):
    opcodescsv = "../output/static_out/sourcecode_opcodes.csv"
    opcodes_header = get_full_header("../resources/opcodes.txt")

    opcodes_dict = create_complete_dict(opcodes_dict, opcodes_header, package_name, frequency=True)
    write_to_csv(opcodescsv, opcodes_dict, header=opcodes_header)