# describeSnapshots


## Description
Query the list of cloud disk snapshots. Filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page Number: 1 by default; value range: [1, ∞)|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|
|**snapshotSource**|String|False| |Search the types of the snapshot, which may be private, others, shared, the default value is private|
|**filters**|Filter[]|False| |snapshotId - Cloud Disk Snapshot ID, support multiple<br>diskId - the Cloud Disk ID of the snapshot to be generated, support multiple<br>status - Snapshot status, accurate match, support multiple, value: creating, available, copying, deleting, error_create or error_delete<br>name - Snapshot Name, fuzzy match, support single<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Query Result Set|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**snapshots**|Snapshot[]|List of Snapshot Details Queried|
|**totalCount**|Integer|Number of Snapshots Queried|
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
|**500**|Internal server error|
|**503**|Service unavailable|
