# Create app to drag and drop file and check whether it is malicious or not via API in the backend. and Submit to Gmail of CEO of ICSS


# Remember to use advanced tkinter module

import requests

api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231"

# MALICIOUS FILE,  GOT 4 votes
# url = "https://www.virustotal.com/api/v3/files/3df116ef9ce709e3a5f25249db341c98"
# url = "https://www.virustotal.com/api/v3/files/3df116ef9ce709e3a5f25249db341c98/analyse"
# url = "https://www.virustotal.com/api/v3/files/3df116ef9ce709e3a5f25249db341c98/comments?limit-10"
# url = "https://www.virustotal.com/api/v3/files/3df116ef9ce709e3a5f25249db341c98/votes?limit-10"


# new file NOT MALICIOUS
# url = "https://www.virustotal.com/api/v3/files/3ba7ae939aa2ad39920d8f61622afb4d/votes?limit-10"
url = "https://www.virustotal.com/api/v3/files/3ba7ae939aa2ad39920d8f61622afb4d"

headers = {"accept":"appliation/json", "X-Apikey":api_key}


response =  requests.get(url, headers=headers)



# is a string but convert it in to json. and get ["data"]["total_votes"]["malicious"] > 0 then harmful
print(response.text)

# file = open("votes.json", "w")
#
# file.write(response.text)
#
# file.close()
