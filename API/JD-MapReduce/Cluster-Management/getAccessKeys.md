# getAccessKeys


## 描述
Obtain accessKey and accessKeySecret based on userpin

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/accessKeys

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
|**data**|[UserAccessKey](##UserAccessKey)|User’s AK/SK|
|**message**|String||
|**status**|String||
### <a name="UserAccessKey">UserAccessKey</a>
|名称|类型|描述|
|---|---|---|
|**accessKey**|String|Access key, AccessKey is used for calling cloud service API with program method|
|**accessKeySecret**|String|AccessKeySecret is the key pair used to verify the user|
|**account**|String|User account|
|**created**|String|Creation time|
|**expire**|String|Expiration time|
|**id**|Integer|User pass id|
|**modified**|String|Update time|
|**modifier**|String|Update operator|
|**pin**|String|User name|
|**state**|Integer|Status|
|**yn**|Integer||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
