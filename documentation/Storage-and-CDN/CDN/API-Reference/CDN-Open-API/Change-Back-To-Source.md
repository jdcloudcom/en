# **Back-to-origin Policy Change**

## **1. Description**

Back-to-origin Policy Change(changeSource)

## **2. Request Parameter**

| **Name**       | **Type** | **Compulsory or Not ** | **Description**                                                     |
| -------------- | -------- | ------------ | ------------------------------------------------------------ |
| username       | String   | Yes           | JD User Name pin                                               |
| signature      | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties; </br>Such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain Name                                                     |
| sourceType     | String   | Yes          |  1. Determine the Origin Server IP List or domain based on sourceType. </br>2. IP and domain back-to-origin must be in json format. ip back-to-origin example: "[{'ip': '1.1.1.1', 'priority': 'master', 'ratio': 0.6}, {'ip': '2.2.2.2', 'priority': 'master', 'ratio': 0.4}, {'ip': '3.3.3.3', 'priority': 'slave', 'ratio': 0.3}, {'ip': '4.4.4.4', 'priority': 'slave', 'ratio': 0.7}]", when ip is backed to origin, priority represents master and slave IP, master represents master, slave represents slave; domain back-to-origin example: "[{'domain':'www.a.com','priority':'1'},{'domain':'www.b.com','priority':'2’}]", when domain is backed to origin, priority represents the priority of domain, 1-5 represent the priority from high to low; OSS back-to-origin "oss.jcloud.com".</br>3. IP/domain is backed to origin, customized ports can be set, such as "[{'ip':'1.1.1.1:8080','master':1}]" |
| source         | String   | Yes           | IPs and domain must be in Json Format   |
| httpType       | String   | No            | HTTP type, can only be http or https, http by default. When set as https, "Set Communications Protocol" APIs need to be called to upload certificates and private keys |
| backSourceType | String   | No            | Back-to-origin type, can only be http (port 80 back-to-origin) or https (port 443 back-to-origin), http by default |
| sourceHost | String   | No |1. Customized back-to-origin host, only when the domain is back to origin, it can support the customized back-to-origin host </br>2. Customized back-to-origin host can be set for a single back-to-origin domain, for example when the back-to-origin domain is test1.com and test2.com, you can set the back-to-origin host corresponding to test1.com to origin1.com, and the back-to-origin host corresponding to test2.com to origin2.com </br>3. When parameter value is both set for sourceHost and defaultSourceHost, the sourceHost shall prevail </br>4. When the parameter is null, it means to delete the customized back-to-origin host |
| defaultSourceHost | String   | No|1. Default back-to-origin host, default back-to-origin host means that in the case of IP back-to-source or domain back-to-origin, the back-to-origin address corresponds to the same back-to-origin host. If the back-to-origin domain is test1.com and test2.com, the default back-to-origin host is origin.com, that is, the back-to-origin host of both test1.com and test2.com is origin.com; </br>2. When the parameter is null, it means to delete the default back-to-origin host |

## **3. Return Parameter**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                       |
| data     | Return Data                                                   |

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/changeSource

- ### **Request Example**

curl Request Example: 

```
curl -H "Content-type: application/json" -X POST -d ‘{"username":"test_user","signature":"914a3f412fd9bc1eec14bb5eb104d253","domain" :"www.b.com", "type" :"web","sourceType" :"domain","source" :"[{’domain’:’source1.www.a.com’,’priority’:’1’},{’domain’:’source2.www.a.com’,’priority’:’2’}]"}’ http://opencdn.jcloud.com/api/changeSource
```

* json Format

```
Domain Back-to-origin Example
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"domain",
    "source" :"[{'domain':'source1.a.com','priority':'1'},{'domain':'source2.a.com','priority':'2'}]"
 }
```

```
IP Back-to-origin Example

{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"ips",
    "source" :"[{'ip':'1.1.1.1','master':'1','ratio':0.6},{'ip':'2.2.2.2','master':'1','ratio':0.4},{'ip':'3.3.3.3','master':'2','ratio':'0.3'},{'ip':'4.4.4.4','master':'2','ratio':'0.7'}]"
 }
``` 

```
* Set the customized host example when the domain is back to origin
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"domain",
    "source" :"[{'domain':'source1.dev.opencdn.jcloud.com','priority':'1',"sourceHost":"source.a.com"},{'domain':'source2.dev.opencdn.jcloud.com','priority':'2',"sourceHost":"source.a.com"}]"
 }
```

```
* Set default host example when IP is back to origin

{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"ips",
    "source" :"[{'ip':'1.1.1.1','master':'1','ratio':0.6},{'ip':'2.2.2.2','master':'1','ratio':0.4},{'ip':'3.3.3.3','master':'2','ratio':'0.3'},{'ip':'4.4.4.4','master':'2','ratio':'0.7'}]",
    "defaultSourceHost" :"www.cdntest.com"
 } 
``` 

```
* Set the default back-to-origin host example when the domain is back to origin
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"domain",
    "source" :"[{'domain':'source1.a.com','priority':'1'},{'domain':'source2.a.com','priority':'2'}]",
    "defaultSourceHost" :"www.cdntest.com"
 }
```


- ### **Return Example**

* json Format

```
{
  "status": 0,
  "msg": "Successful",
  "data": "www.a.com"
}
```

 