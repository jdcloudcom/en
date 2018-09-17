# describeSecrets


## Description
Search secret lists. <br>
This interface supports query in pages, with 20 entries per page by default.


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||The name - secret is the name, supporting fuzzy search.<br>|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Page size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**secrets**|[Secret[]](##Secret)||
|**totalCount**|Number||
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
