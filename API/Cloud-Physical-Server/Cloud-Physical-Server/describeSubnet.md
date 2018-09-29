# describeSubnet


## 描述
Query Subnet 

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/subnet

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, as cn-east-1a; the availability zones supported by the Cloud Physical Servers in the region can be called by calling APIs (describeRegions)|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**subnet**|Subnet|Subnet Details|
### Subnet
|名称|类型|描述|
|---|---|---|
|**az**|String|Availability Zone, such as cn-east-1a|
|**cidr**|String|Subnet CIDR|
|**networkType**|String|Network Type|
|**region**|String|Region Code, such as cn-east-1|
|**subnetId**|String|Subnet ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
