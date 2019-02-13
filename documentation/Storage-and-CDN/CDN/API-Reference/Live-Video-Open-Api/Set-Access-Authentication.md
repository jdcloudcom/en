# **Set the URL authentication**

## **1. Description**

The legality of the streamer or net citizen can be verified based on MD5 algorithm authentication for pushing streaming domain or playing domain.

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|
|accessKey | String   | Yes           | Secret key, 8 to 32-bit character string  |
|accessKeyType | String   | Yes           | Authentication type, where 0 represents without authentication and 1 represents with authentication  |
|authLifeTime | String   | Yes           | Valid time, of which the unit is second |

## **3. Return Parameter**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 
| accessKey | Secret key, 8 to 32-bit character string | 
|accessKeyType | Authentication type, where 0 represents without authentication and 1 represents with authentication| 
|authLifeTime | Valid time, of which the unit is second | 

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/setAccessAuthentication

- ### **Request Example**

```
{
    "username": "user_test",
    "signature": "ca4c56f85e3582f4d814cc77949c82a7",
    "domain": "test.jcloud.com",
    "accessKey": "123456789",
    " authLifeTime ": " 1533818918 ",
    "accessKeyType": "1"
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "",
    "data": {
        "accessKeyType": 1,
        " authLifeTime ": " 1533818918 ",
        "accessKey": "123456789"
    }
}

```
