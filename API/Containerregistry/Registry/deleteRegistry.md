# deleteRegistry


## Description
Delete a registry under a specified user.


## Request Method
DELETE

## Request Address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
