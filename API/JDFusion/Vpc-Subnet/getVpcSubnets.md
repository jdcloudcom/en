# getVpcSubnets


## Description
Search Information of corresponding subnet resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_subnets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**subnets**|SubnetDesInfo[]| |
### SubnetDesInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Subnet Id|
|**name**|String|Subnet Name|
|**vpcId**|String|VPC Id of Subnet|
|**cidrBlock**|String|Segment of Subnet|
|**description**|String|Subnet Description Information|
|**az**|String|Available Field Id of Subnet|
|**createdTime**|String|Creation Time|
|**cloudID**|String|Provider ID of the Cloud|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
