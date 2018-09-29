# modifyRouteTable


## 描述
Modify route table attribute

## 请求方式
PATCH

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**routeTableId**|String|True| |RouteTable ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Route Table Description. Value Range: 0-256 of all characters entered under UTF-8 coding|
|**routeTableName**|String|False| |Route Table Name Value Range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|


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
