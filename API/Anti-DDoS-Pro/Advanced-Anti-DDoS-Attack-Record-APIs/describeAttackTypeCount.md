# describeAttackTypeCount


## 描述
Query the Attack Counts of Various Types

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog/describeAttackTypeCount

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False| |Advanced Anti-DDoS Instance ID|
|**startTime**|String|True| |Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Array| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
