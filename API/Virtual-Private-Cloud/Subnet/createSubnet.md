# createSubnet


## 描述
Create subnet

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|True| |Subnet Segment, Subnet Segment in VPC Cannot Overlap. Value Range of cidr: 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28. If VPC includes cidr, it must be the cidr subnet of VPC|
|**description**|String|False| |Subnet description information, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**routeTableId**|String|False| |Subnet associated route table Id, it is default route table of VPC by default|
|**subnetName**|String|True| |Subnet name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**vpcId**|String|True| |VPC ID of Subnet|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**subnetId**|String|Subnet ID|

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
