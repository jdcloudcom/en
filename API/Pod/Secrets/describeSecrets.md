# describeSecrets


## Description
Search secret lists.<br> 
This interface supports query in pages, with 20 entries per page by default.


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/secrets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |The name - secret is the name, supporting fuzzy search<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
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
