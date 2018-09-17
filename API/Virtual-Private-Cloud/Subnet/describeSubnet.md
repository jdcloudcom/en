# describeSubnet


## Description
Query subnet information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**subnetId**|String|True||Subnet ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**subnet**|[Subnet](##Subnet)|Subnet resource information|
### <a name="Subnet">Subnet</a>
|Name|Type|Description|
|---|---|---|
|**aclId**|String|Subnet associated acl Id|
|**addressPrefix**|String|Subnet segment, subnet segment in vpc cannot overlap, value range of cidr: 10.0.0.0/8、172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28. If VPC includes Cidr, it must be the Cidr subnet of VPC|
|**availableIpCount**|Number|Number of available IPs in subnet|
|**createdTime**|String|Subnet creation time|
|**description**|String|Subnet description information|
|**endIp**|String|Subnet end address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**routeTableId**|String|Subnet associated route table Id|
|**startIp**|String|Subnet start address, the 1st subnet address is router gateway reservation, the 2nd subnet address is dhcp service reservation|
|**subnetId**|String|Subnet Id|
|**subnetName**|String|Subnet name|
|**vpcId**|String|VPC Id of subnet|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
