# createSubscriptionKey


## Description
Create New Key Pair

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/subscriptionKeys

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description|
|**name**|String|False| |Key Pair Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createsubscriptionkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subscriptionKeyId**|String|Created Key Pair ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
