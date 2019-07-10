# describeVpc


## Description
Search VPC detail

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/vpcs/{vpcId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**vpcId**|String|True| |VPC ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**vpc**|Vpc|VPC Detail Information|
### Vpc
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-north-1|
|**vpcId**|String|VPC ID|
|**name**|String|Name of VPC|
|**cidr**|String|VPC CIDR|
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
