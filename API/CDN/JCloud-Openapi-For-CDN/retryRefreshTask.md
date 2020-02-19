# retryRefreshTask


## Description
Task Retry

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:retry


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|False| |Retried Task taskId|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorCount**|Integer|Count of Failed Tasks|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
