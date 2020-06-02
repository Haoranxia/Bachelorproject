import re

string = "kotlin.testkotlin"
pattern = r"kotlin\.*"

def countoverlappingdistinct(pattern, thestring):
  total = 0
  start = 0
  there = re.compile(pattern)
  while True:
    mo = there.search(thestring, start)
    if mo is None: return total
    total += 1
    start = 1 + mo.start()


def sourcecode_test(dx):
    for cl in dx.get_internal_classes():
        #cl = cl.get_class()
        for method in cl.get_methods():
            if not method.is_external():
                m = method.get_method()
                try:
                    src = m.get_source()
                except:
                    
                #print("method type: " + str(type(m)))
                print(src)
    
    return


def sourcecode_test2(dx):
    pattern1 = r'reflect\.(.*)'
    pattern2 = r'android(.*)'

    p1_strings = dx.find_strings(string=pattern1)
    p2_strings = dx.find_strings(string=pattern2)

    for string in p1_strings:
        print(string.get_orig_value())
    
    for string in p2_strings:
        print(string.get_orig_value())


print(len(re.findall(pattern, string)))
print(countoverlappingdistinct(pattern, string))