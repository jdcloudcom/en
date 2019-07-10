# getBuildStatus


## Description
Search the status of building task execution

## Request Method
GET

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{jobid}/builds/{id}/status

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobid**|String|True| |job uuid|
|**id**|String|True| |uuid of Building Task|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**name**|String|Job Name of Execution Task|
|**createdAt**|Integer|Starting Time of Building Execution|
|**status**|String|Status of Building Execution|
|**completionRate**|Float|Percentage of Building Execution Completed|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
