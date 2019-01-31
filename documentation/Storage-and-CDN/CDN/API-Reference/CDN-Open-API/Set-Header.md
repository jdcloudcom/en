# **Set and delete header**

## **1. Description**

Set/delete Header request header and response header, Header is divided into request header and response header, response header means request parameters carried by CDN upon back-to-origin; response header means parameters returned back to the online users by CDN

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|
| headerType | String   | Yes           | Only value of req (request header)/resp(response header) can be taken|
| headerName | String   | Yes           | Parameter Name of header |
| headerValue| String   | Yes           | Value |

## **3. Description of Returned Parameter Data**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 

## **4. Request Address**
post Method

Set header APIs address: http://opencdn.jcloud.com/api/setHttpHeader

Delete header APIs address: http://opencdn.jcloud.com/api/deleteHttpHeader

## **5. Request Example**

```
http://opencdn.jcloud.com/api/setHttpHeader
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain":"www.a.com",
    "headerType" :"resp",
    "headerName":"Cache-Control",
    "headerValue":'no-cache'
 }
```

## **6. Return Instructions**

```
json Format
{
  "status": 0,
  "msg": "Succeeded",
  "data": "www.a.com"
}
```

# **Set header in batch**

## **1. Description**

Set Header request header and response header in batch, Header is divided into request header and response header, response header means request parameters carried by CDN upon back-to-origin; response header means parameters returned back to the online users by CDN (deletion of header APIs in batch is not supported now)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|
| headerContext | [] | Yes   |json character string array, [{"headerType":"resp","headerName":"Server","headerValue":"user CDN Server"}];</br>parameter description</br>headerType: Only value of req (request header)/resp(response header) can be taken; headerName: parameter name; headerValue: value|

## **3. Description of Returned Parameter Data**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 

## **4. Request Address**
post Method

http://opencdn.jcloud.com/api/batchSetHttpHeader

## **5. Request Example**

```
http://opencdn.jcloud.com/api/batchSetHttpHeader
{
    "username" :"use_test",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain":"www.a.com",
    "headerContext" :[{'headerType':'resp','headerName':'Server','headerValue':'user CDN Server'},{'headerType':'req','headerName':'Cache-Control','headerValue':'no-cache'}]
 }
```

## **6. Return Instructions**

```
json Format
{
  "status": 0,
  "msg": "Succeeded",
  "data": "www.a.com" 
}
```
