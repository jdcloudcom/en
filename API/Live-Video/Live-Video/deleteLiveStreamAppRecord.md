# deleteLiveStreamAppRecord


## Description
Delete APP record configuration

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/recordApps/{publishDomain}/appNames/{appName}/templates/{template}

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Accelerated Domain|
|**appName**|String|True|Application Name of the Live Streaming|
|**template**|String|True|Recording Template Customized Name|

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
