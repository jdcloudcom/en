# **Set URL authentication**

## **1. Description**

Set url authentication (setAccessKeyConfig)

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated Domain     |
| accesskeyType | String   | Yes           |Authentication type, where 0 represents without authentication, 1 represents parameter authentication, 2 represents path authentication |
| accesskeyKey | String   | Yes           | Password, the length is from 8 to 32 |
|accesskeyKeep | String   | Yes           |Whether it is back-to-origin authentication, 0 represents Yes, 1 represents No |

## **3. Return Parameters**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information                                                  |
| data     | Return Data                                                  |

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/setAccessKeyConfig

- ### **Request Example**

 https://opencdn.jcloud.com/api/setAccessKeyConfig

* json Format

```
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "accesskeyType" :"0",
    "accesskeyKey" :"526f20b2921957b",
    "accesskeyKeep" :"1"
 }
```

- ### **Return Example**

* json Format

```
{
  "status": 0,
  "msg": "Succeeded",
  "data": "test1.dev.opencdn.jcloud.com"
}

```

 
