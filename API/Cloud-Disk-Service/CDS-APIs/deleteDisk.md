# deleteDisk


## Description
-   delete a cloud disk service billing by configuration. The disk types include the Premium Hdd Cloud Disk and the SSD Cloud Disk.
-   After the hard disk is deleted, the cloud disk snapshot can be retained.
-   When the disk is released, the state of the cloud disk is to-be-attached (Available).
-   If the disk of the specified ID does not exist, the request will be ignored.


## Request method
DELETE

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True||Cloud Disk Service ID|
|**regionId**|String|True||Region ID|

## Request parameter
无


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
