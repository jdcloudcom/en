# deleteMountTarget


## Description
-   Relevant network interfaces will be deleted while the attached target is deleted.


## Request Method
DELETE

## Request Address
https://cfs.jdcloud-api.com/v1/regions/{regionId}/mountTargets/{mountTargetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**mountTargetId**|String|True| |Attached Target ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
