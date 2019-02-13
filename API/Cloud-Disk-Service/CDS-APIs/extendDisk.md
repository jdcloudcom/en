# extendDisk


## Description
-   Expansion of the cloud disk requires it in available status.
-   When creating snapshot for a Cloud Disk, expansion is not allowed.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}:extend

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**diskId**|String|True| |Cloud Disk ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskSizeGB**|Integer|True| |The size of the cloud disk after expansion is in GiB|


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
