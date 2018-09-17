# getHardwareStack


## 描述
Hardware configuration information list

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/hardwareStack

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
|**data**|[HardWareStackData](##HardWareStackData)|Hardware information queried|
|**message**|String||
|**status**|String||
### <a name="HardWareStackData">HardWareStackData</a>
|名称|类型|描述|
|---|---|---|
|**disk**|[Disk[]](##Disk)||
|**scale**|[Scale[]](##Scale)||
### <a name="Disk">Disk</a>
|名称|类型|描述|
|---|---|---|
|**limit**|String|Maximum disk capacity|
|**volumeType**|String|Disk capacity type|
### <a name="Scale">Scale</a>
|名称|类型|描述|
|---|---|---|
|**core**|Integer|CPU core number|
|**memory**|Integer|Memory size, with the unit of G|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
