# getAccessKeys


## 描述
Obtain accessKey and accessKeySecret based on userpin

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/accessKeys

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
|**data**|UserAccessKey|User’s AK/SK|
|**message**|String| |
|**status**|String| |
### UserAccessKey
|名称|类型|描述|
|---|---|---|
|**accessKey**|String|Access key, AccessKey is used for calling cloud service API with program method|
|**accessKeySecret**|String|AccessKeySecret is the key pair used to verify the user|
|**account**|String|User Account|
|**created**|String|Creation Time|
|**expire**|String|Expiration Time|
|**id**|Integer|User Pass ID|
|**modified**|String|Update Time|
|**modifier**|String|Update Operator|
|**pin**|String|User Name|
|**state**|Integer|Status|
|**yn**|Integer| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
