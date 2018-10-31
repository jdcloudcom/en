# modifyContainerAttribute


## Description
Modify the container name and description.


## Request method
PATCH

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:modifyContainerAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerId**|String|True| |Container ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Container description; the description must be specified|
|**name**|String|False| |Container Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
