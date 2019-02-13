# **Query Top IP**

## **1. Description**

Query Top IP

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | Yes           | JD User Name pin                                               |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.</br> md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties;</br> example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   |  Yes           | Time Format: yyyy-mm-dd hh:mi Reference example: 2016-12-14 07:00; the time span for query cannot be greater than 30 days|
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                             |
| topfield   | String   | Yes           | Fields of top query, only pv or flow can be uploaded. pv(requests),flow(traffic)     |
| pageNumber | int      | No           | Query the paging page number, 1 by default if not uploaded                                    |
| pageSize   | int      | No           | Query the paging number, 100 by default if not uploaded                                   |


## **3. Return Parameter**

| **Name** | **Description** |
| -------- | -------- |
| status   | Result Status |
| msg      | Note Information |
| data     | Return Data |


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/queryTopIP

- ### **Request Example**

```
https://opencdn.jcloud.com/api/queryTopIP
{
    "username" :"test_user",
    "signature" :"1e28b8b4a1feddcacce74fa8b7131499",
    "domain":"www.a.com",
    "start_time":"2017-12-18 00:00",
    "end_time":"2017-12-18 23:59",
    "topfield":"pv"
   
 }
```

- ### **Return Instructions**

* json Format

```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "count": 6,
        "list": [
            {
                "rank": 1,//top Ranking
                "pv": 12437657,//pv
                "flow": 6121.59,//Traffic
                "ip": "120.11.23.12"//TOPIP Value
            }
        ]
    }
}
```

- ### **Return Example**

* json Format

```
 {
    "status": 0,
    "msg": "Successful",
    "data": {
        "count": 3,
        "list": [
            {
                "rank": 1,
                "pv": 12437657,
                "flow": 6121.59,
                "ip": "1.1.1.1"
            },
            {
                "rank": 2,
                "pv": 256271,
                "flow": 146.04,
                "ip": "2.2.2.2"
            },
            {
                "rank": 3,
                "pv": 46620,
                "flow": 54321.06,
                "ip": "3.3.3.3"
            }
        ]
    }
}
```
