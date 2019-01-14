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
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|CreateVpcReq|True| |Create VPC|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateVpcReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vpc**|CreateVpc|False| | |
### CreateVpc
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**addressPrefix**|String|False| |Address Range|
|**cidrBlock**|String|True| |Segment of VPC|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |VPC Description|
|**id**|String|False| |Vpc Id|
|**name**|String|False| |Name of VPC|
|**userCidr**|String|False| |Segment of Network at User Side|

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
