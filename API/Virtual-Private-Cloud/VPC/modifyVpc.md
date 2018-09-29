# modifyVpc


## 描述
Modify VPC API

## 请求方式
PATCH

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/{vpcId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcId**|String|True| |Vpc ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |VPC description, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**vpcName**|String|False| |VPC name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**409**|Parameter conflict |
|**500**|Internal server error|
