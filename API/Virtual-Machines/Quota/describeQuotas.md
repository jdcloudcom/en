# describeQuotas


## 描述
Query quota, support: VM, image, key pair, template


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/quotas

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |resourceTypes - Resource types, multiple support [instance, keyair, image, instanceTemplate]<br>|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**quotas**|Quota[]|Quota list|
### Quota
|名称|类型|描述|
|---|---|---|
|**limit**|Integer|Upper Quota Limit|
|**resourceType**|String|Source Type [instance, keypair, image, instanceTemplate]|
|**used**|Integer|Used Quota|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
