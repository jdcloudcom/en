# describeSecret


## Description
Search details of a single secrete


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Secret Name|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**secret**|[Secret](##Secret)||
### <a name="Secret">Secret</a>
|Name|Type|Description|
|---|---|---|
|**createdAt**|String|Creation time|
|**data**|[DockerRegistryData](##DockerRegistryData)|Confidential data|
|**name**|String|Confidential data name|
|**type**|String|Now, only the following private data type is supported: docker-registry, which is the docker registry verification type.|
### <a name="DockerRegistryData">DockerRegistryData</a>
|Name|Type|Description|
|---|---|---|
|**email**|String|Email address|
|**password**|String|Password|
|**server**|String|registry server address|
|**username**|String|User name|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
