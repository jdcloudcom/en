# describeRepositories


## Description
Describe repository under registry of specified by the user. </br>


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/listRepositories

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |name - Repository name, fuzzy matching and supporting a single repository name<br>|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**repositories**|Repository[]| |
|**totalCount**|Number| |
### Repository
|Name|Type|Description|
|---|---|---|
|**createdAt**|String|Record the creation time of the user’s repository.|
|**description**|String|Repository Description|
|**registryName**|String|Registry Name.|
|**repositoryName**|String|Repository Name.|
|**repositoryUri**|String|Total Number of Images in Repository|
|**totalSpaceUsedMB**|Number|Repository Size|
|**updatedAt**|String|Record the repository update time by the user.|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
