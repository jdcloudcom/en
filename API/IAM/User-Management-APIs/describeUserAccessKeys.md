# describeUserAccessKeys


## 描述
Search AccessKey list

## 请求方式
GET

## 请求地址
https://iam.jdcloud-api.com/v1/regions/{regionId}/userAccessKeys

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**userAccessKeys**|UserAccessKey[]|UserAccessKey list|
### UserAccessKey
|名称|类型|描述|
|---|---|---|
|**accessKey**|String|accessKey|
|**accessKeySecret**|String|accessKeySecret|
|**createTime**|String|Creation Time|
|**state**|Integer|Disabled/Enabled Status [0-Disabled, 1-Enabled]|
|**yn**|Integer|Deleted/Valid Status [0-Deleted, 1-Valid]|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
