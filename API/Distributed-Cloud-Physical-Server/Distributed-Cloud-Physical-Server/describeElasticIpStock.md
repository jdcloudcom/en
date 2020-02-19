# describeElasticIpStock


## Description
Search Elastic IP inventory

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/elasticIpStock

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeelasticipstock#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region|
|**available**|Integer|Available Elastic IP Inventory|
|**availableBandwidth**|Integer|Available Bandwidth Inventory|
|**availableExtraUplinkBandwidth**|Integer|Available Additional Uplink Bandwidth Inventory|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
