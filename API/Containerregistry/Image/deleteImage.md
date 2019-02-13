# deleteImage


## Description
Delete Image
imageDigest imageTag imageTagStatus One of the three must be uploaded.
Delete the Image according to the Tag status, for example delete all tagged images.
digest and tag only respectively represent a single image, sha256 hash for imageDigest and digest for image manifest.
For example, sha256:examplee6d1e504117a17000003d3753086354a38375961f2e665416ef4b1b2f; tag used by image, as “precise”" 


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}/repositories/{repositoryName}:deleteImage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|
|**repositoryName**|String|True| |Name of Repository List|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageDigest**|String|False| |sha256 Hash, digest for image manifest|
|**imageTag**|String|False| |image usedtag|
|**imageTagStatus**|String|False| |List a value, such as tagged and untagged.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
