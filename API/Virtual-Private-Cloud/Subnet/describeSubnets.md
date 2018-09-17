# describeSubnets


## Description
Query subnet list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||subnetIds - subnet ID list, support multiple IDs<br>subnetNames - subnet name list, support multiple names<br>routeTableId	- subnet associated route table Id, support single Id<br>aclId - subnet associated acl Id, support single Id<br>vpcId- vpc Id of subnet, support single Id<br>|
|**pageNumber**|Integer|False|1|Page; it is 1 by default, the value range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**subnets**|[Subnet[]](##Subnet)|Subnet resource information list|
|**totalCount**|Number|Total number|
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
