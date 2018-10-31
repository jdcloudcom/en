# deleteSecret


## Description
Delete a single secrete


## Request method
DELETE

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Secret Name|
|**regionId**|String|True| |Region ID|

## Request parameter
None


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
