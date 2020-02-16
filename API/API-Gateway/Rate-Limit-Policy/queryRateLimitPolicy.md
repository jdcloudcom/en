# queryRateLimitPolicy


## Description
Search a single traffic control policy

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/rateLimitPolicies/{policyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**policyId**|String|True| |Traffic Limit Policy ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryratelimitpolicy#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**rateLimitPolicy**|[RateLimitPolicy](queryratelimitpolicy#ratelimitpolicy)| |
### <div id="ratelimitpolicy">RateLimitPolicy</div>
|Name|Type|Description|
|---|---|---|
|**policyId**|String|Policy id|
|**policyName**|String|Policy Name|
|**timeUnit**|String|Time Unit|
|**apiLimitCount**|Integer|api Traffic Control Times|
|**userLimitCount**|Integer|User Traffic Control Times|
|**appLimitCount**|Integer|Application traffic control times|
|**userId**|String|User ID|
|**pin**|String|User Name|
|**description**|String|Description|
|**bindGroups**|String|Associate group. The group id separated by comma shall be stored and the group name separate by comma shall be returned|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
