# describeLiveStatisticGroupByAreaIsp


## Description
Search Region/Operator Group Statistics Data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeLiveStatisticGroupByAreaIsp


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Playing Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|
|**ispName**|String|False| |[Operator](../Reference/Operator.md)|
|**locationName**|String|False| |[Region](../Reference/Region.md), such as beijing, shanghai. Separated by commas when there are multiple pieces<br>|
|**protocolType**|String|False| |Type of searched stream protocol, value range:"rtmp,hdl,hls", separated by commas when there are multiple values<br>|
|**period**|String|False| |Search period, current value range: "oneMin, fiveMin, halfHour, hour, twoHour, sixHour, day, followTime", representing 1min, 5min, half an hour, 1 hour, 2 hours, 6 hours, 1 day, follow the time. It is null by default, representing fiveMin. When followTime is transmitted, representing as per the period of Endtime-StartTime, only one point is returned<br>|
|**startTime**|String|True| |Start Time<br>- UTC time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Examples: 2018-10-21T10:00:00Z<br>|
|**endTime**|String|False| |End Time:<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- When null, it is the current time by default, the search time span is less than 1 day<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|LiveStatisticGroupByAreaIspResult[]| |
### LiveStatisticGroupByAreaIspResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Start Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|End Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**data**|LiveStatisticGroupByAreaIspResultData| |
### LiveStatisticGroupByAreaIspResultData
|Name|Type|Description|
|---|---|---|
|**area**|String|Region<br>|
|**ispData**|LiveStatisticGroupByAreaIspResultIspData[]| |
### LiveStatisticGroupByAreaIspResultIspData
|Name|Type|Description|
|---|---|---|
|**isp**|String|Operator<br>|
|**playerCount**|Long|Online Number<br>|
|**bandwidth**|Long|Bandwidth, Unit: bps<br>|
|**maxBandwidthtime**|Long|Bandwidth Peak Value Time Point, Unit: Second<br>|
|**flow**|Long|Traffic, Unit: Byte|

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
https://live.jdcloud-api.com/v1/describeLiveStatisticGroupByAreaIsp?domainName=yourdomain&appName=yourapp&streamName=yourstream&startTime=2018-10-21T10:00:00Z&&endTime=2018-10-22T10:00:00Z

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "dataList": [
            {
                "data": {
                    "area": "hubei", 
                    "ispData": [
                        {
                            "bandwidth": 564887, 
                            "flow": 21183282, 
                            "isp": "ct", 
                            "maxBandwidthtime": 1560324000, 
                            "playerCount": 1
                        }
                    ]
                }, 
                "endTime": "2019-06-12T07:20:00Z", 
                "startTime": "2019-06-12T07:15:00Z"
            }, 
            {
                "data": {
                    "area": "hubei", 
                    "ispData": [
                        {
                            "bandwidth": 1324091, 
                            "flow": 49653440, 
                            "isp": "ct", 
                            "maxBandwidthtime": 1560324300, 
                            "playerCount": 1
                        }
                    ]
                }, 
                "endTime": "2019-06-12T07:25:00Z", 
                "startTime": "2019-06-12T07:20:00Z"
            }
        ]
    }
}
```
