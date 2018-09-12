# describeUserAccessKeys


## 描述
Search AccessKey list

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/userAccessKeys

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**userAccessKeys**|[UserAccessKey[]](##UserAccessKey)|userAccessKey list|
### <a name="UserAccessKey">UserAccessKey</a>
|名称|类型|描述|
|---|---|---|
|**accessKey**|String|accessKey|
|**accessKeySecret**|String|accessKeySecret|
|**createTime**|String|Creation time|
|**state**|Integer|Disabled/enabled status [0-disabled, 1-enabled]|
|**yn**|Integer|Deleted/valid status [0-deleted, 1-valid]|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
