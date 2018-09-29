# getTargets


## 描述
Query available monitor objects of subdomains

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/getTargets

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**subDomainName**|String|True| |Subdomain|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|String[]|Array of Available Monitoring Objects Returned|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
