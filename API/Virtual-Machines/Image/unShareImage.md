# unShareImage


## Description
Unshared images only allow you to operate your personal private image.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}:unshare

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pins**|String[]|False| |The account that needs to be cancelled|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
