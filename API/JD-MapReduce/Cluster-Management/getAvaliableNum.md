# getAvaliableNum


## 描述
Obtain the number of remaining resources that can be created of the current user

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/avaliableNum

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|AvailableNumData|The number of remaining resources that can be created|
|**message**|String| |
|**status**|String| |
### AvailableNumData
|名称|类型|描述|
|---|---|---|
|**serverNum**|Integer|Number of Available Services|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
