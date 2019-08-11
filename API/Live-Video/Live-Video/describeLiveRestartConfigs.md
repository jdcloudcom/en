# describeLiveRestartConfigs


## Description
Search restart configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveRestart:configs


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|10|Segmentation size; it is 10 by default; value range[10, 100]|
|**restartDomain**|String|True| |Restarted Pushing Streaming Domain|


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
|**restartConfigs**|RestartConfig[]|Domain Set|

### RestartConfig
|Name|Type|Description|
|---|---|---|
|**publishDomains**|RestartPublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|RestartPlayDomain[]|Playing Domain Set|

### RestartPlayDomain
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**restartStatus**|String|Live Restart Status:<br>  on: Start<br>  off: Close<br>|
|**playType**|String|Playing Domain Type:<br>  normal: Normal Playing Domain(Timeshift Playing Domain)<br>  restart: Restart Playing Domain|

### RestartPublishDomain
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
