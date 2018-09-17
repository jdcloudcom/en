# describeCcAttackLogDetails


## 描述
Search the cc attack log details

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:ccDetail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|True||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|True||Advanced Anti-DDoS instance ID|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Page size; it is 10 by default; value range [10, 100]|
|**startTime**|String|True||Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**subDomain**|String[]|False||Subdomain name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dataList**|[CCAttackLogDetail[]](##CCAttackLogDetail)||
|**totalCount**|Integer||
### <a name="CCAttackLogDetail">CCAttackLogDetail</a>
|名称|类型|描述|
|---|---|---|
|**key**|String|Feature key|
|**num**|Integer|Attacks|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
