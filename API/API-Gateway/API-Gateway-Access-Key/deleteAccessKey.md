# deleteAccessKey


## Description
Key Pair Deletion

## Request Method
DELETE

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessKeys/{accessKeyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**accessKeyId**|String|True| |access key id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](deleteaccesskey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKeyId**|String|Deleted Key Pair Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
