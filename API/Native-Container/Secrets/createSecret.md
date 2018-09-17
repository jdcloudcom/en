# createSecret


## 描述
Create a secret for storing relevant confidential information of image registry.


## 请求方式
POST

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**data**|[DockerRegistryData](##DockerRegistryData)|False||Confidential data. <br><br>Valid characters of key include letters, numbers, -, _ and .; <br><br>The value is the character string encoded by Base64, which can’t comprise a line break (please use base64 -w 0 option under linux); the length cap of each value is 4KB; and the length of the entire data can’t exceed 256KB; <br><br>Fields as server, username and password must be contained and the field of email is optional. <br><br>|
|**name**|String|True||Names of confidential data can’t be the same<br>|
|**secretType**|String|True||Now, only the following confidential data type is supported: docker-registry, which is the docker registry verification type.<br>|

### <a name="DockerRegistryData">DockerRegistryData</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**email**|String|False||Email address|
|**password**|String|True||Password|
|**server**|String|True||registry server address|
|**username**|String|True||User name|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**secretName**|String||

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
