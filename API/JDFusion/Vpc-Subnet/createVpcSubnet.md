# createVpcSubnet


## Description
Create subnet according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_subnets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**subnet**|CreateSubnet|True| |Create Subnet|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateSubnet
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**az**|String|True| |Available Field Id of Subnet|
|**cidrBlock**|String|True| |Segment of Subnet|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |Subnet Description Information|
|**id**|String|False| |Subnet Id|
|**name**|String|False| |Subnet Name|
|**vpcId**|String|True| |VPC Id of Subnet|

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
