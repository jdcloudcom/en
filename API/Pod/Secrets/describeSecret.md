# describeSecret


## Description
Search details of a single secrete


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**name**|String|True| |Secret Name|

## Request Parameter
None


## Return Parameter
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
|**name**|String|Secrets Name|
|**type**|String|Secrets Type|
|**createdAt**|String|Creation Time of Secrets|
|**data**|DockerRegistryData|Secrets Data|
### DockerRegistryData
|Name|Type|Description|
|---|---|---|
|**server**|String|registry Server Address|
|**username**|String|User Name|
|**password**|String|Password|
|**email**|String|Email Address|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
