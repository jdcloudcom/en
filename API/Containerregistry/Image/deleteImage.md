# deleteImage


## Description
Delete Image
imageDigest imageTag imageTagStatus One of the three must be uploaded.
Delete the Image according to the Tag status, for example delete all tagged images.
digest and tag only respectively represent a single image, sha256 hash for imageDigest and digest for image manifest.
For example, sha256:examplee6d1e504117a17000003d3753086354a38375961f2e665416ef4b1b2f; tag used by image, as “precise”" 


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries/{registryName}/repositories/{repositoryName}:deleteImage

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|
|**repositoryName**|String|True| |Name of Repository List|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**imageDigest**|String|False| |sha256 Hash, digest for image manifest|
|**imageTag**|String|False| |image usedtag|
|**imageTagStatus**|String|False| |List a value, such as tagged and untagged.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
