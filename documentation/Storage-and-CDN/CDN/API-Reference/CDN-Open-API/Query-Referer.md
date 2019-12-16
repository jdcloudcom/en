# **Search referer Blacklist and White List**

## **1. Description**

Search referer blacklist and White List information (queryReferConfig)

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated Domain     |
| ipType     | String   | No           | Value Range [ipv6,ipv4], the IP Type is not distinguished by default when not uploaded.  |


## **3. Return Parameters**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information                                                  |
| data     | Return Data                                                  |
|domain   | Accelerated Domain                                                 |
|referType   |refer type, value: blacklist, White List      |
|referList | For the domain list separated by commas; if the referList is uploaded empty, it is deleted  |
|allowEmpty | Whether to allow null refer access, values: on (allowed), off (denied), on by default |

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/queryReferConfig

- ### **Request Example**

 https://opencdn.jcloud.com/api/queryReferConfig

* json Format

```
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com"
 }
```

- ### **Return Example**

* json Format

```
{
  "status": 0,
  "msg": "Succeeded",
  "data": {
      "domain" :"www.a.com",
      "referType" :"Blacklist",
      "referList" :"www.b.com,www.c.com",
      "allowEmpty" :"on"
  }
}


```

 
