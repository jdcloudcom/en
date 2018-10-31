# runWorkFlow


## Description
Run the specified workflow

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{workflowId}:run

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**workflowId**|String|True| |Workflow ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
