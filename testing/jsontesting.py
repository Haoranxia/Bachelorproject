import json

with open("../config.json") as jsonf:
    data = json.load(jsonf)
    print(data["Contextual"])
    print(data["Manifest"])
    print(data["Sourcecode"])


