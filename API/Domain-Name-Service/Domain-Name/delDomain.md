# delDomain


## 描述
Delete Main Domain Name

## 请求方式
DELETE

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainDel

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|Integer|True||Domain name ID to be deleted|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
