# getKey


## 描述
Obtain user appkey and SecretKey

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/key

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
|**data**|[AppModel](##AppModel)|AK/SK queried|
|**message**|String||
|**status**|String||
### <a name="AppModel">AppModel</a>
|名称|类型|描述|
|---|---|---|
|**appKey**|String|AK|
|**appSecret**|String|SK|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
