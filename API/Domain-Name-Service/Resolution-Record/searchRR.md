# searchRR


## 描述
Query the Resolution Record of the main domain name

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RR

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Current page, starting value is 1, default value is 1|
|**pageSize**|Integer|False| |Number of rows per page set during the page query, default value is 10|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Resolution Records of Current Page|
|**dataList**|RR[]|List of Resolution Records|
|**totalCount**|Integer|Number of All Resolution Records|
|**totalPage**|Integer|Pages of All Resolution Records|
### RR
|名称|类型|描述|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of Resolution Record|
|**id**|Integer|Unique ID of the Domain Name Resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|Port, only exists in some resolution record types|
|**ttl**|Integer|Life Time of Resolution Record|
|**type**|String|Type of Resolution Record|
|**viewValue**|Integer[]|ID of Resolution Line|
|**weight**|Integer|Weight of Resolution Record|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
