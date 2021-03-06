# modifyContainerAttribute


## Description
Modify the container name and description.
Either name or description must be specified


## Request method
PATCH

## Request address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:modifyContainerAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|False| |Container Name|
|**description**|String|False| |Container description|


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
