# **Set IP black list and white list**

## **1. Description**

Set IP black list and white list.

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)|
| domain     | String   | Yes           | Accelerated Domain|
| ipList   | String | Yes        | Separate ip lists with commas. If ipList is null, it will be deleted and at most 50 entries can be deleted  |
| ipListType   | String | No        | IP list type (i.e., black list or white list), the default value is black, with value range of [black,white] |

## **3. Return Parameters**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/setIpBlackList

- ### **Request Example**

```
{
    "username" :"jd_cdntest",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "ipList" :"10.112.3.1,12.20.1.2",
    "ipListType":"black"
 }
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Succeeded",
    "data": "test.jcloud.com"
    }
}
```
