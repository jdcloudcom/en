# describeSecrets


## 描述
Search secret lists. <br>
This interface supports query in pages, with 20 entries per page by default.


## 请求方式
GET

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||The name - secret is the name, supporting fuzzy search.<br>|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Page size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**secrets**|[Secret[]](##Secret)||
|**totalCount**|Number||
### <a name="Secret">Secret</a>
|名称|类型|描述|
|---|---|---|
|**createdAt**|String|Creation time|
|**data**|[DockerRegistryData](##DockerRegistryData)|Confidential data|
|**name**|String|Confidential data name|
|**type**|String|Now, only the following private data type is supported: docker-registry, which is the docker registry verification type.|
### <a name="DockerRegistryData">DockerRegistryData</a>
|名称|类型|描述|
|---|---|---|
|**email**|String|Email address|
|**password**|String|Password|
|**server**|String|registry server address|
|**username**|String|User name|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
