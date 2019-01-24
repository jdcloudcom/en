# createRepository


## Description
Create repository through parameters.
Repository name may be broken down into multiple path names, and each name must contain at least one letter in lower case and figure, and consider URL specification.
Partition with segment line or underline is supported, but dot '.' and connection between multiple path names with ("/") are not allowed, the total length shall be no more than 256 characters, and currently only second-level directory is supported.


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}/repositories

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**repositoryName**|String|True| |Repository name. <br>Proprietary mode is allowed, such as default naming space nginx-web-app; or multiple repositories are gathered together with the naming space, such as project-a/nginx-web-app. <br>|
|**description**|String|False| |Registry Description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>. <br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**repository**|RepositoryShort| |
### RepositoryShort
|Name|Type|Description|
|---|---|---|
|**createdAt**|String|Record the creation time of the user’s repository.|
|**repositoryName**|String|Repository name.|
|**repositoryUri**|String|Repository's URI, the user develops the URI through docker CLI, and directly performs the docker pull/push and other operations.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
