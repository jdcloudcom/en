# getVmImages


## Description
Obtain information of the image resource according to the filter conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_images

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**imageSource**|String|False| |Image resource: system: System official public image. self: User customized image. others: User shared image. marketplace: image provided by Cloud Marketplace of Marketplace.|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**images**|ImageInfo[]| |
### ImageInfo
|Name|Type|Description|
|---|---|---|
|**architecture**|String|Image Architecture|
|**cloudID**|String|Cloud Registration Information ID|
|**createdTime**|String|Creation Time|
|**description**|String|Image Description|
|**id**|String|Image ID|
|**imageSource**|String|Image Source|
|**name**|String|Image Name|
|**osType**|String|Type of Image Operating System|
|**platform**|String|Operating System Platform|
|**progress**|String|Progress when image replication and conversion; only value is displayed, unit: percentage|
|**size**|Integer|Image Size  Unit: MB|
|**status**|String|Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
