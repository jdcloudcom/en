# ** Statistics of Detailed Data of Operators in Separated Areas**

## **1. Description**

Statistics of Detailed Data of Operators in Separated Areas (area_isp_stat)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature                                                    |
| domain      | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00; the time span for query cannot be greater than 1 hour  |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                             |

## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
| data     | Return Data                       |

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/area_isp_stat

- ### **Request Example**

```
http://opencdn.jcloud.com/api/area_isp_stat
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
[
TS, //Time Stamp
AREA, //Area
ISP, //Operator
BANDWIDTH, //Bandwidth, Unit: Mbps
PV, //Requests
HIT_RATIO, //Hit Ratio, type; float-point type, such as 0.5 means 50% Hit Ratio
{
CODE1: CODE1_COUNT, //CODE1 is a specific status code, such as 206, CODE1_COUNT
is count of 206,
CODE2: CODE2_COUNT, //CODE2 is a specific status code, such as 200, CODE2_COUNT
is count of 200
},
FST_PKG_TIME, //First Package Response Time, Unit: ms
SVG_SPEED, //Average Download Speed, Unit: KB/s
],
]
}
```

- ### **Return Example**

• Json Format

```
{
    "status": 0,
    "msg": "Successful",
    "data": [
        {
            "domain": "www.a.com",
            "data": [
                [
                    "1513533900",
                    "neimenggu",
                    "ct",
                    1.4548978805541992,
                    61,
                    1,
                    {
                        "200": 60,
                        "201": 0,
                        "206": 1,
                        "300": 0,
                        "301": 0,
                        "302": 0,
                        "304": 0,
                        "400": 0,
                        "403": 0,
                        "404": 0,
                        "408": 0,
                        "416": 0,
                        "499": 0,
                        "500": 0,
                        "501": 0,
                        "502": 0,
                        "503": 0,
                        "504": 0,
                        "other": 0
                    },
                    34.147540288671976,
                    1177.337890625
                ],
                [
                    "1513533900",
                    "neimenggu",
                    "cmcc",
                    0.027347564697265625,
                    1,
                    1,
                    {
                        "200": 0,
                        "201": 0,
                        "206": 1,
                        "300": 0,
                        "301": 0,
                        "302": 0,
                        "304": 0,
                        "400": 0,
                        "403": 0,
                        "404": 0,
                        "408": 0,
                        "416": 0,
                        "499": 0,
                        "500": 0,
                        "501": 0,
                        "502": 0,
                        "503": 0,
                        "504": 0,
                        "other": 0
                    },
                    0,
                    29268.666015625
                ]
    ]
]
}
```
