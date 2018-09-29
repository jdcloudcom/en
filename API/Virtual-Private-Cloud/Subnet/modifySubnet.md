# modifySubnet


## 描述
Modify subnet API

## 请求方式
PATCH

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subnetId**|String|True| |Subnet ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Subnet description information, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**subnetName**|String|False| |Subnet name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource Not Found|
