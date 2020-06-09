import requests
import http.client

from androguard.core.analysis.analysis import Analysis
from androguard.core.bytecodes import dvm
from androguard.decompiler.decompiler import DecompilerDAD
from androguard.misc import AnalyzeAPK
from requests.exceptions import HTTPError

# url = 'https://www.hybrid-analysis.com/api/v2/search/hash'
# HA_API_KEY = '1cf1zn62de0f479dg8i9h1v91e831fb1c1f9m55bf61d286e7p3zbofa891458b9'
# data = {'hash': 'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28'}
#
# response = requests.post(url, data=data, headers={'api-key': HA_API_KEY, 'user-agent': 'Falcon Sandbox'})
# print(response)
# print(response.text)

# url = 'https://www.hybrid-analysis.com/api/v2/overview/' + \
#       'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28'
#
# # 'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28' <- whatsapp
#
# HA_API_KEY = '1cf1zn62de0f479dg8i9h1v91e831fb1c1f9m55bf61d286e7p3zbofa891458b9'
#
# response = requests.get(url=url, headers={'api-key': HA_API_KEY, 'user-agent': 'Falcon Sandbox'})
# print(response)
# print(response.text)

# return None if there 404 response error


# def url_exists(url):
#     """
#     checks if url exists or is accessible
#     :return:
#     """
#     try:
#         x = requests.head(url)
#         x.raise_for_status()
#         if 200 <= x.status_code < 400:
#             return True
#
#     except HTTPError as he:
#         print("HERE " + str(he))
#     except Exception as err:
#         print(err)
#     # else:
#     #     available_stores.append(app_store)  # no raised exceptions
#     return None
#
#
# # response = requests.get('https://www.apkmonk.com/app/com.robinsage.divvee/')
#
# print(url_exists('https://www.doogle.com'))
# # print(url_exists('https://www.apkmonk.com/'))
# print(url_exists('https://www.apkmonk.com/app/com.robinsage.divvee/'))


# a, d, dx = AnalyzeAPK("../apks/benign/full/0a4c189953df4f320f2f9d34b411013c.apk")
from androguard.core.bytecodes import dvm, apk
#
#
# def get_api_methods(dx):
#     """
#     gets the external method calls (api methods)
#     :param dx: dalvik analysis object about apk
#     :return:
#     """
#     api_calls_dict = {}
#     for external_class in dx.get_external_classes():
#         external_methods = external_class.get_methods()
#         for method in external_methods:
#             method_name = method.get_method().get_name()
#             class_name = method.get_method().get_class_name().replace(';', '::')
#             full_method = class_name + method_name
#             if full_method in api_calls_dict.keys():
#                 api_calls_dict[full_method] += 1
#             else:
#                 api_calls_dict[full_method] = 1
#     return api_calls_dict
# # HERE
#
#
a = apk.APK("../../WhatsApp.apk")
# a = apk.APK("../apks/benign/full/3827cb806c32d1b53c545604e12bb916.apk")
ds = [dvm.DalvikVMFormat(dex, using_api=a.get_target_sdk_version()) for dex in a.get_all_dex()]
dx = Analysis()

for d in ds:
    dx.add(d)

for d in ds:
    # NOTE: We use the DAD decompiler (build-in androguard decompiler). Another option would be JADX
    # However, JADX stops decompiling when it encounters a problem (which happens quite often with obfuscated apks)
    decompiler = DecompilerDAD(d, dx)
    d.set_decompiler(decompiler)

dx.create_xref()

const_strings = dx.strings.keys()
print(const_strings)
# print(type())
# print(len(dx.strings.keys()))
# print(dx.strings.keys())
# print(get_api_methods(dx))

#
# from util import write_to_csv
#
# my_dict = {'package-name': 1, "test_dict": {"wow1": 1, "wow2": 2}}
#
# write_to_csv('../static_out/my_csv.csv', my_dict)

# Open a file with access mode 'a'
# file_object = open('sample.csv', 'a+')

# Append 'hello' at the end of file
# file_object.write('hello')

# Close the file
# file_object.close()
