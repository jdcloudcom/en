# queryDomainConfigStatus


## Description
Search domain configuration status

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{taskId}/status

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Task ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskStatus**|String|Task status, [success: success, failed: failure, configuring: configuring)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
