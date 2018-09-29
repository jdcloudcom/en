# createRouteTable


## 描述
Create route table

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**routeTableName**|String|True| |Route table name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**vpcId**|String|True| |VPC ID of Route Table|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**routeTableId**|String|Route Table ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**404**|Resource not found|
|**500**|Internal server error|
