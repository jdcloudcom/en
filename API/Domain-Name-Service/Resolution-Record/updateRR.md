# updateRR


## 描述
Modify a resolution record of the main domain name

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRUpdate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**req**|[UpdateRR](##UpdateRR)|True||UpdateRR Parameter|

### <a name="UpdateRR">UpdateRR</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainName**|String|False||Main Domain Name|
|**hostRecord**|String|False||Machine Record|
|**hostValue**|String|False||Value of the resolution record|
|**id**|Integer|False||Unique ID of the domain name resolution|
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



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
