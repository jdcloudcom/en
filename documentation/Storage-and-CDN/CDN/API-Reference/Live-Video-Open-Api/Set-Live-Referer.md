# **Set referer blacklist and white list**

## **1. Description**

Set referer black and white list information

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated domain, the domain can be set only via the http protocol now                                                     |
| referType  | String   | Yes           | refer type, value: block (blacklist), allow (white list)            |
| referList  | String   | Yes           | The domain lists are separated by commas, if the referList is empty, it is deleted, namely there are no limits of blacklists and white lists |
| allowEmpty | String   | No           | Whether to allow empty refer access, values: on (allowed), off (denied), on by default    |


## **3. Return Parameters**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information                                                  |
| data     | Return Data                                                  |


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/setReferConfig

- ### **Request Example**

 https://opencdn.jcloud.com/api/live/setReferConfig

* json Format

```
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "referType" :"block",
    "referList" :"www.blanck1.com,www.blanck2.com",
    "allowEmpty" :"on"
 }
```

- ### **Return Example**

* json Format

```
{
  "status": 0,
  "msg": "Succeeded",
  "data": "www.a.com"
}
```
