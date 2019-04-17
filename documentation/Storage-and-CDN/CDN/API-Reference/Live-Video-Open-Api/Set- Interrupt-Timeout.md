# **Set the pushing streaming interruption time-out period**

## **1. Description**

When the streamer abnormally ends pushing streaming (due to network interruption or as the streamer is temporarily paused, etc.), the playing end connection is interrupted according to the set time

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|
|timeout | String   | Yes           | Time-out period, of which the unit is second (s); time-out period is suggested to be set as >1s and <=60s; its threshold shall be no more than 120s |

## **3. Return Parameter**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/setPushStreamTimeout

- ### **Request Example**

```
{
    "username": "user_test",
    "signature": "ca4c56f85e3582f4d814cc77949c82a7",
    "domain":"test.jcloud.com",
    "timeout":"10"
}

```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "",
    "data": {
        "PublishNormalTimeout": 10
    }
}
```
