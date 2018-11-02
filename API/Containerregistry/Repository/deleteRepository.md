# deleteRepository


## Description
Delete a Repository under a specified user.


## Request Method
DELETE

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries/{registryName}/repositories/{repositoryName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|
|**repositoryName**|String|True| |Repository Name|

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
