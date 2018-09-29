# updateDomain


## 描述
Modify Main Domain Name

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainUpdate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainName**|String|True| |Domain Name to be Modified|
|**id**|Integer|True| |Domain Name ID to be Modified|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**updateDomain**|Domain|Domain Name Structure after Modification|
### Domain
|名称|类型|描述|
|---|---|---|
|**createTime**|Integer|Creation Time, Format Unix Timestamp |
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration Time, Format Unix Timestamp|
|**id**|Integer|Unique ID of the Domain Name|
|**packId**|Integer|Package Type, 0->Free 1->Enterprise Edition 2->Advanced Edition|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
