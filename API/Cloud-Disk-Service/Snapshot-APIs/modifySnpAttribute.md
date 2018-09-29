# modifySnpAttribute


## Description
Modify the name or description of the snapshot

## Request method
PATCH

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots/{snapshotId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**snapshotId**|String|True| |Snapshot ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Snapshot Description. Name or description must be specified|
|**name**|String|False| |Snapshot Name|


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
