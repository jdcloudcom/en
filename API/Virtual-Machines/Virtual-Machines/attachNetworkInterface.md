# attachNetworkInterface


## Description
Attach an elastic network interface for a virtual machine. <br>
The virtual machine status must be <b>running</b> or <b>stopped</b>, and the attachment is only available when there is no task in progress. <br>
If the public IP is associated with the elastic network interface, the az of the public IP needs to be consistent with the az of the Virtual Machines, or the public network IP belongs to the full availability zone to be attached. <br>
The number of virtual machines attached with the elastic network interface cannot exceed the limit of the instance type. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a>Interface gives specification information for the specified zone or availability zone. <br>
The elastic network interface and the virtual machines must be under the same vpc.


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
|**autoDelete**|Boolean|False| |Auto-delete with the machine, False by default.|
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
