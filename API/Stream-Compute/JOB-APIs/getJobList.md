# getJobList


## 描述
Query all the jobs under the assigned applications

## 请求方式
GET

## 请求地址
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/jobList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**namespaceId**|String|True| | |


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Object[]|Job Objects Queried out|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR      |
