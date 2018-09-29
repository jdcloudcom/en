# attachNetworkInterface


## Description
A virtual machine attaches an elastic network interface <br>
The virtual machine status must be running or stopped status without being operated, the task is available. <br>
If the public IP is associated with the elastic network interface, the az of the public IP needs to be consistent with the az of the Virtual Machines, or the public network IP belongs to the full available zone to be attached. <br>
The number of the Virtual Machines to attach the elastic network interface cannot exceed the limit of the instance type. Can query <a href='https://www.jdcloud.com/help/detail/2901/isCatalog/1'> DescribeInstanceTypes</a> interface gives specification information for the specified zone or availability zone. <br>
The elastic network interface and the Virtual Machines must be under the same vpc.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instances/{instanceId}:attachNetworkInterface

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
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
