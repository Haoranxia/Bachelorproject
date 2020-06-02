import requests
import http.client
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


def url_exists(url):
    """
    checks if url exists or is accessible
    :return:
    """
    try:
        x = requests.head(url)
        x.raise_for_status()
        if 200 <= x.status_code < 400:
            return True

    except HTTPError as he:
        print("HERE " + str(he))
    except Exception as err:
        print(err)
    # else:
    #     available_stores.append(app_store)  # no raised exceptions
    return None


# response = requests.get('https://www.apkmonk.com/app/com.robinsage.divvee/')

print(url_exists('https://www.doogle.com'))
# print(url_exists('https://www.apkmonk.com/'))
print(url_exists('https://www.apkmonk.com/app/com.robinsage.divvee/'))




