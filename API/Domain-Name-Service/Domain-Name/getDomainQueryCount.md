# getDomainQueryCount


## 描述
View domain name resolutions

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/queryCount

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainName**|String|True||Domain name to be queried|
|**end**|String|True||Termination time, UTC time, for example, 2017-11-10T23:00:00Z|
|**start**|String|True||Start time, UTC time, for example, 2017-11-10T23:00:00Z|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**time**|Integer[]|Time series|
|**traffic**|Integer[]|Data series|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|NOT_FOUND|
