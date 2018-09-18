# **Query Top URL**

## **1. Description**

Query Top URL

## **2. ** **Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature                                                     |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00       |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |
| topfield   | String   | Yes           | pv(requests),flow(traffic),bandwidth(bandwidth)                        |
| params     | String   | No           | Whether with parameters or not, true or false, true means with parameters, false means without parameters, not uploading is equal to without parameters |
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

http://opencdn.jcloud.com/api/queryTopUrl

- ### **Request Example**

```
http://opencdn.jcloud.com/api/queryTopUrl
{
    "username" :"test_user",
    "signature" :"1e28b8b4a1feddcacce74fa8b7131499",
    "domain":"www.a.com",
    "start_time":"2017-12-18 00:00",
    "end_time":"2017-12-18 23:59",
    "topfield":"pv",
    "params":"true"
   
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
                "rank": 1,
                "pvRatio": 0.38,
                "pv": 44155,
                "flow": 51446.52,
                "flowRatio": 57.58,
                "url": "www.a.com/no-cache/resource.ppt",
                "bandwidth": 131.25
            },
            {
                "rank": 2,
                "pvRatio": 0.23,
                "pv": 27337,
                "flow": 31841.6,
                "flowRatio": 35.64,
                "url": " www.a.com /cdn-mon/resource.ppt",
                "bandwidth": 71.98
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
        "count": 6,
        "list": [
            {
                "rank": 1,
                "uv": 44191,
                "oridata": null,
                "pvRatio": 97.27,
                "pv": 12437657,
                "flow": 6121.59,
                "flowRatio": 5.33,
                "bandwidth": 6121.59,
                "url": "www.a.com/cdn-mon/monitor.html"
            },
            {
                "rank": 2,
                "uv": 153,
                "oridata": null,
                "pvRatio": 2,
                "pv": 256271,
                "flow": 146.04,
                "flowRatio": 0.13,
                "bandwidth": 6121.59,
                "url": "www.a.com/no-cache/monitor.html"
            },
            {
                "rank": 3,
                "uv": 4884,
                "oridata": null,
                "pvRatio": 0.36,
                "pv": 46620,
                "flow": 54321.06,
                "flowRatio": 47.32,
                "bandwidth": 6121.59,
                "url": "www.a.com/cdn-mon/resource.ppt"
            },
            {
                "rank": 4,
                "uv": 4875,
                "oridata": null,
                "pvRatio": 0.36,
                "pv": 46533,
                "flow": 54199.88,
                "flowRatio": 47.22,
                "bandwidth": 6121.59,
                "url": "www.a.com/no-cache/resource.ppt"
            },
            {
                "rank": 5,
                "uv": 5,
                "oridata": null,
                "pvRatio": 0,
                "pv": 7,
                "flow": 0.01,
                "flowRatio": 0,
                "bandwidth": 6121.59,
                "url": "www.a.com/"
            },
            {
                "rank": 6,
                "uv": 1,
                "oridata": null,
                "pvRatio": 0,
                "pv": 1,
                "flow": 0,
                "flowRatio": 0,
                "bandwidth": 6121.59,
                "url": "www.a.com/cdn-mon/monitor.jpg?Mon%20Dec%2018%202017%2000:08:48%20GMT+0800%20(CST)0.12802168394632263"
            }
           
        ]
    }
}
```
