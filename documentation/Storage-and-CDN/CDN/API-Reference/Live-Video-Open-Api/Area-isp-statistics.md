# Statistics of Detailed Data of Operators in Separated Areas

## 1 Description

Statistics of Detailed Data of Operators in Separated Areas (area_isp_data)

## 2  Request Parameter

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature                                                    |
| domain     | String   | Yes           | Domain name to be queried, support query of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes           | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00       |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |

 

## 3 Description of Returned Parameter Data

| **Name** | **Description**                                        |
| -------- | ----------------------------------------------- |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                                        |
| data     | Return Data                                                   |

## 4  Call Example

- ### Request Address

http://opencdn.jcloud.com/api/live/ area_isp_data

- ### Request Example

http://opencdn.jcloud.com/api/live/ area_isp_data
```
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### Return Instructions

* Json Format

```
{
"status": 0,//0 means this request succeeded
"data": [
[
TS, //Time Stamp
AREA, //Area
ISP, //Operator
BANDWIDTH, //Bandwidth, Unit: Mbps
flow,//traffic, unit: MB
],
]
}
```

- ### Return Example

* Json Format

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
                    34.147540288671976,
                ],
                [
                    "1513533900",
                    "neimenggu",
                    "cmcc",
                    20,
                    29268.666015625
                ]

]
]
}
```
