# addRR


## 描述
Add a resolution record of the domain name

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRAdd

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**req**|[AddRR](##AddRR)|True||RR Parameter|

### <a name="AddRR">AddRR</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**hostRecord**|String|False||Machine Record|
|**hostValue**|String|False||Value of the resolution record|
|**jcloudRes**|Boolean|False||JD Cloud Resource?|
|**mxPriority**|Integer|False||Priority, only exists in some resolution record types|
|**port**|Integer|False||port, only exists in some resolution record types|
|**ttl**|Integer|False||Life time of the resolution record|
|**type**|String|False||Resolution Type|
|**viewValue**|Integer|False||ID of the resolution line|
|**weight**|Integer|False||Weight of the resolution record|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dataList**|[RR](##RR)|Resolution record result after successful addition|
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
