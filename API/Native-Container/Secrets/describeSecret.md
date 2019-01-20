# describeSecret


## Description
Search details of a single secrete


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**name**|String|True| |Secret Name|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**secret**|Secret| |
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
