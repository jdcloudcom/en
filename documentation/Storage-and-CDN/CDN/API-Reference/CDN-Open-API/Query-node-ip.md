# **Query Node IP**

## **1. Description**

Query Node IP

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.</br> md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin secret key: agreed between the Parties;</br> example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain    | String   | Yes           | Domain names to be queried, separate multiple domain names by commas, parameter example "www.a.com,www.b.com" |


## **3. Return Parameter**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
| data     |  Return Data                        |


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/node_ip

- ### **Request Example**

```
https://opencdn.jcloud.com/api/node_ip
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com"
 }
```

- ### **Return Instructions**

* json Format

```
 {
    "status": 0, //0 means succeeded
    "message": "success",
    "data": {
    DOMAIN: [
    IP1,
    IP2,
    ],
    },
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "www.a.com": [
            "1.1.1.1",
            "2.2.2.2"
        ],
        "www.b.com": [
            "3.3.3.3",
            "4.4.4.4"
             ]
    }
}
```
