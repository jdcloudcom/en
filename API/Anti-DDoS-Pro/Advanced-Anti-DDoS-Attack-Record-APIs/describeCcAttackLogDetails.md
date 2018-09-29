# describeCcAttackLogDetails


## 描述
Search the cc attack log details

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ccDetail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|True| |Advanced Anti-DDoS Instance ID|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 20 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**subDomain**|String[]|False| |Subdomain Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Current Page Counts|
|**dataList**|CCAttackLogDetail[]| |
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### CCAttackLogDetail
|名称|类型|描述|
|---|---|---|
|**key**|String|Feature Key|
|**num**|Integer|Attack Counts|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
