# queryVpcSubnets


## Description
Query Vpc subnet collection

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/vpcSubnets/{vpcId}:query

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**vpcId**|String|True|||

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|QueryVpcSubnets[]|VPC subnet information collection|
|**message**|String||
|**status**|String||
### <a name="QueryVpcSubnets">QueryVpcSubnets</a>
|Name|Type|Description|
|---|---|---|
|**vpcSubnetId**|String|VPC subnet id|
|**vpcSubnetName**|String|VPC subnet name|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
