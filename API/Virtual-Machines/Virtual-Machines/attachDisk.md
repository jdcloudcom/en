# attachDisk


## Description
Attach a cloud disk for a VM, and the attachment is only available when there is no task in progress of the VM or the cloud disk.

The VM status must be <b>running</b> or <b>stopped</b> 

The VM with a local disk as its system disk can attached 8 cloud disks, and for the VM with a cloud disk as its system disk, another 7 cloud disks can be attached except the system disk.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:attachDisk

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Automatically delete this cloud disk with the VM termination, False by default. The parameter can only be modified for the cloud disks that pay by configuaration, while for the cloud disk with monthly package, the parameter is set as False by default and not to be modified. |
|**deviceName**|String|False| |The device name of the data disks [vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi,vmj,vdk,vdl,vdm], it is required to be vda when the disk is  attached as the system disk.|
|**diskId**|String|True| |Cloud Disk ID|


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
