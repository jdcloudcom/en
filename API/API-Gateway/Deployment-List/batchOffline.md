# batchOffline


## Description
Off-line by batch

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/deployments:offline

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deploymentIds**|String|False| |The deployed ID collection to be deleted shall be separated by ,|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](batchoffline#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**successCount**|Integer|Number of Resources Operated Successfully|
|**failed**|[ErrorItem[]](batchoffline#erroritem)|Resources Operation Failed and Reasons|
### <div id="erroritem">ErrorItem</div>
|Name|Type|Description|
|---|---|---|
|**id**|String|Error Resource ID|
|**code**|Long|Error code, same as standard code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific error, same as standard status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
