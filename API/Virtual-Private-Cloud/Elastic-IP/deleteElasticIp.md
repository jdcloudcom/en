# deleteElasticIp


## Description
Delete Elastic IP

## Request method
DELETE

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |ElasticIp ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid param 'xxx'|
|**404**|elasticIp 'xxx' not found|
|**500**|Unknown server error|
|**503**|Service unavailable|
