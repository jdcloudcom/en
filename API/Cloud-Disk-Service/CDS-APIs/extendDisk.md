# extendDisk


## Description
-   Expansion of the cloud disk requires it in available status.
-   Capacity expansion is not allowed while the disk is creating a snapshot.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}:extend

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True| |Cloud Disk Service ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskSizeGB**|Integer|True| |The size of the cloud disk after expansion is in GiB|


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
