# stopJob


## 描述
Stop job running

## 请求方式
GET

## 请求地址
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job:stop

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**jobId**|Integer|True| | |
|**namespaceId**|String|True| | |


## 返回参数
|名称|类型|描述|
|---|---|---|
|**regionId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**message**|String|Returned Information Upon Successfully Enabling Job|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR      |
