# describeVpc


## Description
Query VPC information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/{vpcId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcId**|String|True| |Vpc ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**vpc**|Vpc|VPC resource information|
### Vpc
|Name|Type|Description|
|---|---|---|
|**aclIds**|String[]| |
|**addressPrefix**|String|If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**createdTime**|String|VPC Creation Time|
|**description**|String|VPC Description. Value Range: 1~120 characters|
|**routeTableIds**|String[]| |
|**subnets**|Subnet[]|Subnet List Included in VPC|
|**vpcId**|String|VPC ID|
|**vpcName**|String|VPC Name. Value Range: 1-60 Chinese, English capital and lowercase letters, numbers and underline delimiter|
### Subnet
|Name|Type|Description|
|---|---|---|
|**aclId**|String|Subnet Associated Acl ID|
|**addressPrefix**|String|Subnet Segment, Subnet Segment in VPC Cannot Overlap. Value Range of cidr: 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28. If VPC includes Cidr, it must be the Cidr subnet of VPC|
|**availableIpCount**|Number|Number of Available IPs in Subnet|
|**createdTime**|String|Subnet Creation Time|
|**description**|String|Subnet Description Information|
|**endIp**|String|Subnet end address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**routeTableId**|String|Subnet Associated Route Table ID|
|**startIp**|String|Subnet start address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**subnetId**|String|Subnet ID|
|**subnetName**|String|Subnet Name|
|**vpcId**|String|VPC ID of Subnet|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
