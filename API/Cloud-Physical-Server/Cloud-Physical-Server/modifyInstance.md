# modifyInstance


## 描述
Modify some information of Cloud Physical Server, including name, description

## 请求方式
POST

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Cloud Physical Server ID|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Description of Cloud Physical Server|
|**name**|String|False| |Name of Cloud Physical Server|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**description**|String|Description of Cloud Physical Server|
|**name**|String|Name of Cloud Physical Server|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
