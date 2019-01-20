# describeSecrets


## Description
Search secret list. <br> 
This API supports paging query with 20 items per page by default.


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |The name - secret is the name, supporting fuzzy search.<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
|**name**|String|True| |Name of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**secrets**|Secret[]| |
|**totalCount**|Number| |
### Secret
|Name|Type|Description|
|---|---|---|
|**type**|String|Now, only the following private data type is supported: docker-registry, which is the docker registry verification type.|
|**data**|DockerRegistryData|Confidential Data|
|**name**|String|Confidential Data Name|
|**createdAt**|String|Creation Time|
### DockerRegistryData
|Name|Type|Description|
|---|---|---|
|**username**|String|User Name|
|**password**|String|Password |
|**email**|String|Email Address|
|**server**|String|Registry Server Address|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
