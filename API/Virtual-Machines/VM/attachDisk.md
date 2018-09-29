# attachDisk


## 描述
Attach a data disk (cloud hard disk) for a virtual machine, and the Virtual Machines and the Cloud Disk Service are not attached when they are in progress. <br>
The virtual machine status must be running or stopped status. <br>
The VM of the local disk as system disk can be attached with eight data disks, and the VM of Cloud Disk Service can be attached with seven data disks.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/instances/{instanceId}:attachDisk

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Automatically delete this Cloud Disk Service with the machine, False by default. It supports only the cloud disk service that is paid by instance types. This parameter is not valid for a shared type cloud disk service.|
|**deviceName**|String|False| |The data disk logical attach point [vda, vdb, vdc, vdd, vde, vdb, vdg, vdh, vdi], vda required when the system disk is attached.|
|**diskId**|String|True| |Cloud Disk Service ID|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
