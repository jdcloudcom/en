# createNetworkAcl


## 描述
Create NetworkAcl API

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**networkAclName**|String|True| |NetworkAcl Name|
|**vpcId**|String|True| |VPC ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**networkAclId**|String|networkAcl ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
|**429**|Quota exceeded|
