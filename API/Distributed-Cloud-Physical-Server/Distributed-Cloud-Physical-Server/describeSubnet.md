# describeSubnet


## Description
Search Subnet detail

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**subnetId**|String|True| |Subnet ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describesubnet#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subnet**|[Subnet](describesubnet#subnet)|Details of Subnet|
### <div id="subnet">Subnet</div>
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
