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
|**filters**|Filter[]|False| |snapshotId - Cloud Disk Snapshot ID, support multiple<br>diskId - the Cloud Disk ID of the snapshot to be generated, support multiple<br>status - Snapshot status, accurate match, support multiple, value: creating, available, in-use, deleting, error_create or error_delete<br>name - Snapshot Name, fuzzy match, support single<br>|
|**pageNumber**|Integer|False|1|Page Number: 1 by default; value range: [1, ∞)|
|**pageSize**|Integer|False|20|Paging Size: 20 by default; value range: [10,100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Query Result Set|


### Result
|Name|Type|Description|
|---|---|---|
|**snapshots**|Snapshot[]|List of Snapshot Details Queried|
|**totalCount**|Integer|Number of Snapshots Queried|
### Snapshot
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**description**|String|Snapshot Description|
|**diskId**|String|Cloud Disk ID used to create the snapshot|
|**name**|String|Snapshot Name|
|**snapshotId**|String|Cloud Disk Snapshot ID|
|**snapshotSizeGB**|Integer|Snapshot Size, Unit: GiB|
|**status**|String|Snapshot Status, Value: creating, available, in-use, deleting, error_create or error_delete|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**500**|Internal server error|
|**401**|Authentication failed|
|**503**|Service unavailable|
