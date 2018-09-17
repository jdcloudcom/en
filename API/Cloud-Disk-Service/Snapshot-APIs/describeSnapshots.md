# describeSnapshots


## Description
Query the list of cloud disk snapshots. Filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||snapshotId - cloud disk snapshot ID, support multiple<br>diskId - the cloud disk service ID of the snapshot to be generated, support multiple<br>Status - snapshot status, accurate match, support multiple, creating, available, in-use, deleting, error_create or error_delete<br>name - snapshot name, fuzzy match, support single<br>|
|**pageNumber**|Integer|False|1|Page number, defaults is 1; value range: [1, ∞)|
|**pageSize**|Integer|False|20|Page size, default is 20; value range: [10,100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Query Result Set|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**snapshots**|[Snapshot[]](##Snapshot)|List of snapshot information details queried|
|**totalCount**|Integer|Number of snapshots queried|
### <a name="Snapshot">Snapshot</a>
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**description**|String|Snapshot Description|
|**diskId**|String|Cloud disk service ID used to create the snapshot|
|**name**|String|Snapshot Name|
|**snapshotId**|String|Cloud Disk Snapshot ID|
|**snapshotSizeGB**|Integer|Snapshot Size, in GiB|
|**status**|String|Snapshot state, creating, available, in-use, deleting, error_create or error_delete|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**500**|Internal server error|
|**401**|Authentication failed|
|**503**|Service unavailable|
