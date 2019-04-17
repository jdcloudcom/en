# describeSnapshot


## Description
Query cloud disk snapshot details

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots/{snapshotId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**snapshotId**|String|True| |Snapshot ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Cloud Disk Snapshot Details Queried|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**snapshot**|Snapshot| |
### Snapshot
|Name|Type|Description|
|---|---|---|
|**snapshotId**|String|Cloud Disk Snapshot ID|
|**snapshotSource**|String|There may be two snapshot sources of self, others|
|**diskId**|String|Cloud Disk ID used to create the snapshot (When snapshotSource is others, it will not display)|
|**snapshotSizeGB**|Integer|Snapshot Size, Unit: GiB|
|**images**|String[]|All image IDs associated with the snapshot (When snapshotSource is others, it will not display)|
|**name**|String|Snapshot Name|
|**description**|String|Snapshot Description|
|**status**|String|Snapshot Status, Value: creating, available, in-use, deleting, error_create or error_delete|
|**createTime**|String|Creation Time|
|**sharInfo**|ShareInfo[]|Sharing Information|
|**encrypted**|Boolean|Whether the snapshot is the snapshot of an encryption disk|
### ShareInfo
|Name|Type|Description|
|---|---|---|
|**shareTo**|String|pin of the User Sharing His/Her Snapshot|
|**shareTime**|String|Sharing Time|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
