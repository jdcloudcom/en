# deleteKeypairs


## Description
Delete key pair

## Request Method
DELETE

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/keypairs/{keypairId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**keypairId**|String|True| |Key Pair ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](deletekeypairs#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**success**|Boolean|Whether the deletion operation succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
