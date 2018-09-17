# getimgProtectedCondition


## 描述
Obtain original image protection configuration of current bucket


## 请求方式
GET

## 请求地址
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}:imgProtected

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketname**|String|True||Bucket Name, e.g.: test|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**imgProtectedResult**|[Result](##Result)||
### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**codition**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
