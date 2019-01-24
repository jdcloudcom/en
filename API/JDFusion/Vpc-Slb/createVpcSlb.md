# createVpcSlb


## Description
Create load balancer according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_slbs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**slb**|SlbInfo|True| |Create SLB|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### SlbInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**addressType**|String|False| |Network Type of Load Balancer Instance.|
|**azs**|String[]|False| |Availability Zone.|
|**cloudID**|String|False| |ID of Cloud|
|**createdTime**|String|False| |Creation Time|
|**id**|String|False| |ID of Load Balancer Instance.|
|**ipAddress**|String|False| |Service Address of Load Balancer Instance.|
|**name**|String|False| |Name of Load Balancer Instance.|
|**networkType**|String|False| |Network Type of Private Load Balancer Instance|
|**status**|String|False| |Status of Load Balancer Instance|
|**subnetId**|String|False| |Switch ID of Private Load Balancer Instance.|
|**vpc**|String|False| |Exclusive Network ID of Private Load Balancer Instance.|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
