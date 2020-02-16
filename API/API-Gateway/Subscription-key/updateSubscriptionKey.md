# updateSubscriptionKey


## Description
Update key pair

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/subscriptionKeys/{subscriptionKeyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subscriptionKeyId**|String|True| |subscription key id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description|
|**name**|String|False| |Key Pair Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updatesubscriptionkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subscriptionKeyId**|String|Updated Key Pair Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
