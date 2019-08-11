# describeLiveStreamOnlineList


## Description
Search Live Streaming Information

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streams/{publishDomain}/onlineList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range[1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range[10, 100]<br>|
|**appName**|String|False| |Application Name|


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
|**onlineStreamInfos**|OnlineStreamInfo[]|Online Pushing Streaming Set|
### OnlineStreamInfo
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**publishTime**|String|Pushing streaming time<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>|
|**publishUrl**|String|Pushing streaming address|

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
https://live.jdcloud-api.com/v1/streams/push.yourdomain.com/onlineList
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "onlineStreamInfos": [
            {
                "appName": "yourapp", 
                "publishDomain": "push.yourdomain.com", 
                "publishTime": "2015-12-02T06:58:04Z", 
                "publishUrl": "rtmp://push.yourdomain.com/yourapp/yourstream", 
                "streamName": "yourstream"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 1
    }
}
```
