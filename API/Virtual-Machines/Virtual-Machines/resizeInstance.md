# resizeInstance


## Description
Change Instance Types for Virtual Machines<br>
The status of the virtual machine must be <b>stopped</b>. <br>
For the machines created in 2016 with cloud disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other. <br>
For the machines with local disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other. <br>
For the machines created using availability group (Ag), the instance types of the first generation and the second generation are not allowed to be adjusted to each other. <br>
For the machines with cloud disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other. <br>
If the number of elastic network interfaces in the current machine is greater than the number of elastic network interfaces allowed by the instance type, an error will occur. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a>Interface obtains instance type information for the specified zone or availability zone. <br>
The image used by the current machine needs to support the target instance type to be changed, otherwise an error will occur. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints">DescribeImageConstraints</a>Interface obtains instance type limit information for the specified image <br>
The instance type cannot be changed when the user is in arrears with the VM fees.


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
