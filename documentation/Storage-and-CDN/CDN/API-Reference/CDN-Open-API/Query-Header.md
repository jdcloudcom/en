# **Search header setting**

## **1. Description**

Search parters and values set by Header request header and response header. Header is divided into request header and response header. Request header means request parameters carried by CDN upon back-to-origin; response header means parameters returned back to the online users by CDN

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|

## **3. Description of Returned Parameter Data**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 
| headerType| Only value of req (request header)/resp(response header) can be taken | 
| headerName |Parameter Name of header | 
|headerValue|Value| 

## **4. Request Address**
post Method

http://opencdn.jcloud.com/api/queryHttpHeaderConfig

## **5. Request Example**

```
http://opencdn.jcloud.com/api/queryHttpHeaderConfig
{
    "username" :"use_test",
    "signature" :"1e28b8b4a1feddcacce74fa8b7131499",
    "domain":"www.a.com"
 }
```
## **6. Return Instructions**

```
•json format
{
    "status": 0,
    "msg": "Succeeded",
    "data": {
        "headerContext": [
            {
                "headerName": "cache-control",//header Name
                "headerType": "resp",
                "headerValue": "no-cache"
            },
            {
                "headerName": "Content-Type",
                "headerType": "resp",
                "headerValue": "web"
            }
        ]
    }
}
```
