# **Set Communications Protocol**

## **1. Description**

Set Communications Protocol

## **2. Request Parameter**

| **Name**    | **Description** | **Compulsory or Not** | **Description**                                                     |
| ----------- | -------- | ------------ | ------------------------------------------------------------ |
| username    | String   | Yes           | JD User Name PIN                                            |
| signature   | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain      | String   | Yes           | Accelerated Domain Name                                                     |
| httpType    | String   | Yes           | http Type*, *can only be http or https, http by default. When set as https, certificates and private keys need to be uploaded |
| certificate | String   | No           | User certificate, when httpType is https, it must be set                        |
| rsaKey      | String   | No           | Certificate private key, when httpType is https, it must be set                        |
| jumpType    | String   | No           | Set the jump type, there are three types: default, http, https; it is default by default, and should comply with the origin server; when httpType is https, it must be set |


## **3. Return Parameter**

| **Name**   | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                       |
| data     | Return Data                                                   |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/setHttpType

- ### **Request Example**

curl Request Example: 

```
curl -H “Content-type: application/json” -X POST -d ‘{“username”:“test_user”,“signature”:“914a3f412fd9bc1eec14bb5eb104d253”,“domain” :“www.a.com”,“httpType” :“https”,“certificate” :“start—-stop”,“rsaKey” :“start—stop”,“jumpType” :“https”}’ http://opencdn.jcloud.com/api/setHttpType
```

- Json Format

```
html http://opencdn.jcloud.com/api/setHttpType
{
  “username” :“test_user”, 
  “signature” :“d00f58f89e8cd55dc080aec0d8051845”, 
  “domain” :“www.a.com”, 
  “httpType” :“https”, 
  “certificate” :“start—-stop”, 
  “rsaKey” :“start—stop”, 
  “jumpType” :“https”
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
