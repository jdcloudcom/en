# **Query UV/PV Data Separately by the Domain Name And the Region**

## **1. Description**

Query UV/PV data separately by the domain name and the region (area_isp_uv)

## **2. ** **Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00;  the time span for query cannot be greater than 1 days       |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
|  data      |  Return Data                        |


## **4.** **Calling Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/area_isp_uv

- ### **Request Example**

```
http://opencdn.jcloud.com/api/area_isp_uv
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
"status": 0,
"data": [{
 "domain": //DOMAIN,
  "data": [
     { 
    "time":TS1,//Time Stamp 1
    "area":AREA1, //Area 1
    "isp":ISP1, //Operator 1
    "uv": UV //UV Number
    "pv": PV //PV Number
    },
    ]
    },
]
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
                    "area": "zhejiang",
                    "isp": "ct",
                    "pv": 2153,
                    "time": "1513529100",
                    "uv": 0
                },
                {
                    "area": "zhejiang",
                    "isp": "cmcc",
                    "pv": 85,
                    "time": "1513529100",
                    "uv": 0
                },
                {
                    "area": "ningxia",
                    "isp": "ct",
                    "pv": 164,
                    "time": "1513530000",
                    "uv": 0
                }
            ]
        }
    ]
}
```
