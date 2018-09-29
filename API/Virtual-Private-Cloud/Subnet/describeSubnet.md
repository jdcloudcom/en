# describeSubnet


## 描述
Query subnet information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subnetId**|String|True| |Subnet ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**subnet**|Subnet|Subnet Resource Information|
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
