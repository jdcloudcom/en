# checkPolicyName


## Description
Check if the policy name is duplicated

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/rateLimitPolicies:checkPolicyNameExist

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**policyName**|String|True| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkpolicyname#result)|Check if Policy is duplicated|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**policyId**|String|Return to policyID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication falied|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
