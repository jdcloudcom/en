# disassociateNetworkAcl


## 描述
Disassociate NetworkAcl API from subnet

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}:disassociateNetworkAcl

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkAclId**|String|True| |networkAclId ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID Disassociated from NetworkAcl|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
