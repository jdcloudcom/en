# detachDisk


## 描述
For virtual machine uninstalling data disk,  a virtual machine,  and a cloud disk service are not loaded until they are in progress. <br>


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:detachDisk

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskId**|String|True||Cloud disk service ID|
|**force**|Boolean|False|False|Forced detachment, False by default. If this parameter is True, it represents the IO of the data disk is forcibly broken.|


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
