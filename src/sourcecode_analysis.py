import collections
import logging

from androguard.core import bytecodes
from androguard.core import androconf

# parameters:
# d: list of dalvikVMformat objects
# dx: Analysis object 
def analyzeDex(d, dx):
    # Initialization
    opcodes_dict = collections.OrderedDict()
    obfuscations_dict = collections.OrderedDict()
    #kotlin_usage_dict = collections.OrderedDict()

    # Logic
    for dex in d:
        opcodes_dict = get_opcodes(dex, opcodes_dict)
        obfuscations_dict = get_obfuscation_naming_total(dex, obfuscations_dict)
        #dict_src_features["kotlin"] = get_kotlin_usage(dex)

    print(opcodes_dict)
    print(obfuscations_dict)

# Return a dictionairy of opcodes and the nr of occurrences of that opcode 
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

# Get number of (possible) obfuscated names
# We check for several common obfuscation techniques:
# 1) Check for keywords with < 4 characters
# 2) Check whether non ASCII characters are used
def get_obfuscation_naming_total(app, obfuscations_dict):
    for c in app.get_classes():
        classname = c.get_name()

        if len(classname) < 4:
            obfuscations_dict = add_to_dict_unique(classname, obfuscations_dict)   

        if androconf.is_ascii_problem(classname):
            obfuscations_dict = add_to_dict_unique(classname, obfuscations_dict)
        
        for field in c.get_fields():
            fieldname = field.get_name()

            if len(fieldname) < 4:
                obfuscations_dict = add_to_dict_unique(fieldname, obfuscations_dict)   
            
            if androconf.is_ascii_problem(fieldname):
                obfuscations_dict = add_to_dict_unique(fieldname, obfuscations_dict)
            
        
        for method in c.get_methods():
            methodname = method.get_name()

            if len(methodname) < 4:
                obfuscations_dict = add_to_dict_unique(methodname, obfuscations_dict)
            
            if androconf.is_ascii_problem(methodname):
                obfuscations_dict = add_to_dict_unique(methodname, obfuscations_dict)

    return obfuscations_dict

def add_to_dict_unique(name, dictionary):
    if name not in dictionary:
        dictionary[name] = 1
    else:
        dictionary[name] += 1
    return dictionary


# We scan the source code for kotlin keyword usage
def get_kotlin_usage(app):
    # We do not want to show the errors produced
    logging.disabled = True

    keywords = ["fun", "in", "is", "typealias", "typeof", "val", "var", "when"]
    keyword_usage = {keyword:0 for keyword in keywords}

    for cl in app.get_classes():
        src = cl.get_vm_class().get_source()
        for keyword in keywords:
            keyword_usage[keyword] += src.count(keyword)

    logging.disabled = False
    return keyword_usage


def print_featureList(features):
    for feature in features:
        print(feature)

