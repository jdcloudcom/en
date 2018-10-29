# checkRegistryName


## Description
Query whether the assigned registry name exists and is in conformity with the naming specification.


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries:checkRegistryName

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry name to be verified.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|It represents whether the registry assigned by the user passes the verification, 0 means pass, 1 means that the name is blank, 2 means that the specifications are not met, and 3 means the name is duplicate|
|**reason**|String|Where the code field is not zero, please give the detailed reason.|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
