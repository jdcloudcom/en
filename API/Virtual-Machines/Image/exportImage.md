# exportImage


## Description
Export Image refers to export JD Cloud Private Image to the environment outside JD Cloud


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images/{imageId}:exportImage

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**imageId**|String|True| |Image ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Service role name created by user|
|**ossUrl**|String|True| |For the domain of oss bucket that stores the exported image file, please fill in the full url starting with https://|
|**ossPrefix**|String|False| |Export the prefix of image filename, which only support English letters and numbers, and cannot exceed 32 characters|
|**clientToken**|String|False| |Idempotence guarantee for users exporting images. Please upload different values during each export. If the uploaded value is the same as a clientToken, return the same request result with at most 64 characters|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**exportTaskId**|Integer|Export the task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
