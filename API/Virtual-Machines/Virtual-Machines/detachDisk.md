# detachDisk


## Description
Detach a cloud disk for a VM.
The detachment is only available when there is no task in progress of the VM  and cloud disk. <br>


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:detachDisk

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskId**|String|True| |Cloud Disk ID|
|**force**|Boolean|False| |Forced detachment, False by default. If this parameter is True, it represents the IO of the data disk is forcibly broken.|


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
