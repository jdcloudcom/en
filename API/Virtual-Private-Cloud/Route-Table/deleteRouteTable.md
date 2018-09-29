# deleteRouteTable


## 描述
Delete route table

## 请求方式
DELETE

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**routeTableId**|String|True| |RouteTable ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**404**|Resource Not Found|
|**500**|Internal server error|
