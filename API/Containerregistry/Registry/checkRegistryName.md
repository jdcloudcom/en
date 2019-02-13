# checkRegistryName


## Description
Query whether the assigned registry name exists and is in conformity with the naming specification.


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries:checkRegistryName

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry name to be verified.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|It represents whether the registry assigned by the user passes the verification, 0 means pass, 1 means that the name is blank, 2 means that the specifications are not met, and 3 means the name is duplicate|
|**reason**|String|Where the code field is not zero, please give the detailed reason.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
