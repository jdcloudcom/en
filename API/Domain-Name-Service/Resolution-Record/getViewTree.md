# getViewTree


## 描述
Query all basic cloud resolution lines

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/viewTree

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**loadMode**|Integer|False| |Display Mode|
|**packId**|Integer|True| |Package ID|
|**viewId**|Integer|True| |View ID, 0 by default|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|ViewTree[]|Tree of Resolution Line|
### ViewTree
|名称|类型|描述|
|---|---|---|
|**children**|ViewTree[]| |
|**disabled**|Boolean|Whether is this resolution line disabled|
|**label**|String|Name of Resolution Line|
|**leaf**|Boolean|Whether the data is a leaf node|
|**value**|Integer|Resolution Line ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
