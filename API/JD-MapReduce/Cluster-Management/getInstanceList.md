# getInstanceList


## 描述
Obtain the machine specification list (Filter out the low-memory specifications; remove the ones inferior to quad-core.)

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[InstanceList[]](##InstanceList)|Machine specification list|
|**message**|String||
|**status**|String||
### <a name="InstanceList">InstanceList</a>
|名称|类型|描述|
|---|---|---|
|**label**|String|Classification of machine models|
|**options**|[Options[]](##Options)||
### <a name="Options">Options</a>
|名称|类型|描述|
|---|---|---|
|**label**|String|CPU and memory size of the machine|
|**value**|String|Specification description of the corresponding machine|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
