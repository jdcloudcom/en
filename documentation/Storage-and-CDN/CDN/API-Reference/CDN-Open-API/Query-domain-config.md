# **Query Domain Name Configuration**

## **1. Description**

Query the Domain Name Configuration

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain    | String   | Yes           | Queried domain names, only support querying one domain name                               |

## **3. Return Parameter** 

| **Name**         | **Description**                                                     |
| ---------------- | ------------------------------------------------------------ |
| status     | Result status, means whether the API request is succeeded, 0 means succeeded, others means failed |
| msg              | Note Information                                                     |
| data             | Domain Name Information Array                                                 |
| domain           | Accelerated Domain Name                                                     |
| ignoreArgs       | Ignore the parameter settings, off, on                              |
| rangeArgs        | Range parameter setting, off, on                             |
| httpType         | http types, can only be http or https, http by default. When set as https, "Set Communications Protocol" APIs need to be called to upload certificates and private keys |
| httpsCertificate | https certificate, if the HttpType of the accelerated domain name is http, then the item is blank         |
| httpsRsaKey      | https private key, if the HttpType of the accelerated domain name is http, then the item is blank          |
| httpsJumpType    | Jump Type, Values: default, http, https                         |



## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/queryDomainConfigs

- ### **Request Example**

```
http://opencdn.jcloud.com/api/queryDomainConfigs

{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.b.com"
    
 }
```

- ### **Return Example**

•        Json Format

```
{
    "status": 0,
    "msg": “Successful",
    "data": {
        "rangeArgs": "on",
        "httpsCertificate": "",
        "httpsJumpType": "",
        "httpsRsaKey": "",
        "httpType": "http",
        "ignoreArgs": "on"
    }
}
```