# getVpcById


## Description
Search Information of corresponding VPC resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vpcs/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |VPC ID|
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
|**vpc**|VpcInfoDetail| |
### VpcInfoDetail
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Address Range|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|VPC Description|
|**id**|String|Vpc Id|
|**name**|String|Name of VPC|
|**routeTableIds**|String[]|ID Set of Route Table|
|**subnets**|SubnetInfo[]|Subnet List Included in VPC|
### SubnetInfo
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Segment of Subnet|
|**availableIpCount**|Integer|Number of Available IPs in Subnet|
|**cloudID**|String|Provider ID of the Cloud|
|**description**|String|Subnet Description Information|
|**endIp**|String|End Address of Subnet|
|**id**|String|Subnet Id|
|**routeTableId**|String|Subnet Associated Route Table Id|
|**startIp**|String|Start Address of Subnet|
|**subnetName**|String|Subnet Name|
|**vpcId**|String|VPC Id of Subnet|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
