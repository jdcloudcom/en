# describeLiveStreamPublishList


## Description
View Pushing Streaming History Record

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streams/{publishDomain}/publishList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page<br><br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br><br>- Value Range [10, 100]<br>|
|**appName**|String|False| |Application Name|
|**streamName**|String|False| |Stream Name|
|**startTime**|String|True| |Pushing Streaming Start Time<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Support searching streaming data within up to 90 days<br>|
|**endTime**|String|False|Current Time|Pushing Streaming End Time<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Support searching streaming data within up to 90 days<br>- If end time is null, it’s the current time by default<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**liveStreamPublishInfos**|LiveStreamPublishInfo[]|Pushing Streaming History Set|
### LiveStreamPublishInfo
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**publishUpTime**|String|Pushing Streaming Start Time- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**publishDownTime**|String|Pushing Streaming End Time<br>- UTC time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>|

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
https://live.jdcloud-api.com/v1/streams/push.yourdomain.com/onlineList?appName=yourapp&streamName=yourstream&startTime=2015-12-02T01:00:00Z&endTime=2015-12-02T04:00:00Z
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "liveStreamPublishInfos": [
            {
                "appName": "yourapp", 
                "publishDomain": "push.yourdomain.com", 
                "publishDownTime": "2015-12-02T03:11:19Z", 
                "publishUpTime": "2015-12-02T03:05:53Z", 
                "streamName": "yourstream"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 1
    }
}
```
