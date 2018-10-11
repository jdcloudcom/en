# **Status Code Details**

## **1. ** **Description**

Status Code Details (hcode)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain      | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00; the time span for query cannot be greater than 31 days  |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                             |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
| data     | Return Data                       |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/hcode

- ### **Request Example**

```
http://opencdn.jcloud.com/api/hcode
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### **Return Instructions**

•        Json Format

```
{
"status": 0,//0 means this request succeeded
"data": [
{
"domain": "DOMAIN”,//Queried domain name, do not include http://
"data": [
[
TS, //Time Stamp
{
CODE1: CODE_COUNT1,// Corresponding count of a specific status code
CODE2: CODE_COUNT2,// Count of CODE2 is CODE_COUNT2
...... // Each codeN here represents one Status Code
Log Status Code includes:
200/206/301/302/304/400/401/403/
404/416/499/500/502/503/504/0/000
}
],
],
},
]
}
```

- **Return Example**

```
{
  "status": 0,
  "msg": "Successful",
  "data": [
    {
      "domain": "www.a.com",
      "data": [
        {
          "200": 0,
          "201": 0,
          "206": 10,
          "301": 0,
          "302": 10,
          "400": 0,
          "403": 0,
          "404": 0,
          "408": 0,
          "500": 0,
          "501": 0,
          "502": 0,
          "503": 0,
          "504": 0,
          "other": 0,
          "time": 1480990500
        },
        {
          "200": 0,
          "201": 0,
          "206": 10,
          "301": 0,
          "302": 0,
          "400": 0,
          "403": 0,
          "404": 0,
          "408": 0,
          "500": 0,
          "501": 0,
          "502": 0,
          "503": 0,
          "504": 0,
          "other": 0,
          "time": 1480990800
        }
      ]
    },
    {
      "domain": "www.b.com",
      "data": [
        {
          "200": 11443930,
          "201": 0,
          "206": 16050,
          "301": 0,
          "302": 0,
          "400": 510,
          "403": 0,
          "404": 7630,
          "408": 0,
          "500": 0,
          "501": 0,
          "502": 0,
          "503": 0,
          "504": 0,
          "other": 709530,
          "time": 1480989900
        },
        {
          "200": 11068840,
          "201": 0,
          "206": 17470,
          "301": 0,
          "302": 0,
          "400": 600,
          "403": 0,
          "404": 5930,
          "408": 0,
          "500": 0,
          "501": 0,
          "502": 0,
          "503": 0,
          "504": 0,
          "other": 716170,
          "time": 1480990200
        },
      ]
    }
  ]
}
```

 
