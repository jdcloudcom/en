# **Back-to-origin Policy Change**

## **1. Description**

Back-to-origin Policy Change

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| -------------- | -------- | ------------ | ------------------------------------------------------------ |
| username       | String   | Yes           | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain Name                                                     |
| type      | String   | Yes           | Type of Domain Name Service resources, currently only supports   web means static small files, download means large file acceleration, vod means video acceleration  (types not supported currently: dynamic means dynamic acceleration, live means live streaming acceleration) |
| sourceType     | String   | Yes           | ips: IP list, domain: Domain name, oss: oss back-to-origin                       |
| sourceType     | String   | Yes           | ips and domain must be in Json Format                                    |
| httpType          | String   | No           | http type, can only be http or https, http by default. When set as https, "Set Communications Protocol" APIs need to be called to upload certificates and private keys |
| backSourceType | String   | No           | Back-to-origin type, can only be http (port 80 back-to-origin) or https (port 443 back-to-origin), http by default |

 

## **3. Return Parameter**

| **Name**   | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                       |
| data     | Return Data                                                   |

 

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/changeSource

- ### **Request Example**

curl Request Example: 

```
curl -H “Content-type: application/json” -X POST -d ‘{“username”:“test_user”,“signature”:“914a3f412fd9bc1eec14bb5eb104d253”,“domain” :“www.b.com”, “type” :“web”,“sourceType” :“domain”,“source” :“[{’domain’:’source1.www.a.com’,’priority’:’1’},{’domain’:’source2.www.a.com’,’priority’:’2’}]”}’ http://opencdn.jcloud.com/api/changeSource
```

•        Json Format

```
html http://opencdn.jcloud.com/api/changeSource
{ 
“username”:“test_user”, 
“signature”:“d00f58f89e8cd55dc080aec0d8051845”, 
“domain”:“www.a.com”, 
“type”:“web”, 
“sourceType”:“domain”, 
“source”:“[{‘domain’:‘source1.www.a.com’,‘priority’:‘1’},{‘domain’:‘source2.www.a.com’,‘priority’:‘2’}]” 
}
```

- ### **Return Example**

•        Json Format

```
{
  "status": 0,
  "msg": “Successful",
  "data": "www.a.com"
}
```

 