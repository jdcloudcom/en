# modifySecurityIps


## 描述
Modify Instance Access Whitelist

## 请求方式
POST

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/securityIps

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**modifyMode**|String|True||Modification method, Add adds whitelist, Delete deletes whitelist.|
|**securityIps**|String|True||IP list under the IP whitelist group, up to 45 separated by commas, in the following format: 0.0.0.0/0, 10.23.12.24 (IP), or 10.23.12.24/24 (CIDR mode, classless inter-domain routing, /24 indicates the length of the prefix in the address; range [1, 32]).|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
