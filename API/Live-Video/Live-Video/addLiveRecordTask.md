# addLiveRecordTask


## Description
Add Recording Point Print Task
- You can call this interface to accurately extract the part you need in the recorded file


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/records/{publishDomain}/appNames/{appName}/streamNames/{streamName}/task

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**recordTimes**|RecordTime[]|True| |Recording Time Set - 10 segments are supported at most, with multiple segments to be combined into one file - minimum time span of multiple segments cannot be less than 10s - maximum time span of multiple segments cannot be greater than 8 hours|
|**saveBucket**|String|True| |Bucket|
|**saveEndpoint**|String|True| |Storage Address|
|**recordFileType**|String|True| |Recording File Type<br>  - Value: ts,flv,mp4 (separate with ; before multiple types)<br>  - Case Insensitive<br>|
|**saveObject**|String|False| |Storage Path of Recording File :<br>  - Default Address: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}.{format}<br>|

### RecordTime
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|
|**endTime**|String|True| |End Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://live.jdcloud-api.com/records/push.yourdomain.com/appNames/yourapp/streamNames/yourstream/task
```


```
{
    "appName":"yourapp",
    "publishDomain":"push.yourdomain.com",
    "recordFileType":"mp4;flv",
    "recordTimes":[
        {
            "endTime":"2018-10-21T10:05:00Z",
            "startTime":"2018-10-21T10:00:00Z"
        },
        {
            "endTime":"2018-10-21T10:15:00Z",
            "startTime":"2018-10-21T10:10:00Z"
        }
    ],
    "saveBucket":"yourbucket",
    "saveEndpoint":"oss.xxx.com",
    "saveObject":"/xxx/xxx/yourobject",
    "streamName":"yourstream"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
