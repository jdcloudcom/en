# searchRR


## 描述
Query the resolution record of the main domain name

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RR

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|False||Current page, starting value of 1, default value of 1|
|**pageSize**|Integer|False||Number of rows per page set during the page query, default value of 10|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Resolution records of current page|
|**dataList**|[RR[]](##RR)|List of the resolution record|
|**totalCount**|Integer|Number of all resolution records|
|**totalPage**|Integer|Pages of all resolution records|
### <a name="RR">RR</a>
|名称|类型|描述|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of the resolution record|
|**id**|Integer|Unique ID of the domain name resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|port, only exists in some resolution record types|
|**ttl**|Integer|Life time of the resolution record|
|**type**|String|Type of the resolution record|
|**viewValue**|Integer[]|ID of the resolution line|
|**weight**|Integer|Weight of the resolution record|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
