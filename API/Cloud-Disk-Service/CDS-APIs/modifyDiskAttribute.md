# modifyDiskAttribute


## Description
Modify the name or description of the cloud disk, specify either

## Request method
PATCH

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True| |Cloud Disk ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description of the cloud disk: It allows you to enter all characters under UTF-8 encoding, but no more than 256 characters.|
|**name**|String|False| |Name of the cloud disk: Only Chinese characters, numbers, uppercase and lowercase letters, English underscores '_' and hyphens '-' are allowed. It is not allowed to be blank and shall not exceed 32 characters.|


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
