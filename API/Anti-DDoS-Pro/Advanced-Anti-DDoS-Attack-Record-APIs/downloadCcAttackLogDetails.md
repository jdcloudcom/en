# downloadCcAttackLogDetails


## 描述
Download the CC attack log details

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ccDetail/download

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|True| |Advanced Anti-DDoS Instance ID|
|**startTime**|String|True| |Start time, only data within the latest 60 days can be downloaded, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**subDomain**|String[]|False| |Subdomain Name|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
