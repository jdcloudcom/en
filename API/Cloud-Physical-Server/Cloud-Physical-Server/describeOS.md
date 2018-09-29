# describeOS


## 描述
Query the Operating Systems Supported by the Cloud Physical Server

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/os

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**deviceType**|String|True| |Instance Type Family, the APIs (describeDeviceTypes) may be called to obtain the instance type family of a specific region, such as: cps.c.normal|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**oss**|Os[]| |
### Os
|名称|类型|描述|
|---|---|---|
|**deviceType**|String|Instance Type Family, such as cps.c.normal,|
|**osName**|String|Operating System Name, such as Ubuntu 16.04(x86_64)|
|**osType**|String|Operating System Type Id, such as Ubuntu/Centos|
|**osTypeId**|String|Operating System Type ID|
|**osVersion**|String|Operating System Version, such as 14.04/16.04|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
