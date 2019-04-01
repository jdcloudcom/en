# openLiveRestart


## Description
Open Restart

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/liveRestart:open


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**restartDomain**|String|True|Restarted Pushing Streaming Domain|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
