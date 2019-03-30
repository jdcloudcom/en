# deleteLiveApp


## Description
Delete APP

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/apps/{publishDomain}/appNames/{appName}

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Live Pushing Streaming Domain|
|**appName**|String|True|Application Name|

## Request Parameter
None


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
