# moveObject


## 描述
moveobject


## 请求方式
PUT

## 请求地址
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}/objectkey/{objectkey}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketname**|String|True||bucket name, e.g.: test-bucket|
|**objectkey**|String|True||objectkey, e.g.: test-object|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**x-jss-move-source**|String|True||source Information|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**moveObjectResult**|[Result](##Result)||
### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**etag**|String||
|**lastModified**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
|**404**|The specified bucket does not exist.|
