# deleteKeypair


## Description
Delete key pairs.


## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs/{keyName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**keyName**|String|True| |Key Pair Name|

## Request parameter
None


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
