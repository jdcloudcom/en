# modifyInstanceDiskAttribute


## 描述
Modify the attributes of a data disk attached with a VM, including whether to delete with the machine.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceDiskAttribute

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dataDisks**|[InstanceDiskAttribute[]](##InstanceDiskAttribute)|False||Cloud Disk Service List|

### <a name="InstanceDiskAttribute">InstanceDiskAttribute</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Deleting this disk with the VM automatically when the machine is deleted. The default value is false, which cannot be changed.<br>This parameter does not take effect if the data disk in the VM is a monthly package.<br>This parameter does not take effect if the data disk in the VM is a shared data disk.<br>|
|**diskId**|String|False||Cloud disk service ID|

## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
