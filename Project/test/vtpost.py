import requests

url = "https://www.virustotal.com/api/v3/files/3df116ef9ce709e3a5f25249db341c98"


api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231"

headers = {
        "accept" : "application/json",
        # "content-type" : "multipart/form-data",
        "X-Apikey" : api_key
        }


response = requests.post(url, headers=headers)
print(response.text)
