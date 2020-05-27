import requests

# url = 'https://www.hybrid-analysis.com/api/v2/search/hash'
# HA_API_KEY = '1cf1zn62de0f479dg8i9h1v91e831fb1c1f9m55bf61d286e7p3zbofa891458b9'
# data = {'hash': 'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28'}
#
# response = requests.post(url, data=data, headers={'api-key': HA_API_KEY, 'user-agent': 'Falcon Sandbox'})
# print(response)
# print(response.text)

url = 'https://www.hybrid-analysis.com/api/v2/overview/' + \
      'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28'

# 'c25178dd627d0a23b9200602658ed7d085b7cd3768ab5ab534edb9adbe9b0f28' <- whatsapp

HA_API_KEY = '1cf1zn62de0f479dg8i9h1v91e831fb1c1f9m55bf61d286e7p3zbofa891458b9'

response = requests.get(url=url, headers={'api-key': HA_API_KEY, 'user-agent': 'Falcon Sandbox'})
print(response)
print(response.text)

# return None if there 404 response error
