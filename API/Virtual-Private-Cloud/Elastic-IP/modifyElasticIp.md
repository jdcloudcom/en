# modifyElasticIp


## Description
Modify elastic IP

## Request Method
PATCH

## Request Address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |ElasticIp ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP speed limit (unit: Mbps), value range is [1-200]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid param 'xxx'|
|**404**|Resource not found|
