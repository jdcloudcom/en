# **Back-to-origin Bandwidth Statistics**

## **1. Description**

Back-to-origin Bandwidth Statistics APIs (origin_ratio)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain      | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00       |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                             |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
| data     | Return Data                       |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/origin_ratio

- ### **Request Example**

```
http://opencdn.jcloud.com/api/origin_ratio
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### **Return Instructions**

  ### •        Json Format

```
{
"status": 0,//0 means this request succeeded
"data": [
{
"domain": "DOMAIN”,//Queried domain name, do not include http://
"data": [
{
"time": TS,//Time Stamp
"bandwidth": BANDWIDTH,//Bandwidth, Mbps
"originBandwidth":ORIGINBANDWIDTH,//Back-to-origin Bandwidth, Mbps
"originRatio": ORIGINRATIO,//Proportion, percentage, computing formula (Back-to-origin Bandwidth/Total Bandwidth)*100
},
],
},
]
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Successful",
    "data": [
        {
            "domain": "www.a.com",
            "data": [
                {
                    "time": 1513540200,
                    "originRatio": 23.62,
                    "originBandwidth": 1.53,
                    "bandwidth": 6.46
                },  
{
                    "time": 1513588500,
                    "originRatio": 6,
                    "originBandwidth": 0.81,
                    "bandwidth": 13.5
                }
            ]
        }
    ]
}
```
