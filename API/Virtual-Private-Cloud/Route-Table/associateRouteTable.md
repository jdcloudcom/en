# associateRouteTable


## 描述
Associate subnet API from route table

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}:associateRouteTable

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**routeTableId**|String|True| |RouteTable ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**subnetIds**|String[]|True| |Subnet ID list to be associated by route table, when subnet has been associated by other route tables, automatically disassociate.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource Not Found|
