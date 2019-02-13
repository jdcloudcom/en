# releaseAuthorizationToken


## Description
Release token of the user’s registry.


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}:releaseAuthorizationToken

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**authorizationToken**|String|False| |The token ID to be released has the function to release the specified token.|
|**forceAll**|Boolean|False| |true means that all effective token marks under the current registry of the user will be deleted by force, while false means that all effective tokens will be deleted.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
