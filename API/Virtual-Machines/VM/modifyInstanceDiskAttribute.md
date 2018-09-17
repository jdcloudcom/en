# modifyInstanceDiskAttribute


## Description
Modify the attributes of a data disk attached with a VM, including whether to delete with the machine.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceDiskAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dataDisks**|[InstanceDiskAttribute[]](##InstanceDiskAttribute)|False||Cloud Disk Service List|

### <a name="InstanceDiskAttribute">InstanceDiskAttribute</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Deleting this disk with the VM automatically when the machine is deleted. The default value is false, which cannot be changed.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**diskId**|String|False||Cloud disk service ID|

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
