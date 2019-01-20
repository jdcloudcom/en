# describeSubnet


## Description
Query subnet information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**subnet**|Subnet|Subnet Resource Information|
### Subnet
|Name|Type|Description|
|---|---|---|
|**endIp**|String|Subnet end address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**routeTableId**|String|Subnet Associated Route Table ID|
|**vpcId**|String|VPC ID of Subnet|
|**description**|String|Subnet Description Information|
|**aclId**|String|Subnet Associated Acl ID|
|**startIp**|String|Subnet start address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**addressPrefix**|String|Subnet Segment, Subnet Segment in VPC Cannot Overlap. Value Range of cidr: 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28. If VPC includes Cidr, it must be the Cidr subnet of VPC|
|**subnetId**|String|Subnet ID|
|**subnetName**|String|Subnet Name|
|**availableIpCount**|Number|Number of Available IPs in Subnet|
|**createdTime**|String|Subnet Creation Time|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
