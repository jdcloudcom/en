# describeSecondaryCidrs


## Description
Search secondary CIDR list

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/secondaryCidrs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describesecondarycidrs#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**secondaryCidrs**|[SecondaryCidr[]](describesecondarycidrs#secondarycidr)| |
### <div id="secondarycidr">SecondaryCidr</div>
|Name|Type|Description|
|---|---|---|
|**secondaryCidrId**|String|Secondary cidr ID|
|**cidr**|String|Secondary cidr|
|**region**|String|Region code, e.g. cn-east-tz1|
|**az**|String|Availability zone, e.g. cn-east-tz1a|
|**subnetId**|String|Subnet ID|
|**name**|String|Secondary cidr Name|
|**vpcId**|String|VPC Id|
|**vpcName**|String|Name of VPC|
|**availableIpCount**|Integer|Counts of Available ips|
|**totalIpCount**|Integer|Total ip Counts|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
