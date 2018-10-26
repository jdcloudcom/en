# rebuildInstance


## Description
Reset the VM OS used specified image.

The status of the VM must be <b>stopped</b>. 

If you do not specify the image ID, the VM will be rebuild used the original image by default. 

The system disk type of VM must be the same as the type supported by the image to be used. If the current system disk is local, then the rootDeviceType of the image must be loaclDisk. Similarly, the current system disk is cloud, then the rootDeviceType of the image must be cloudDisk. Can query the API  <a href="http://docs.jdcloud.com/virtual-machines/api/describeimages">DescribeImages</a> to obtain the image information for the specified region. 

The specified image must support the current instance type of VM, otherwise an error will occur. Can query the API <a href="http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints">DescribeImageConstraints</a> to obtain instance type limit information about the specified image.


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

