# getHardwareStack


## 描述
Hardware Configuration Information List

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/hardwareStack

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
|**data**|HardWareStackData|Hardware Information Queried|
|**message**|String| |
|**status**|String| |
### HardWareStackData
|名称|类型|描述|
|---|---|---|
|**disk**|Disk[]| |
|**scale**|Scale[]| |
### Disk
|名称|类型|描述|
|---|---|---|
|**limit**|String|Maximum Disk Capacity|
|**volumeType**|String|Disk Capacity Type|
### Scale
|名称|类型|描述|
|---|---|---|
|**core**|Integer|CPU Core Number|
|**memory**|Integer|Memory Size, Unit: G|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
