import os
from androguard.misc import AnalyzeAPK
from androguard.core.analysis import analysis

def main():
    a, d, dx = AnalyzeAPK("./apks/WhatsApp.apk")
    print(a.get_permissions())
    #a.get_activities()
    #a.get_intent_filters()


main()