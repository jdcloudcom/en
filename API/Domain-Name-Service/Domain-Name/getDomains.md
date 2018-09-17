# getDomains


## 描述
Query the list of the main domain names under the username

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainName**|String|False||Keyword, matching the main domain name name according to the "%domainName%" pattern|
|**pageNumber**|Integer|True||Serial number of each page that is queried during the page query. The starting value is 1, and the default is 1.|
|**pageSize**|Integer|True||Number of rows per page set during the page query, the default is 10.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Number of domain names in the domain name list of the current page|
|**dataList**|[Domain[]](##Domain)|Domain Name List|
|**totalCount**|Integer|Number of all matched domain name lists|
|**totalPage**|Integer|Pages of all matched domain name lists in total according to the paging parameters|
### <a name="Domain">Domain</a>
|名称|类型|描述|
|---|---|---|
|**createTime**|Integer|Creation time, format Unix timestamp|
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration time, format Unix timestamp|
|**id**|Integer|Unique ID of the domain name|
|**packId**|Integer|Package type, 0->free 1->Enterprise Edition 2->Advanced Edition|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
