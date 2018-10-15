# attachDisk


## Description
Attach a data disk (cloud disk) for a virtual machine, and the attachment is only available when there is no task in progress for virtual machine and cloud disk.<br>
The virtual machine status must be <b>running</b> or <b>stopped</b> <br>
The virtual machine with local disk as system disk can be attached with 8 data disks, and 7 data disks for the virtual machine with cloud disk as system disk.


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:attachDisk

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Virtual Machine ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Automatically delete this cloud disk with the virtual machine, False by default. The parameter can only be modified for the cloud disks that pay by configuaration, while for the cloud disk with monthly package, the parameter is set as False by default and not to be modified. The parameter is invalid for shared cloud disk.|
|**deviceName**|String|False| |Data disk logical attaching point [vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi], vda is required when attached to system disk.|
|**diskId**|String|True| |Cloud Disk ID|


## Response Parameter
None


## Response Code
|Response Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
