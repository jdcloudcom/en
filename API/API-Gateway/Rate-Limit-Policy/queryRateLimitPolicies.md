# queryRateLimitPolicies


## Description
Search the traffic control policy list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/rateLimitPolicies

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](queryratelimitpolicies#filter)|False| |policyName - Policy name, fuzzy matching<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryratelimitpolicies#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**rateLimitPolicys**|[RateLimitPolicy[]](queryratelimitpolicies#ratelimitpolicy)|Searched all traffic control policy details|
|**totalCount**|Integer|Searched traffic control policy counts|
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
