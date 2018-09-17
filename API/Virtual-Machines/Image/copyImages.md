# copyImages


## Description
Image inter-domain replication,  copy private images to other regions,  allowing you to operate your private image only. <br>
Only images of the cloudDisk cloud of system disk are supported.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images:copyImages

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**destinationRegion**|String|True||target area|
|**sourceImageIds**|String[]|True||Source image ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**copyImages**|[CopyImage[]](##CopyImage)|source image and target image mapping relationships|
### <a name="CopyImage">CopyImage</a>
|Name|Type|Description|
|---|---|---|
|**destinationImageId**|String|Target image ID after replication|
|**sourceImageId**|String|Source image ID|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
