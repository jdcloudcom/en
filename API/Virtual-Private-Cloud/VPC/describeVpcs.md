# describeVpcs


## 描述
Query VPC list

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |VPCIds - VPC ID list, support multiple IDs<br>VPCNames - VPC name list, support multiple names<br>|
|**pageNumber**|Integer|False|1|Page; it is 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**totalCount**|Number|Total Number|
|**vpcs**|Vpc[]|VPC Resource Information List|
### Vpc
|名称|类型|描述|
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
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
