# describeSnapshot


## Description
Query cloud disk snapshot information details

## Request method
GET

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots/{snapshotId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**snapshotId**|String|True||Snapshot ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Cloud disk snapshot information details queried|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**snapshot**|[Snapshot](##Snapshot)||
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
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
