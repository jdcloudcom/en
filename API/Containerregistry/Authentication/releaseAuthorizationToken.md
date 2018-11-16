# releaseAuthorizationToken


## Description
Release token of the user’s registry.


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries/{registryName}:releaseAuthorizationToken

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorizationToken**|String|False| |The token ID to be released has the function to release the specified token.|
|**forceAll**|Boolean|False| |true means that all effective token marks under the current registry of the user will be deleted by force, while false means that all effective tokens will be deleted.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
