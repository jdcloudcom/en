# attachNetworkInterface


## Description
Attach an ENI to a VM. 

The VM status must be <b>running</b> or <b>stopped</b>, and the attachment is only available when there is no task in progress of the VM. 

If some EIPs have associated with the ENI that to be attached, the az of the EIPs needs to be consistent with the az of the VM, or be all-AZs. 

The number of the ENIs attached to the VM cannot exceed the limit of its instance type. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a>API to get the upper limit of a specified instance type. 

The ENI and the VM must be in the same vpc.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:attachNetworkInterface

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Auto-delete with the VM termination, False by default.|
|**networkInterfaceId**|String|True| |ENI ID|


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
