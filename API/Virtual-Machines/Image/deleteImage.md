# deleteImage


## Description
Delete a private image that only allows you to operate your personal private image.
If the image is shared to other users, the image can be deleted only when the sharing is released.


## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images/{imageId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
