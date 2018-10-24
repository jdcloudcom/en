# resizeInstance


## Description
Change instance type for VM.
The status of the VM must be <b>stopped</b>. <br>
For the machines created in 2016 with cloud disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other.<br>
For the virtual machine of which the local disk (local type) serves as the system disk, no mutual adjustment is allowed for instance specifications of the first and second generations.<br>
For the virtual machine created with high availability group (Ag), no mutual adjustment is allowed for instance specifications of the first and second generations.<br>
For the virtual machine of which the cloud disk service (cloud type) serves as the system disk, mutual adjustment is allowed for instance specifications of the first and second generations.<br>
If the number of elastic network interfaces in the current machine is greater than the number of elastic network interfaces allowed for new instance specification, error will be returned. Query <a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes”>DescribeInstanceTypes</a> API to obtain the instance specification information under the assigned region and availability zone.<br>
The image used for the current machine is required to support the target instance specification to be changed, or error will be returned. Query <a href="http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints”>DescribeImageConstraints</a> API to obtain the restriction information for instance specification of the assigned image.<br>
When the virtual machine is overdue or expires, the instance specification cannot be changed.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:resizeInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance type, can query<a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a> API for the instance type information of the specified zone or availability zone.|


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
