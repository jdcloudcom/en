# **Billing Data Query**

## **1. Description**

Billing Data Query

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                               |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.</br> md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin secret key: agreed between the Parties;</br> example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00, the time span for query cannot be greater than 31 days  |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |
| type       | int      | No           | Not compulsory parameter, billed based on 95 by default if not uploaded, month 95 peak = 2, daily average peak bandwidth = 3, peak bandwidth (omitting three peaks)= 4, monthly traffic = 5 |


## **3. Return Parameter**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
|  data      |  Return Data                        |


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/fee

- ### **Request Example**

```
https://opencdn.jcloud.com/api/fee
{
    "username" :"test_user",
    "signature" :"8480204f27968a53d6dbfee99157339f",
    "domain" :"www.a.com",
    "start_time" :"2017-11-01 14:08",
    "end_time" :"2017-11-30 16:08",
    "type":3
 }
```

- ### **Return Instructions**

* json Format

```
{
    "status": 0,//0 means this request succeeded
    "msg": "Successful",
    "data": {
        "domian": "www.a.com",//Queried domain name, do not include http://
        "data": {
            "feeData": 4787.29,//Bandwidth, Mbps
            "feeTime": [
                "2017/11/23 19:15" //Time
            ]
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
        "domian": "www.a.com",
        "data": {
            "feeData": 4787.29,
            "feeTime": [
                "2017/11/23 19:15"
            ]
        }
    }
}
```
