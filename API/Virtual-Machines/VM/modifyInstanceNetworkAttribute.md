# modifyInstanceNetworkAttribute


## 描述
Modify the virtual machine's elastic network interface properties,  including whether to delete with the virtual machine. <br>
The primary network interface cannot be modified.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceNetworkAttribute

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networks**|[InstanceNetworkAttribute[]](##InstanceNetworkAttribute)|False||List of ENIs|

### <a name="InstanceNetworkAttribute">InstanceNetworkAttribute</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Auto-delete with the machine, False by default.|
|**networkInterfaceId**|String|False||ENI ID|

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
