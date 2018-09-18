# createSnapshot


## Description
-   Create a snapshot for the specified cloud disk service, and the status of the newly generated snapshot is creating.
-   The quota for single-user snapshots in the same region is 15.
-   To ensure data integrity, please stop writing to the cloud disk before creating a snapshot to ensure the integrity of snapshot data.
-   Before creating a snapshot, we suggest you uninstall the cloud disk service and reattach the disk to the virtual machine after the snapshot is created.
-   The life cycle of manual snapshots is independent from the cloud disk service. Please delete unnecessary snapshots in time.
-   The time demanded to create a snapshot depends on the capacity of the cloud disk service. The larger the capacity is, the longer it will take.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clientToken**|String|True|| Idempotence check parameter|
|**snapshotSpec**|SnapshotSpec|True||Create Snapshot Specification|

### <a name="SnapshotSpec">SnapshotSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Snapshot Description|
|**diskId**|String|True||Cloud disk service ID used to create the snapshot|
|**name**|String|True||Snapshot Name|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Result Set|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**snapshotId**|String|Snapshot ID Created|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
