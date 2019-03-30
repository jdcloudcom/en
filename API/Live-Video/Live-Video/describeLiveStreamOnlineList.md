# describeLiveStreamOnlineList


## Description
View all stream information that is being pushed under the domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streams/{publishDomain}/onlineList

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Domain|

## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|Page Value Range [1, 100000]|
|**pageSize**|Integer|False|Paging Size Value Range [10, 100]|
|**appName**|String|False|Application Name (APP)|

## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "appName": "live"
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
|**onlineStreamInfos**|OnlineStreamInfo[]|Online Pushing Streaming Set|
### OnlineStreamInfo
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Your Accelerated Domain|
|**appName**|String|Your APP|
|**streamName**|String|Your Stream Name|
|**publishTime**|String|Your Pushing Streaming Time|
|**publishUrl**|String|Your Pushing Streaming Address|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
