# **Query Total Data**

## **1. Description**

Query Total Data

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain names to be queried, separate multiple domain names by commas, parameter example "www.a.com,www.b.com" |
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

http://opencdn.jcloud.com/api/total_data

- ### **Request Example**

```
http://opencdn.jcloud.com/api/total_data
{
    "username" :"test_user",
    "signature" :"dbc1c1302d0a1baa48a256cbfc840317",
    "domain":"www.a.com,www.b.com",
    "start_time":"2017-12-18 00:00",
    "end_time":"2017-12-18 23:59"
   
 }
```

- ### **Return Instructions**

•        Json Format

```
{
    "status": 0,//0 means this request succeeded
    "msg": “Successful",
    "data": {
        "domian": "www.a.com,www.b.com",
        "data": {
            "oriflow": 19685.6,//Back-to-origin Traffic, MB
            "hitflow": 57683.25,//Hit Traffic, MB
            "oripvPercent": 0,//Proportion of Back-to-origin pv,%
            "oribandwidth": 5.78,//Back-to-origin Bandwidth, Mbps
            "oriflowPercent": 18,//Proportion of Back-to-origin Traffic,%
            "hitpv":  7454903,//Hit pv
            "toptime": "2017-12-18 18:20:00",//Peak Bandwidth Time Point
            "pv": 8535492,//pv
            "uv": 300102,//uv
            "flow": 112124.61,//Traffic, MB
            "oripv": 0,//Back-to-origin pv
            "bandwidth": 13.84//Bandwidth, Mbps
        }
    }
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "domian": "www.a.com,www.b.com",
        "data": {
            "oriflow": 19685.6,
            "hitflow": 57683.25,
            "oripvPercent": 0,
            "oribandwidth": 5.78,
            "oriflowPercent": 18,
            "hitpv": 7454903,
            "toptime": "2017-12-18 18:20:00",
            "pv": 8535492,
        "uv": 300102,
            "flow": 112124.61,
            "oripv": 0,
            "bandwidth": 13.84
        }
    }
}
```
