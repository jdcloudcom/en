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
|**vpc**|VpcInfoDetail| |
### VpcInfoDetail
|Name|Type|Description|
|---|---|---|
|**id**|String|Vpc Id|
|**name**|String|Name of VPC|
|**cidrBlock**|String|Address Range|
|**description**|String|VPC Description|
|**createdTime**|String|Creation Time|
|**cloudID**|String|Provider ID of the Cloud|
|**subnets**|SubnetInfo[]|Subnet List Included in VPC|
|**routeTableIds**|String[]|ID Set of Route Table|
### SubnetInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Subnet Id|
|**vpcId**|String|VPC Id of Subnet|
|**subnetName**|String|Subnet Name|
|**cidrBlock**|String|Segment of Subnet|
|**availableIpCount**|Integer|Number of Available IPs in Subnet|
|**description**|String|Subnet Description Information|
|**endIp**|String|End Address of Subnet|
|**routeTableId**|String|Subnet Associated Route Table Id|
|**startIp**|String|Start Address of Subnet|
|**cloudID**|String|Provider ID of the Cloud|
|**az**|String|Availability Zone|
|**createdTime**|String|Subnet Creation Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
