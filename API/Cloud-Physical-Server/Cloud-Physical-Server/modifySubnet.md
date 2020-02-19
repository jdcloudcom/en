# modifySubnet


## Description
Modify subnet

## Request Method
POST

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/subnets/{subnetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**subnetId**|String|True| |Subnet ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name|
|**description**|String|False| |Description|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifysubnet#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subnet**|[Subnet](modifysubnet#subnet)|Details of Subnet|
### <div id="subnet">Subnet</div>
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
