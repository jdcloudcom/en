# getVpcSlbs


## Description
Search Information of corresponding Load Balancer resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_slbs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
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
|**slbs**|SlbInfo[]| |
### SlbInfo
|Name|Type|Description|
|---|---|---|
|**addressType**|String|Network Type of Load Balancer Instance.|
|**azs**|String[]|Availability Zone.|
|**cloudID**|String|ID of Cloud|
|**createdTime**|String|Creation Time|
|**id**|String|ID of Load Balancer Instance.|
|**ipAddress**|String|Service Address of Load Balancer Instance.|
|**name**|String|Name of Load Balancer Instance.|
|**networkType**|String|Network Type of Private Load Balancer Instance|
|**status**|String|Status of Load Balancer Instance|
|**subnetId**|String|Switch ID of Private Load Balancer Instance.|
|**vpc**|String|Exclusive Network ID of Private Load Balancer Instance.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
