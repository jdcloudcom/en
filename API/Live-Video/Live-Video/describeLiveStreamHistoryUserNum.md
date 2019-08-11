# describeLiveStreamHistoryUserNum


## Description
Search Live Streaming Historic Online Number

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeLiveStreamHistoryUserNum


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Playing Domain|
|**appName**|String|False| |Application Name|
|**streamName**|String|False| |Stream Name|
|**ispName**|String|False| |[Operator](../Reference/Operator.md)<br>|
|**locationName**|String|False| |[Region](../Reference/Region.md), such as beijing, shanghai. Separated by commas when there are multiple pieces<br>|
|**protocolType**|String|False| |Type of searched stream protocol, value range:"rtmp,hdl,hls", separated by commas when there are multiple values<br>|
|**period**|String|False| |Search period, current value range: "oneMin, fiveMin, halfHour, hour, twoHour, sixHour, day, followTime", representing 1min, 5min, half an hour, 1 hour, 2 hours, 6 hours, 1 day, follow the time. It is null by default, representing fiveMin. When followTime is transmitted, representing as per the period of Endtime-StartTime, only one point is returned<br>|
|**startTime**|String|True| |Start Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|
|**endTime**|String|False| |End time:<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Is null, the current time by default<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|LiveStreamUserNumResult[]| |
### LiveStreamUserNumResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Start Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|End Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**data**|LiveStreamUserNumResultData| |
### LiveStreamUserNumResultData
|Name|Type|Description|
|---|---|---|
|**count**|Long|Number<br>|

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
GET
```
https://live.jdcloud-api.com/v1/describeLiveStreamHistoryUserNum?domainName=yourdomain&startTime=2018-10-21T10:00:00Z&&endTime=2018-10-22T10:00:00Z
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "dataList": [
            {
                "data": {
                    "count": 23
                }, 
                "endTime": "2018-10-21T10:01:00Z", 
                "startTime": "2018-10-21T10:00:00Z"
            }, 
            {
                "data": {
                    "count": 30
                }, 
                "endTime": "2018-10-21T10:02:00Z", 
                "startTime": "2018-10-21T10:01:00Z"
            }
        ]
    }
}
```
