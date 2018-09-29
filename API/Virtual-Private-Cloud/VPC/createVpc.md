# createVpc


## 描述
Create VPC

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|False| |If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**description**|String|False| |VPC description, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**vpcName**|String|True| |VPC name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**vpcId**|String|VPC ID|

## 返回码
|返回码|描述|
|---|---|
|**409**|Parameter conflict |
|**200**|Successful Operation|
|**429**|Quota exceeded|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**404**|Not found|
