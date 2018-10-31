# modifyImageAttribute


## Description
Modify the image information, including name and description; Only allow your personal private image to be operated.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}:modifyImageAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification</a>.|
|**name**|String|False| |Name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification </a>.|


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
