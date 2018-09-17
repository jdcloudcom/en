# modifyInstancePassword


## 描述
Modify the virtual machine password and the machine is not allowed to operate when there is no ongoing task. <br>
The new password will take effect after the VM is rebooted.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstancePassword

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**password**|String|True||Password,  <a href = "https://www.jdcloud.com/help/detail/3870/isCatalog/1 ">Refer to the public parameter specification</a>.|


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
