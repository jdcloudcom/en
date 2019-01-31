# modifyInstanceNetworkAttribute


## Description
Modify the ENI attributes of the VM, including whether to delete ENI with the VM.
The attributes of primary network interface cannot be modified.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceNetworkAttribute

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networks**|InstanceNetworkAttribute[]|False| |List of ENIs|

### InstanceNetworkAttribute
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|False| |ENI ID|
|**autoDelete**|Boolean|False| |Auto-delete with the machine, False by default.|

## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
