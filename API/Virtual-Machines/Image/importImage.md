# importImage


## Description
Image importation: Import external images into JD Cloud


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/images:import

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**architecture**|String|True| |System Architecture, Optional Value: x86_64,i386|
|**osType**|String|True| |Operating System, Optional Value: windows,linux|
|**platform**|String|True| |Platform Name, Optional Value: CentOS,Ubuntu,Windows Server,Other Linux,Other Windows|
|**diskFormat**|String|True| |Disk Format, Optional Value: qcow2,vhd,vmdk,raw|
|**systemDiskSizeGB**|Integer|True| |The default size of the system disk to be made for the image is in GB. The minimum, maximum and required values are 40, 500 and an integer multiple of 10 respectively|
|**imageUrl**|String|True| |Address of the Object Storage Service External Link Requiring Image Importation|
|**osVersion**|String|False| |Operating System Version of Image|
|**imageName**|String|True| |Import the customized name of images|
|**description**|String|False| |Import the description information of images|
|**forceImport**|Boolean|False| |Whether force to import. If yes, ignore the image compliance detection|
|**clientToken**|String|False| |The user imports the idempotence guarantee of images. Please upload different values during each creation. Return the request result if the uploaded value is the same as a clientToken|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image id|
|**importTaskId**|Integer|Import the task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
