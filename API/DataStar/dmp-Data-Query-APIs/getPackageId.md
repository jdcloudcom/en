# getPackageId


## 描述
Query Crowd Package ID according to device ID

## 请求方式
GET

## 请求地址
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/dmp/getPackageId

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**deviceIds**|String|True| |MD5 (deviceId), multiple MD5 (deviceId) separated by English commas. Note: MD5 result is in lowercase.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|String|Map<String,String>>, the serialized character string needs to be reconverted before use. Key is deviceId, value is crowd package Id|
|**message**|String|Description Information|
|**status**|Boolean|True is success, false is failure|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
