# associateElasticIp


## 描述
Associate elastic IP API to network interface

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}:associateElasticIp

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkInterfaceId**|String|True| |networkInterface ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**elasticIpAddress**|String|False| |Associated Elastic IP Address|
|**elasticIpId**|String|False| |Associated Elastic IP ID|
|**privateIpAddress**|String|False| |Associate Elastic IP to Assigned Private IP|


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
