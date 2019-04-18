# createVpc


## Description
Create VPC according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vpcs

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
|**vpc**|VpcInfo|True| |Create VPC|

### VpcInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |Vpc Id|
|**name**|String|False| |Name of VPC|
|**cidrBlock**|String|False| |Address Range|
|**description**|String|False| |VPC Description|
|**createdTime**|String|False| |Creation Time|
|**cloudID**|String|False| |Provider ID of the Cloud|

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
