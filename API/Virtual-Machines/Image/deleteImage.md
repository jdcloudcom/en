# deleteImage


## Description
Delete a private image that only allows you to operate your personal private image.<br>
If the image is shared to other users, the image can be deleted only when the sharing is released.


## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**imageId**|String|True| |Image ID|

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
