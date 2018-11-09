# describeImages


## Description
Return the metadata of images in the assigned repository, including image size, image tags and creation date.


## Request Method
GET

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/images

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |registryName - registry name <br>repositoryName - repository name <br>imageDigest - image hash value <br>imageTag - image tag <br>tagStatus - TAGGED or UNTAGGED <br>|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default|Description|
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
|**imageDetails**|ImageDetail[]|Image List|
|**totalCount**|Number| |
### ImageDetail
|Name|Type|Description|
|---|---|---|
|**imageDigest**|String|sha256 abstract of image manifest|
|**imageManifest**|String|ImageManifest|
|**imagePushedAt**|String|The time when the current image is pushed to repository|
|**imageSizeMB**|Integer|The size of image in repository. In versions after Docker 1.9, the Docker client will compress image layer data and push them to the Docker registry of V2 version. <br>docker image command displays the image size after decompression, and therefore it will be much larger than the image size returned by DescribeImages interface.      <br>|
|**imageTags**|String[]|All Tags Associated with ImageTag|
|**lastPullAt**|String|Latest Pull Time|
|**registryName**|String|Image registry represents the attribution of image registry|
|**repositoryName**|String|Image repository represents the attribution of image repository|
|**totalPullTimes**|Integer|Times of Image Being Pulled|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
