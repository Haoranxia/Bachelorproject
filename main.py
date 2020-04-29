import os
from androguard.misc import AnalyzeAPK
from androguard.core.analysis import analysis
from contextual_feat_extraction import run

def main():
    # a, d, dx = AnalyzeAPK("./apks/WhatsApp.apk")
    # print(a.get_permissions())
    # a.get_activities()
    # a.get_intent_filters()
    run()

main()