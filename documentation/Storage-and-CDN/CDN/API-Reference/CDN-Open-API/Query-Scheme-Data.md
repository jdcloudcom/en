# **Count traffic requests by protocols**

## **1. Description**

Count data of traffic requests by protocols (scheme_data)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           |User signature, verify user's identity information through md5 method to ensure information security. </br>md5=Date+username+SecretKey; date: The format is yyyymmdd; username: JD user name pin; secret key: Agreement between the Parties; </br>Example: For example, if the current date is October 23, 2016, the user pin is jcloud_00 and the user SecretKey is e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain to be searched, support search of multiple domains, parameter example "www.a.com,www.b.com"  |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example: 2016-12-14 07:00; |
| end_time   | String   | No           | Not a required parameter; if no parameter is transmitted, the current time is the default                             |
| ipType     | String   | No           | Value Range [ipv6,ipv4], the IP Type is not distinguished by default when not uploaded.  |


## **3. Return Parameter**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh succeeded, others failed |
| msg      | Notification Information                       |
| data     | Return Data                       |


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/scheme_data

- ### **Request Example**

```
https://opencdn.jcloud.com/api/scheme_data
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### **Return Instruction**

* json Format

```
{
"status": 0,//0 means this request succeeded
"data": [
{
"domain": "DOMAIN",//Searched domain, without http://
"data": [
[
TS, //Time Stamp
HTTP_FLOW,// http protocol traffic, unit: Btye
HTTPS_FLOW,// https protocol traffic, unit: Btye
HTTP_CONN,// http protocol requests
HTTPS_CONN,// http protocol requests
],
],
},
]
}

```
