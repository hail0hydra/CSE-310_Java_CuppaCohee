import requests
import hashlib

api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231"

# x = hashlib.md5(open("virus.bat","rb").read()).hexdigest()
x = hashlib.md5(open("virus.bat","rb").read()).hexdigest()

url = f"https://www.virustotal.com/api/v3/files/{x}"

headers = {"accept": "application/json", "X-Apikey" : api_key}

response = requests.get(url, headers=headers)


print(response.json())
# if 'error' in res:
#     print(res["error"])
# else:
#     print(res)



