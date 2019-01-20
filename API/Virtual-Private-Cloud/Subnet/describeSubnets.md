# describeSubnets


## Description
Query subnet list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page; it is 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|
|**filters**|Filter[]|False| |subnetIds - Subnet ID list, support multiple IDs<br>subnetNames - Subnet name list, support multiple names<br>routeTableId	- Subnet associated route table Id, support single Id<br>aclId - Subnet associated acl Id, support single Id<br>VPCId- VPC ID of subnet, support single Id<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
|**name**|String|True| |Name of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**subnets**|Subnet[]|Subnet Resource Information List|
|**totalCount**|Number|Total Number|
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
