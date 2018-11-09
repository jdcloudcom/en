# queryVpcSubnets


## Description
Query Vpc subnet collection

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/vpcSubnets/{vpcId}:query

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcId**|String|True| | |

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|QueryVpcSubnets[]|VPC Subnet Information Collection|
|**message**|String| |
|**status**|String| |
### QueryVpcSubnets
|Name|Type|Description|
|---|---|---|
|**vpcSubnetId**|String|VPC Subnet ID|
|**vpcSubnetName**|String|VPC Subnet Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
