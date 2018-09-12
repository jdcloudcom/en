# removePermissionOfSubUser


## 描述
Disassociate policies for sub-users

## 请求方式
DELETE

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/subUser/{subUser}/permissions/{permissionId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**permissionId**|Integer|True||Permission id error|
|**regionId**|String|True||Region ID|
|**subUser**|String|True||Sub-user name|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
