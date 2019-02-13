# modifyElasticIp


## Description
Modify elastic IP

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**elasticIpId**|String|True| |ElasticIp ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP speed limit (unit: Mbps), value range is [1-200]|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid param 'xxx'|
|**404**|Resource not found|
