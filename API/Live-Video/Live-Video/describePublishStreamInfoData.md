# describePublishStreamInfoData


## Description
Search Pushing Streaming Monitoring Data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describePublishStreamInfoData


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|
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
|**dataList**|PublishStreamInfoResult[]| |
### PublishStreamInfoResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Start Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|End Time Point, UTC time, Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**data**|PublishStreamInfoData| |
### PublishStreamInfoData
|Name|Type|Description|
|---|---|---|
|**streamName**|String|Streaming Name<br>|
|**fps**|String|Frame Rate<br>|
|**bitrate**|String|Code Rate, Unit: bps<br>|
|**pushEdgeNodeIps**|String[]|CDN Upstream Node IP List <br>|
|**anchorIps**|String[]|Streamer IP List<br>|
|**flvBandWidth**|Long|Flv View Bandwidth<br>|
|**flvPlayerCount**|Long|Flv View Number<br>|
|**hlsBandWidth**|Long|Hls View Bandwidth<br>|
|**hlsPlayerCount**|Long|Hls View Number<br>|

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
https://live.jdcloud-api.com/v1/describePublishStreamInfoData?domainName=yourdomain&appName=yourapp&streamName=yourstream&startTime=2018-10-21T10:00:00Z&&endTime=2018-10-22T10:00:00Z

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "dataList": [
            {
                "data": {
                    "anchorIps": [
                        "12.10.10.11", 
                        "12.10.10.12"
                    ], 
                    "bitrate": "700100", 
                    "flvBandWidth": "", 
                    "flvPlayerCount": "", 
                    "fps": "25.0", 
                    "hlsBandWidth": "", 
                    "hlsPlayerCount": "", 
                    "pushEdgeNodeIps": [
                        "121.123.123.123", 
                        "121.123.123.124"
                    ]
                }, 
                "endTime": "2018-10-21T10:01:00Z", 
                "startTime": "2018-10-21T10:00:00Z"
            }, 
            {
                "data": {
                    "anchorIps": [
                        "12.10.10.11", 
                        "12.10.10.12"
                    ], 
                    "bitrate": "700200", 
                    "flvBandWidth": "", 
                    "flvPlayerCount": "", 
                    "fps": "25.0", 
                    "hlsBandWidth": "", 
                    "hlsPlayerCount": "", 
                    "pushEdgeNodeIps": [
                        "121.123.123.123", 
                        "121.123.123.124"
                    ]
                }, 
                "endTime": "2018-10-21T10:02:00Z", 
                "startTime": "2018-10-21T10:01:00Z"
            }
        ]
    }
}
```
