# imageTasks


## Description
Search the details of an image importation and exportation task


## Request Method
GET

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/imageTasks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskAction**|String|True| |Task Category. Optional Value: ImportImage, ExportImage|
|**taskIds**|Integer[]|False| |Task id|
|**taskStatus**|String|False| |Task Status. Optional Value: pending,running,failed,finished|
|**startTime**|String|False| |Task Start Time|
|**endTime**|String|False| |Task End Time|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[10, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result[ ]| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskSet**|TaskInfo[ ]|Task Detail|
|**totalCount**|Integer|: Total number|
### <div id="TaskInfo">TaskInfo</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|Integer|Task id|
|**action**|String|Task Operation Type|
|**taskStatus**|String|Task Status, pending,running,failed,finished|
|**progress**|Integer|Task Progress, 0-100|
|**message**|String|Additional Information|
|**createdTime**|String|Task Creating Time|
|**finishedTime**|String|Task Completion Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
