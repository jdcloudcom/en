# describeVpcs


## Description
Query VPC list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |VPCIds - VPC ID list, support multiple IDs<br>VPCNames - VPC name list, support multiple names<br>|
|**pageNumber**|Integer|False|1|Page; it is 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Number|Total Number|
|**vpcs**|Vpc[]|VPC Resource Information List|
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
