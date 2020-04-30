import collections

from androguard.core import bytecodes

# parameters:
# d: list of dalvikVMformat objects
# dx: Analysis object 
def analyzeDex(d, dx):
    dict_src_features = collections.OrderedDict()

    for app in d:
        dict_src_features["classes"] = app.get_classes()
        dict_src_features["methods"] = app.get_methods()
        dict_src_features["fields"] = app.get_fields()

        opcodes = get_opcodes(app)
        obfuscations = get_obfuscation_naming_total(app)
        #kotlinusage = get_kotlin_usage(app)

    #print(opcodes)
    print(len(obfuscations))
    #print(len(kotlinusage))

# Return a dictionairy of opcodes and the nr of occurrences of that opcode 
# src: http://blog.k3170makan.com/2014/11/automated-dex-decompilation-using.html
def get_opcodes(app):
    temp = collections.OrderedDict()
    for c in app.get_classes():
        for m in c.get_methods():
            byte_code = m.get_code()
            if byte_code is not None:
                byte_code = byte_code.get_bc()
                for instr in byte_code.get_instructions():
                    instr_name = instr.get_name()
                    if instr_name not in temp:
                        temp[instr_name] = 1
                    else:
                        temp[instr_name] += 1
    return temp

# Get number of (possible) obfuscated names
# We use the heuristic that obfuscated variable names are usually <= 3 in size
def get_obfuscation_naming_total(app):
    obfuscations = collections.OrderedDict()
    obfuscations["classes"] = list()
    obfuscations["fields"] = list()
    obfuscations["methods"] = list()

    for c in app.get_classes():
        if len(c.get_name()) < 4:
            obfuscations["classes"].append(c.get_name())
        
        for field in c.get_fields():
            if len(field.get_name()) < 4:
                obfuscations["fields"].append(field.get_name())
        
        for method in c.get_methods():
            if len(method.get_name()) < 4:
                obfuscations["methods"].append(method.get_name())
    
    return obfuscations

# We scan the source code for kotlin keyword usage
def get_kotlin_usage(app):
    keywords = ["fun", "in", "is", "typealias", "typeof", "val", "var", "when"]
    keyword_usage = {keyword:0 for keyword in keywords}

    for cl in app.get_classes():
        src = cl.source()
        for keyword in keywords:
            keyword_usage[keyword] += src.count(keyword)

    return keyword_usage


def print_featureList(features):
    for feature in features:
        print(feature)


