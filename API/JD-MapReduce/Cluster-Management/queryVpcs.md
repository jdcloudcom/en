# queryVpcs


## Description
Obtain vpc collection

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/vpcs:query

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[QueryVpcs[]](##QueryVpcs)|VPC collection|
|**message**|String||
|**status**|String||
### <a name="QueryVpcs">QueryVpcs</a>
|Name|Type|Description|
|---|---|---|
|**vpcId**|String|VPC id|
|**vpcName**|String|VPC name|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
