# ** Statistics of Detailed Data of Operators in Separated Areas**

## **1. Description**

Statistics of Detailed Data of Operators in Separated Areas (area_isp_stat_v2)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature                                                    |
| domain      | String   | Yes           | Domain name to be queried, support query of multiple domain names, the format is "www.a.com,www.b.com". The query result is the detailed data of each domain name |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00; the time span for query cannot be greater than 1 hour  |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, the time span is up to 1 hour and the granularity is 5 minutes.           |

## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
| data     | Return Data                       |

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/area_isp_stat_v2

- ### **Request Example**

```
http://opencdn.jcloud.com/api/area_isp_stat_v2
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### **Return Instructions**

• Json Format

```
{
"status": 0,//0 means this request succeeded
"data": [
[
TS, //Time Stamp
AREA, //Area
ISP, //Operator
BANDWIDTH, //Bandwidth, Unit: Mbps
flow, //traffic, unit: MB
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
                {
                    "time": "1539227100",
                    "area": "hebei",
                    "isp": "cmcc",
                    "bandwidth": 0.7114295959472656,
                    "flow": 26.678627967834473,
                    "pv": 11876,
                    "hitratio": 1,
                    "codestat": {
                        "200": 11601,
                        "201": 0,
                        "206": 0,
                        "300": 0,
                        "301": 0,
                        "302": 0,
                        "304": 0,
                        "400": 0,
                        "403": 275,
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
                    "firstpkgtime": 2.767766883647595,
                    "avgspeed": 569.2294921875
                },
                {
                    "time": "1539227100",
                    "area": "xinjiang",
                    "isp": "ct",
                    "bandwidth": 2.0854625701904297,
                    "flow": 78.20485877990723,
                    "pv": 11747,
                    "hitratio": 1.02,
                    "codestat": {
                        "200": 11747,
                        "201": 0,
                        "206": 0,
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
                    "firstpkgtime": 0.9670554039944506,
                    "avgspeed": 1125.3603515625
                }
            ]
        }
    ]
}

```
