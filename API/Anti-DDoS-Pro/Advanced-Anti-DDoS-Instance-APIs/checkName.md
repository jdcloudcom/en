# checkName


## 描述
Detect Whether the Instance Name is Legal

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/checkName

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Instance Name to be Detected|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Boolean|Detection Result, True Means Legal, False Means Illegal|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
