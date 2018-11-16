# Signature Algorithm

## Signature Algorithm

Apply for AccessKey and SecretKey key pair (AK/SK for short) on the AccessKey Management page under the User Center Account Management of JD Cloud.
The AK/SK information should be kept properly, which, if lost, may cause illegal users to use this information to manipulate your resources on the cloud, causing losses to your data and property.
The AK/SK key pair are allowed to be enabled or disabled, which after being enabled, can be used to call OpenAPI, and after being disabled, cannot be used to call OpenAPI.

The message queue JCQ HttpProxy service will authenticate the request of each access, and each submitted request needs to include a signature in the request's header.
The message queue JCQ will authenticate the identity of the sender of a request by symmetric encryption with AK/SK, and the request will be considered valid if the calculated signature is the same as the one provided;
Otherwise this request will be denied and HTTP 403, Authentication failed error, will be returned.

### The rule for generation of signature is as follows:

String obtained by using secretKey to encrypt signSource with **hmac-sha1**

### The rule for generation of signSource is as follows:

Use the `accessKey` and `dateTime` and `all parameters` in the public request header to construct a map, which, after being sorted according to the lexicographic order of the key values, is concatenated to form a string in the format of key1=value1&key2=value2&...&key100=value100.

Where, the messages field of sending the message needs to be preprocessed and then added to the computing of signSource. The rule for preprocessing is as follows:

First, take out the key-value pairs in its `properties` of each Message and sort them with the other fields of the Message, which are then be concatenated in the format of key1=value1&key2=value2&...&key100=value100,
to generate the string message_signsource, and then, for message_signsource, evaluate the md5 value to generate message_str,
and finally, all the Messages are concatenated using English commas in the order in which they appear in the list to form the final string message_value (in the format of `message_str1,message_str2,message_str3`) [Separated with Commas] as the value of the final messages field.

### Sample Code (Python3)

```python
#!/home/lizhijian/opt/python3.7/bin/python3

import base64
import collections
import hashlib
import hmac
import json
import random
import requests
from datetime import datetime

def md5(content):
    b = bytes(content, 'utf-8')
    h = hashlib.new('md5')
    h.update(b)
    return h.hexdigest()

def message2str(message):
    m = dict(message)  # deep copy
    m.update(m.get('properties', {}))
    m.pop('properties')
    od = collections.OrderedDict(sorted(m.items()))
    ms = '&'.join([k + '=' + str(v) for k, v in od.items()])
    return md5(ms)

def get_sign_source(headers, params):
    d = {
        'accessKey': headers['accessKey'],
        'dateTime': headers['dateTime'],
    }
    d.update(params)
    if type(d.get('messages')) == list:
        d['messages'] = ','.join([message2str(m) for m in d['messages']])
    od = collections.OrderedDict(sorted(d.items()))
    return '&'.join([k + '=' + str(v) for k, v in od.items()])

def get_signature(source, key):
    key = key.encode('utf-8')
    source = source.encode('utf-8')
    digester = hmac.new(key, source, hashlib.sha1)
    signature = base64.standard_b64encode(digester.digest())
    return signature.decode('utf-8').strip()

def send_message(access_key, secret_key, topic, type_, messages):
    url = 'http://192.168.6.1:9090/v1/messages'
    headers = {
        "Content-Type": "application/json",
        "accessKey": access_key,
        "dateTime": datetime.utcnow().isoformat(timespec='seconds') + "Z",
    }
    body = {
        "topic": topic,
        "type": type_,
        "messages": messages,
    }
    sign_source = get_sign_source(headers, body)
    signature = get_signature(sign_source, secret_key)
    headers["signature"] = signature
    resp = requests.post(url, headers=headers, data=json.dumps(body))
    return resp.text

def mysend():
    access_key = "your_access_key"
    secret_key = "your_secret_key"
    topic = "your_topic"
    type_ = "NORMAL"
    messages = []
    for i in range(10):
        messages.append({
            'body': 'message-%d' % i,
            'delaySeconds': random.randint(0, 10),
            'tag': 'tag-%d' % i,
            'properties': {str(random.randint(0, 100)): 'test'}
        })
    resp = send_message(access_key, secret_key, topic, type_, messages)
    print(resp)

if __name__ == '__main__':
    mysend()
```
