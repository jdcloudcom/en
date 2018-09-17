# associateElasticIp


## 描述
Associate elastic Ip interface to network interface

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}:associateElasticIp

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkInterfaceId**|String|True||networkInterface ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**elasticIpAddress**|String|False||Associated elastic Ip address|
|**elasticIpId**|String|False||Associated elastic Ip Id|
|**privateIpAddress**|String|False||Associate elastic Ip to assigned privateIp|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|



## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
