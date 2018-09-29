# getInstanceList


## 描述
Obtain the machine specification list (Filter out the low-memory specifications; remove the ones inferior to quad-core.)

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/instances

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
|**data**|InstanceList[]|Machine Specification List|
|**message**|String| |
|**status**|String| |
### InstanceList
|名称|类型|描述|
|---|---|---|
|**label**|String|Classification of Machine Models|
|**options**|Options[]| |
### Options
|名称|类型|描述|
|---|---|---|
|**label**|String|CPU and Memory Size of the Machine|
|**value**|String|Specification Description of the Corresponding Machine|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
