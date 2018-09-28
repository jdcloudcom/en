# restoreDisk


## Description
-   Data recovery operations can only be executed on the source Cloud Disk, from which the snapshot was taken.
-   Snapshots can be used for data recovery operations only if the source Cloud Disk is available.
-   After the Cloud Disk is restored, the current data will be cleared. Please be cautious.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}:restore

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True||Cloud Disk ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**snapshotId**|String|True||Snapshot ID used to recover the Cloud Disk|


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
