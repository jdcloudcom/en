# deleteImage


## Description
Delete a private image that only allows you to operate your personal private image.
若镜像已共享给其他用户，需先取消共享才可删除。


## Request method
DELETE

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True||Image ID|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|



## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
