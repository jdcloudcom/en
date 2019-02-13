# resizeInstance


## Description
Change instance type for VM.
The status of the VM must be <b>stopped</b>. <br>
For the machines created in 2016 with cloud disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other.<br>
For the virtual machine of which the local disk (local type) serves as the system disk, no mutual adjustment is allowed for instance specifications of the first and second generations.<br>
For the virtual machine created with high availability group (Ag), no mutual adjustment is allowed for instance specifications of the first and second generations.<br>
For the virtual machine of which the cloud disk service (cloud type) serves as the system disk, mutual adjustment is allowed for instance specifications of the first and second generations.<br>
1. General situation to create minimized parameter of a machine
|InstanceSpec.SystemDisk   | System Disk Configuration|
When the virtual machine is overdue or expires, the instance specification cannot be changed.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:resizeInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |VM ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance type, can query<a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a> API for the instance type information of the specified zone or availability zone.|


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
