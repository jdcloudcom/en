# createRateLimitPolicy


## Description
Create traffic control policy

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/rateLimitPolicies

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**rateLimitPolicyView**|[RateLimitPolicyView](createratelimitpolicy#ratelimitpolicyview)|False| |Traffic control policy details|

### <div id="ratelimitpolicyview">RateLimitPolicyView</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**policyName**|String|False| |Policy Name|
|**timeUnit**|String|False| |Time Unit|
|**apiLimitCount**|Integer|False| |api Traffic Control Times|
|**userLimitCount**|Integer|False| |User Traffic Control Times|
|**appLimitCount**|Integer|False| |Application traffic control times|
|**description**|String|False| |Description|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createratelimitpolicy#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**policyId**|String|Traffic control policy Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
