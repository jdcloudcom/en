# describeImages


## Description
Return the metadata of images in the assigned repository, including image size, image tags and creation date.


## Request method
GET

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/images

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |registryName - registry name <br>repositoryName - repository name <br>imageDigest - image hash value <br>imageTag - image tag <br>tagStatus - TAGGED or UNTAGGED <br>|
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
|**imageDetails**|ImageDetail[]|Image List|
|**totalCount**|Number| |
### ImageDetail
|Name|Type|Description|
|---|---|---|
|**registryName**|String|Image registry represents the attribution of image registry|
|**repositoryName**|String|Image repository represents the attribution of image repository|
|**imageDigest**|String|sha256 abstract of image manifest|
|**imageManifest**|String|ImageManifest|
|**imagePushedAt**|String|The time when the current image is pushed to repository|
|**imageSizeMB**|Double|The size of image in repository. In versions after Docker 1.9, the Docker client will compress image layer data and push them to the Docker registry of V2 version. <br>docker image command displays the image size after decompression, and therefore it will be much larger than the image size returned by DescribeImages interface.      <br>|
|**imageTags**|String[]|All Tags Associated with ImageTag|
|**lastPullAt**|String|Latest Pull Time|
|**totalPullTimes**|Integer|Times of Image Being Pulled|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
