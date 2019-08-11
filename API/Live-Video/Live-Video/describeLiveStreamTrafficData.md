# describeLiveStreamTrafficData


## Description
Search Traffic Data
- Search traffic data within a certain period.
- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity.


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeLiveStreamTrafficData


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Playing domain, which bandwidth data produced under the domain can be searched through designating the domain. <br>|
|**appName**|String|False| |Pushing streaming, domain must be designated when taking AppName as search condition. <br>|
|**streamName**|String|False| |Streaming Name<br>|
|**ispName**|String|False| |[Operator](../Reference/Operator.md)<br>|
|**locationName**|String|False| |[Region](../Reference/Region.md), such as beijing, shanghai. Separated by commas when there are multiple pieces<br>|
|**protocolType**|String|False| |Type of searched stream protocol, value range:"rtmp,hdl,hls", separated by commas when there are multiple values<br>|
|**period**|String|False| |Search period, current value range: "oneMin, fiveMin, halfHour, hour, twoHour, sixHour, day, followTime", representing 1min, 5min, half an hour, 1 hour, 2 hours, 6 hours, 1 day, follow the time. It is null by default, representing fiveMin. When followTime is transmitted, representing as per the period of Endtime-StartTime, only one point is returned<br>|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|False| |Search End Time, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss’Z’<br>, it is the current time by default when null<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ruquestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|TrafficStatisticResult[]| |
### TrafficStatisticResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Time Point<br>|
|**endTime**|String|Time Point<br>|
|**data**|TrafficStatisticResultData| |
### TrafficStatisticResultData
|Name|Type|Description|
|---|---|---|
|**value**|Long|Traffic, Unit: Byte<br>|

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
https://live.jdcloud-api.com/v1/describeLiveStreamTrafficData?domainName=xxx
```

```
{
    "endTime": "2019-03-27T16:00:00Z", 
    "startTime": "2019-03-26T16:00:00Z"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "dataList": [
            {
                "data": {
                    "value": 188486700
                }, 
                "endTime": "2019-03-26T07:31:00Z", 
                "startTime": "2019-03-26T07:30:00Z"
            }, 
            {
                "data": {
                    "value": 376973400
                }, 
                "endTime": "2019-03-26T07:32:00Z", 
                "startTime": "2019-03-26T07:31:00Z"
            }, 
            {
                "data": {
                    "value": 376973400
                }, 
                "endTime": "2019-03-26T07:33:00Z", 
                "startTime": "2019-03-26T07:32:00Z"
            }
        ]
    }
}
```
