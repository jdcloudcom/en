# queryVpcs


## Description
Obtain vpc collection

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/vpcs:query

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

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
|**data**|QueryVpcs[]|VPC Collection|
|**message**|String| |
|**status**|String| |
### QueryVpcs
|Name|Type|Description|
|---|---|---|
|**vpcId**|String|VPC id|
|**vpcName**|String|VPC Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
