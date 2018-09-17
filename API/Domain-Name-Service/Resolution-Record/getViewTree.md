# getViewTree


## 描述
Query all basic cloud resolution lines

## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/viewTree

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**loadMode**|Integer|False||Display Mode|
|**packId**|Integer|True||Package ID|
|**viewId**|Integer|True||view ID, 0 in default|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[ViewTree[]](##ViewTree)|Tree of the resolution line|
### <a name="ViewTree">ViewTree</a>
|名称|类型|描述|
|---|---|---|
|**children**|[ViewTree[]](##ViewTree)||
|**disabled**|Boolean|Whether this resolution line is disabled|
|**label**|String|Name of the resolution line|
|**leaf**|Boolean|Whether the data is a leaf node|
|**value**|Integer|Resolution Line ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
