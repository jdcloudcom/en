# describeProtectionStatistics


## 描述
Query the Statistic Information of Advanced Anti-DDoS Instance Protection

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeProtectionStatistics

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
|**data**|ProtectionStatistics| |
### ProtectionStatistics
|名称|类型|描述|
|---|---|---|
|**instancesCount**|Integer|Instance Counts|
|**protectedCount**|Integer|Count of Protected Instances|
|**protectedDay**|Integer|Days of Protection|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
