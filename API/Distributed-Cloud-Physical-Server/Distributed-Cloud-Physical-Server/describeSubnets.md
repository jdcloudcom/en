# describeSubnets


## Description
Query Subnet List

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/subnets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[20, 100]|
|**az**|String|False| |Availability Zone, accurate match|
|**name**|String|False| |Subnet Name|
|**vpcId**|String|False| |VPC ID, Exact Match|
|**filters**|[Filter[]](#filter)|False| |subnetId - Subnet ID, exact match, supporting multiple IDs<br>|

### <div id="Filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subnets**|[Subnet[]](#subnet)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Page size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="Subnet">Subnet</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
|**az**|String|Availability zone, e.g. cn-east-tz1a|
|**subnetId**|String|Subnet ID|
|**name**|String|Subnet Name|
|**cidr**|String|CIDR|
|**vpcId**|String|VPC Id|
|**vpcName**|String|Name of VPC|
|**availableIpCount**|Integer|Counts of Available ips|
|**totalIpCount**|Integer|Total ip Counts|
|**networkType**|String|Network Type|
|**description**|String|Description|
|**createTime**|String|Creation Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
