# describeSecret


## 描述
Search details of a single secrete


## 请求方式
GET

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Secret Name|
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
|**secret**|Secret| |
### Secret
|名称|类型|描述|
|---|---|---|
|**createdAt**|String|Creation Time|
|**data**|DockerRegistryData|Confidential Data|
|**name**|String|Confidential Data Name|
|**type**|String|Now, only the following private data type is supported: docker-registry, which is the docker registry verification type.|
### DockerRegistryData
|名称|类型|描述|
|---|---|---|
|**email**|String|Email Address|
|**password**|String|Password |
|**server**|String|Registry Server Address|
|**username**|String|User Name|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
