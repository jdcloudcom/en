# describeSubnet


## Description
Query Subnet

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling APIs (describeRegions)|
|**subnetId**|String|True| |Subnet ID|

## Request parameter
None


## Response parameter
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
|**region**|String|Region Code, such as cn-east-1|
|**az**|String|Availability Zone, such as cn-east-1a|
|**subnetId**|String|Subnet ID|
|**name**|String|Subnet Name|
|**cidr**|String|Subnet CIDR|
|**vpcId**|String|VPC Id|
|**vpcName**|String|Name of VPC|
|**availableIpCount**|Integer|Counts of Available ips|
|**totalIpCount**|Integer|Total ip Counts|
|**networkType**|String|Network Type|
|**description**|String|Description|
|**createTime**|String|Creation Time|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
