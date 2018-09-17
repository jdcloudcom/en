# attachDisk


## Description
Attach a data disk (cloud hard disk) for a virtual machine,  and the virtual machine and the cloud disk service are not attached when they are in progress. <br>
The virtual machine status must be running or stopped status. <br>
The VM of the local disk as system disk can be attached with eight data disks, and the VM of cloud disk service can be attached with seven data disks.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:attachDisk

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False|False|Automatically delete this cloud disk service with the machine, False by default. It supports only the cloud disk service that is paid by instance types. This parameter is not valid for a shared type cloud disk service.|
|**deviceName**|String|False||The data disk logical attach point [vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi], vda required when the system disk is attached.|
|**diskId**|String|True||Cloud disk service ID|


## Return parameter
|Name|Type|Description|
|---|---|---|



## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
