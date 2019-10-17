### Description

Back-to-origin Statistics (origin)

### Request Parameter

| **Name**      | **Type** | **Compulsory or not** | **Description**                          |
| ----------- | ------ | -------- | ------------------------------- |
| username      | String | Yes        | JD User Name pin                          |
| signature  | String | Yes        | User Signature                    |
| domain      | String | Yes        | Domain requiring downloading logs, supporting download of multiple domains, parameter example: "test1.jcloud.com,test2.jcloud.com" |
| start_time      | String | Yes        | Time Format: yyyy-mm-dd hh:mi Reference Example: 2016-12-14 07:00 |
| end_time      | String | No        | Not a required parameter; if no parameter is transmitted, the current time is the default |


### Description of Returned Parameter data

| **Name**         | **Description**               |
| -------------- | -------------------- |
| status      | Result status 0 means succeeded, others mean failed            |
| msg | Notification Information                   |
| data | Return Data   |

### Call Example

##### Request Example

```html
http://opencdn.jcloud.com/api/origin
{
	"username" :"test_user",
	"signature" :"d847267fc702273abf394dd0c3128d64",
	"domain" :"www.a.com,www.b.com",
	"start_time" :"2016-12-14 07:00",
	"end_time" :"2016-12-14 12:59"
 }


 ```

##### Return Instructions

* json Format

```json
{
"status": 0,//0 means this request succeeded
"data": [
{
"domain": "DOMAIN",//Queried domain name, do not include http://
"data": [
[
TS, //Time Stamp
BANDWIDTH, //Back-to-origin Bandwidth, unit:bps
PV, //back-to-source requests
{
CODE1 : CODE1_COUNT, // CODE1 is a specific status code, such as 206,
CODE1_COUNT is count of 206,
CODE2 : CODE2_COUNT, // CODE2 is a specific status code, such as 200,
CODE2_COUNT is count of 200,
}, //back-to-source status code
],
],
},
]
}




```

##### Return Example
```json
{
    "status": 0,
    "msg": "Successful",
    "data": [
        {
            "domain": "www.a.com",
            "data": [
                [
                    1568477100,
                    0,
                    1,
                    {
                        "0": 0,
                        "200": 0,
                        "201": 0,
                        "204": 0,
                        "206": 0,
                        "300": 0,
                        "301": 1,
                        "302": 0,
                        "464": 0,
                        "465": 0,
                        "466": 0,
                        "512": 0,
                        "605": 0,
                        "612": 0,
                        "613": 0,
                        "other": 0,
                        "000": 0
                    }
                ]
            ]
        }
    ]
}


```
