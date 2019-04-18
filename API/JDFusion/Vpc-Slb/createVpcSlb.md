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
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**slb**|SlbInfo|True| |Create SLB|

### SlbInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |ID of Cloud|
|**id**|String|False| |ID of Load Balancer Instance.|
|**name**|String|False| |Name of Load Balancer Instance.|
|**status**|String|False| |Status of Load Balancer Instance|
|**ipAddress**|String|False| |Service Address of Load Balancer Instance.|
|**addressType**|String|False| |Network Type of Load Balancer Instance.|
|**subnetId**|String|False| |Switch ID of Private Load Balancer Instance.|
|**vpc**|String|False| |Exclusive Network ID of Private Load Balancer Instance.|
|**networkType**|String|False| |Network Type of Private Load Balancer Instance|
|**azs**|String[]|False| |Availability Zone.|
|**createdTime**|String|False| |Creation Time|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
