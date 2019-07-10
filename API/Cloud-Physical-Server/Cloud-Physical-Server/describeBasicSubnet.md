# describeBasicSubnet


## Description
Search underlying network Subnet

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/subnet

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, e.g. cn-east-1a; call API (describeRegiones) to get Availability Zone supported by Cloud Physical Server in this region|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**subnet**|Subnet|Details of Subnet|
### Subnet
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-east-1|
|**az**|String|Availability Zone, e.g. cn-east-1a|
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
