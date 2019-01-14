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
|**subnets**|SubnetDesInfo[]| |
### SubnetDesInfo
|Name|Type|Description|
|---|---|---|
|**az**|String|Available Field Id of Subnet|
|**cidrBlock**|String|Segment of Subnet|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|Subnet Description Information|
|**id**|String|Subnet Id|
|**name**|String|Subnet Name|
|**vpcId**|String|VPC Id of Subnet|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
