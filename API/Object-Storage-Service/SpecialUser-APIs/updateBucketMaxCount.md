# updateBucketMaxCount


## 描述
Update bucket maximum


## 请求方式
POST

## 请求地址
https://oss.jdcloud-api.com/v1/regions/{regionId}/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketmaxcount**|Integer|True||bucket maximum, e.g.: 50, minimum 20|
|**userpin**|String|True||Assign user's pin|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
