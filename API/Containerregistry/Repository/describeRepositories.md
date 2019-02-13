# describeRepositories


## Description
Describe repository under registry of specified by the user. </br>


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/listRepositories

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |name - Repository name, fuzzy matching and supporting a single repository name<br>|
|**pageNumber**|Integer|False| |Page; 1 by default|
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
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**repositories**|Repository[]| |
|**totalCount**|Number| |
### Repository
|Name|Type|Description|
|---|---|---|
|**createdAt**|String|Record the creation time of the user’s repository.|
|**updatedAt**|String|Record the repository update time by the user.|
|**registryName**|String|Registry Name.|
|**repositoryName**|String|Repository Name.|
|**repositoryUri**|String|Total Number of Images in Repository|
|**totalSpaceUsedMB**|Double|Repository Size|
|**description**|String|Repository Description|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
