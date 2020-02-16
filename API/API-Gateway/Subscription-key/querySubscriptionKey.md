# querySubscriptionKey


## Description
Search a single key pair

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/subscriptionKeys/{subscriptionKeyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**subscriptionKeyId**|String|True| |subscription key id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querysubscriptionkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**subscriptionKey**|[SubscriptionKey](querysubscriptionkey#subscriptionkey)| |
### <div id="subscriptionkey">SubscriptionKey</div>
|Name|Type|Description|
|---|---|---|
|**subscriptionKeyId**|String|subscription Key id|
|**description**|String|Description|
|**subscriptionKey**|String|subscription Key|
|**name**|String|Key Pair Name|
|**createTime**|String|Key Pair Creation Time|
|**bindGroups**|[BindGroups[]](querysubscriptionkey#bindgroups)|Associate Group|
### <div id="bindgroups">BindGroups</div>
|Name|Type|Description|
|---|---|---|
|**deploymentId**|String|Deploy ID|
|**groupName**|String|Group Name|
|**environment**|String|Environment: test, preview and online|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
