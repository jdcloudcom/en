# **Query Top IP**

## **1. Description**

Query Top IP

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | Yes           | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature                                                     |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00       |
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

http://opencdn.jcloud.com/api/queryTopIP

- ### **Request Example**

```
http://opencdn.jcloud.com/api/queryTopIP
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

•        Json Format

```
{
    "status": 0,
    "msg": “Successful",
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

•        Json Format

```
 {
    "status": 0,
    "msg": “Successful",
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
