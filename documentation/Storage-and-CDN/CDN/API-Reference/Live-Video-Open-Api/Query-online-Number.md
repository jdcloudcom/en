# **Search online number**

## **1. Description**

CDN sends pushing streaming interruption notification to the customer when the pushing streaming end streamer starts pushing streaming or the pushing streaming is interrupted or the pushing streaming ends.

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated Domain|
|app| String   | No  |Release Point, only support single search currently |
|stream | String   | No | Stream Name, only support single search currently|
|startTime | String   | No | Query Start Time |
|endTime | String   | No  | Query End Time, when there is no end time, take the current time; |
|isp | String   | No | Operator|
|area| String   | No  |Region |
|groupByDomain | String   | No | false by default, false means search of multiple domains, the searched data is the sum of domains, if it is true, meaning search of multiple domains, the searched data is data information independent of each domain|
|period  | String   | No |Granularity: one minute by default, granularity in one minute and granularity in five minutes can be searched; when the granularity is one minute, do not search by region and operator, the search time span is 30 days; search by region and operator, the search time span is 7 days; when the granularity is five minutes, do not search by region and operator, the search time span is 30 days; search by region and operator, the search time span is 1 day|

## **3. Return Parameter**

| **Name**   | **Description** | 
| ---------- | -------- |
| domain| Query Domain  | 
|detail | Return Data | 
| startTime| Query Start Time| 
| endTime| Query End Time| 
| area| Region|
| isp| Operator| 
| pv| Request Number| 
| onlineNumber| Online Number of People| 

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/streamOnlineNumber

- ### **Request Example**

```
{
    "username":"user_test",
    "signature":"5ca1d52777132a008ae30de039ec8cac",
    "domain":"test.live.com",
    "app":"live",
    "stream":"",
    "startTime":"2018-08-14 16:33",
    "endTime":"2018-08-14 16:35",
    "isp":"",
    "area":"",
    "groupByDomain":"false",
    "period":"oneMin"
    
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "",
    "data": [
        {
            "domain": "test.live.com",
            "data": [
                {
                    "startTime": "2018-08-14 16:33",
                    "endTime": "2018-08-14 16:34",
                    "area": "hubei",
                    "isp": "ct",
                    "pv": 9,
                    "onlineNumber": 2
                },
                {
                    "startTime": "2018-08-14 16:34",
                    "endTime": "2018-08-14 16:35",
                    "area": "hubei",
                    "isp": "ct",
                    "pv": 10,
                    "onlineNumber": 2
                }
            ]
        }
    ]
}
```
