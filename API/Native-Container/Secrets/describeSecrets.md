# describeSecrets


## Description
Search secret list. <br> 
This interface supports query in pages, with 20 entries per page by default.


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
|**filters**|Filter[]|False| |The name - secret is the name, supporting fuzzy search.<br>|
|**pageNumber**|Integer|False| |Page number; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**secrets**|Secret[]| |
|**totalCount**|Number| |
### Secret
|Name|Type|Description|
|---|---|---|
|**createdAt**|String|Creation Time|
|**data**|DockerRegistryData|Confidential Data|
|**name**|String|Confidential Data Name|
|**type**|String|Now, only the following private data type is supported: docker-registry, which is the docker registry verification type.|
### DockerRegistryData
|Name|Type|Description|
|---|---|---|
|**email**|String|Email Address|
|**password**|String|Password |
|**server**|String|Registry Server Address|
|**username**|String|User Name|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
