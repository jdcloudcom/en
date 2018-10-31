# copyImages


## Description
Image inter-domain replication, copy private images to other regions, allowing  you to operate your private image only. <br>
Only the image operations of cloud system disk with rootDeviceType as cloudDisk are supported.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images:copyImages

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**destinationRegion**|String|True| |Target Area|
|**sourceImageIds**|String[]|True| |Source Image ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**copyImages**|CopyImage[]|source image and target image mapping relationships|
### CopyImage
|Name|Type|Description|
|---|---|---|
|**destinationImageId**|String|Target Image ID after Replication|
|**sourceImageId**|String|Source Image ID|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
