# resizeInstance


## Description
Change Instance Types for VM.
The status of the VM must be <b>stopped</b>. 
For the machines created in 2016 with cloud disk as system disk, the instance types of the first generation and the second generation are not allowed to be adjusted to each other. <br>
The VM in the following situations is not allowed to resize between the different generations, such as resize between g.n1 and g.n2.
1. The system disk of the VM is cloud disk and the VM is created at 2016; 
2. The system disk of the VM is loacl disk;
3. The VM is created using availability group (AG)

If the ENI number of the VM is greater than the max number supported by the new instance type an error will occur. Can query the API <a href="http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes">DescribeInstanceTypes</a> to obtain instance type information under the specified region or availability zone.
If the image used by the current VM doesn't support the new instance type an error will occur. Can query the API <a href="http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints">DescribeImageConstraints</a> to obtain instance type limit information for the specified image.
The instance type cannot be changed when the VM in condition of arrearage or expiration.



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
