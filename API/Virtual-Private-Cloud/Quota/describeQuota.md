# describeQuota


## 描述
Query quota information

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/quotas/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**parentResourceId**|String|False| |If the type is VPC, elastic_ip, network_interface, do not set; if the type is subnet, security_group, VPCpeering, set as VPCId|
|**type**|String|True| |Resource Type. Value Range: VPC, elastic_ip, subnet, security_group, VPCpeering, network_interface (quota only sums up secondary network interface)|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**quota**|Object| |

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**400**|invalid parameter|
|**500**|Internal server error|
