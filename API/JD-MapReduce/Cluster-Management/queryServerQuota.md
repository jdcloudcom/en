# queryServerQuota


## 描述
Query the Remaining Server Quota

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/serverQuota:query

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
|**data**|AvailableNumData|Remaining Server Quota|
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
