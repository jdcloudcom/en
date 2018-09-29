# describeCCDefaultThresholds


## 描述
Query the CC Customized Default Threshold

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeCCDefaultThresholds

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

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
|**data**|CCDefaultThresholds| |
### CCDefaultThresholds
|名称|类型|描述|
|---|---|---|
|**hostQps**|Integer|Protection Threshold for Each Host|
|**hostUrlQps**|Integer|Protection Threshold for Each Host + URL|
|**ipHostQps**|Integer|Protection Threshold for Host of Each Source IP|
|**ipHostUrlQps**|Integer|Protection Threshold for Host + URL of Each Source IP|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
