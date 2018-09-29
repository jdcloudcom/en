# resizeInstance


## Description
Virtual Machines Change Specification Type
The status of the Virtual Machines must be stopped status. <br>
The Cloud Disk Service created in 16 years is the machine of the system disk, and the generation and the second generation specification type are not allowed to be adjusted to each other. <br>
Local disk (type) is the machine of the system disk, and the first generation and the second generation specification type are not allowed to be adjusted to each other. <br>
Machine, generation, and second-generation specification types created using availability group (Ag) do not allow mutual adjustment. <br>
The cloud disk service (cloud type) is the machine of the system disk, and the generation and the second generation specification type are allowed to adjust to each other. <br>
If the number of elastic network interfaces in the current machine is greater than the number of elastic network interfaces allowed by the specification type, an error is returned. Can query <a href='https://www.jdcloud.com/help/detail/2901/isCatalog/1'> DescribeInstanceTypes</a> interface gives specification information for the specified zone or availability zone. <br>
The image used by the current machine needs to support the target specification type to be changed, otherwise the error is returned. Can query <a href="https://www.jdcloud.com/help/detail/2872/isCatalog/1">DescribeImageConstraints</a> Interface obtains specification type limit information for the specified image <br>
The instance type cannot be changed when the user is in arrears with the VM fees.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instances/{instanceId}:resizeInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance type, query<a href='https://www.jdcloud.com/help/detail/2901/isCatalog/1'>DescribeInstanceTypes</a> API for the instance type information of the specified zone or AZ.|


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
