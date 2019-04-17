# deleteDisk


## Description
-   Delete a Cloud Disk paid by configuration, Cloud Disk Service types include Premium Hdd Cloud Disk, SSD Cloud Disk, general SSD, performance-oriented SSD and capacity-oriented HDD.
-   When deleting a Cloud Disk, the status of it must be Available.
-   After a Cloud Disk has been deleted, the cloud disk snapshot can be retained.


## Request method
DELETE

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**diskId**|String|True| |Cloud Disk ID|

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
