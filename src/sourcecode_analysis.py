# This function retrieves information about the APK itself.
# We analyize the manifest file using androguard functions and return any relevant information.
def analyzeAPK(a):
    print(a.get_app_name())
    print(a.get_permissions())
    print(a.get_activities())
    print(a.get_android_resources())