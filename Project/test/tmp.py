import requests
import hashlib




# Open file as binary

try:

    file = input("Enter File location: ")
    #
    f = open(file,"rb").read()
    x = hashlib.md5(f).hexdigest()
    url = f"https://www.virustotal.com/api/v3/files/{x}"
# # x = "3df116ef9ce709e3a5f25249db341c98"  
# x = "aa6a6f24005d65b60695c8e2cc0f6c9a"  
# x = "af05bb1a4f576f3423a9d1903c455cac"  

except Exception as e:
    print("\nSorry, the File doesn't seem to exist!")
    exit(0)


api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231"

headers = {
        "accept" : "application/json",
        "X-Apikey": api_key
        }

response = requests.get(url, headers = headers)


# if response.status_code == 404:
#     print("\n\n\n\n\404\n\n\n\n\n")


# print(type(response.status_code))

res = response.json()
# print(f"\n\n\n\n\n{res}\n\n\n\n\n\n")
if 'data' in res:
    try:
        if (res["data"]["attributes"]["popular_threat_classification"]["popular_threat_name"][0]["count"]) > 0:
            print("Malicious")
    except Exception as e:
        # print("\n\n",e,"\n\n")
        print("Harmless")
elif 'error' in res:
    print("Harmless")
# print(response.status_code)
# print(res)
