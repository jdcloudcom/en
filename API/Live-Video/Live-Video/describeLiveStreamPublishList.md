# describeLiveStreamPublishList


## Description
View pushing streaming record under the domain

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
|**appName**|String|False| |Application Name of the Live Streaming|
|**endTime**|String|False| |End Time|
|**pageNum**|Integer|False| |page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**startTime**|String|True| |Start Time|
|**streamName**|String|False| |Live Streaming Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**liveStreamPublishInfos**|LiveStreamPublishInfo[]|Online Pushing Streaming Set|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Number|Search Total Amount|
### LiveStreamPublishInfo
|Name|Type|Description|
|---|---|---|
|**appName**|String|Your APP|
|**publishDomain**|String|Your Accelerated Domain|
|**publishDownTime**|String|Pushing Streaming Start Time  UTC Time|
|**publishUpTime**|String|Pushing Streaming Start Time  UTC Time|
|**streamName**|String|Your Stream Name|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
