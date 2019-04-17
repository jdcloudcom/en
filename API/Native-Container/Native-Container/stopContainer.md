# stopContainer


## Description
Stop a single instance in the operating status and the container involved in a job can’t be started.


## Request method
POST

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:stopContainer

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
