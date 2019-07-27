# **Search stream list**

## **1. Description**

Search stream list information in a specific time period, including pushing streaming start time and end time, client IP, edge node IP, etc.

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           |User signature, verify user's identity information through md5 method to ensure information security. </br>md5=Date+username+SecretKey; date: The format is yyyymmdd; username: JD user name pin; secret key: Agreement between the Parties; </br>Example: For example, if the current date is October 23, 2016, the user pin is jcloud_00 and the user SecretKey is e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)|
| domain     | String   | Yes           |Searched domain, only support search of one domain|
|app| String   | No  |app name, not the required item, if the item is filtered as per the stream name, it must be transmitted |
|stream | String   | No | Stream name, null transmission means to search all stream names|
|startTime | String   | Yes | Format of pushing streaming start time: yyyy-MM-dd HH:mm |
|endTime | String   | Yes| Format of pushing streaming end time: yyyy-MM-dd HH:mm  |
|pageNum | String   | No | The first page is not transmitted by default	|
|pageSize| String   | No  |Paging size, 10 entries are not transmitted by default |

## **3. Return Parameter**

| **Name**   | **Description** | 
| ---------- | -------- |
| status| It means whether the API request is successful or not, 0 means succeeded, any other number means failed  | 
|msg |Notification Information | 
|data | Return Data | 
| domain| Query Domain  | 
|pushStreams | Stream List | 
| app| Release Point Name | 
|stream |Stream Name | 
| clientIp| Client IP|
| nodeIp| Edge Node IP| 
| startTime| Pushing streaming start time, in format of UTC time | 
|endTime| Pushing streaming end time, in format of UTC time| 

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/queryPublishStream

- ### **Request Example**

```
{
  "username": "test_user",
  "signature": "03b10d0f0a8dd3bb9014ece6f8be72bc",
  "domain": "live.a.com",
  "startTime": "2019-05-17 00:00",
  "endTime": "2019-05-18 01:00"，
  "appName":"app_test1"
  "pageNum": 1,
  "pageSize": 10
}

```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "",
    "data": {
        "domain": "live.a.com",
        "total": 2,
        "pushStreams": [
            {
                "stream": "test1",
                "clientIp": "10.226.143.204",
                "nodeIp": "",
                "startTime": "2019-05-17T09:05:15Z",
                "endTime": "2019-05-17T09:15:12Z",
                "duration": 597
            },
            {
                "stream": "test2",
                "clientIp": "10.226.143.204",
                "nodeIp": "",
                "startTime": "2019-05-17T09:05:15Z",
                "endTime": "2019-05-17T09:15:12Z",
                "duration": 597
            }
        ]
    }
}

```
