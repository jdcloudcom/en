# shareImage


## Description
Shared Image allows you to operate only your private image, and a single image can be shared for up to 20 JD Cloud accounts. <br>
The packaging image does not currently support sharing.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images/{imageId}:share

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pins**|String[]|False| |The account that needs to be shared|


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
