import configparser

config = configparser.ConfigParser()
config.read("../settings.ini")

print(config["Settings"]["Contextual"] == "yes")