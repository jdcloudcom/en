# describeLiveStreamPublishList


## Description
View pushing streaming record under the domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streams/{publishDomain}/publishList

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Domain|

## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**appName**|String|False|Application Name of the Live Streaming|
|**streamName**|String|False|Live Streaming Name|
|**startTime**|String|True|Start Time|
|**endTime**|String|False|End Time|



## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "appName": "live",
        "streamName":"test-stream",
        "startTime":"2019-02-21T08:00:00Z",
        "endTime":"	2019-02-22T08:00:00Z",
    }

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
|**liveStreamPublishInfos**|LiveStreamPublishInfo[]|Online Pushing Streaming Set|
### LiveStreamPublishInfo
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Your Accelerated Domain|
|**appName**|String|Your APP|
|**streamName**|String|Your Stream Name|
|**publishUpTime**|String|Pushing Streaming Start Time  UTC Time|
|**publishDownTime**|String|Pushing Streaming Start Time  UTC Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
