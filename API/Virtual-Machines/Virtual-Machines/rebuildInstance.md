# rebuildInstance


## Description
Virtual machine uses the specified image to reset the VM system<br>
The status of the virtual machine must be <b>stopped</b>. <br>
If the system disk of the current virtual machine is of local type, the replacement image must be the localDisk type; similarly, if the system disk of the current virtual machine is of cloud type, the replacement image must be the cloudDisk type. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeimages">DescribeImages</a>Interface gets the image information for the specified zone. <br>
If you do not specify the image ID, the current machine's original image rebuild system is used by default. <br>
The specified image must be able to support the instanceType of the current machine, otherwise an error will occur. Can query<a href="http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints">DescribeImageConstraints</a> API for instance type limit information about the specified image.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:rebuildInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|False| |Image ID. Can query <a href="http://docs.jdcloud.com/virtual-machines/api/describeimages">DescribeImages</a> API for the image information of the specified zone.|
|**keyNames**|String[]|False| |The key pair name; only one is currently supported.|
|**password**|String|True| |VM password, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">Refer to the public parameter specification</a>.|


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
