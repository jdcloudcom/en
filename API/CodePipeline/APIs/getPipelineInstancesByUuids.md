# getPipelineInstancesByUuids


## Description
Search the execution history list of CodePipeline


## Request Method
GET

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuids**|String|True| |As for the ID of CodePipeline execution instances, multiple IDs are separated with a comma respectively|
|**isSimple**|Boolean|False| |As for the execution status of CodePipeline, if isSimple is true, only the status of each of the stages is displayed, and the action status in the stages will be ignored|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**sorts**|Sort[]|False| | |
|**filters**|Filter[]|False| |Search based on the CodePipeline name|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
### Sort
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Sorting Conditions|
|**direction**|String|False| |Direction of Sorting Conditions|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pipelineInstances**|PipelineInstance[]| |
### PipelineInstance
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid of an Execution of CodePipeline|
|**startedAt**|Integer|Start Time of CodePipeline Execution|
|**doneAt**|Integer|End Time of CodePipeline Execution|
|**durationMs**|Integer|Execution Duration (ms)|
|**status**|Integer|Execution Status|
|**statusHuman**|String|Description about Execution Status|
|**env**|String|Environment Variable during Execution|
|**failureReason**|Integer|Failure Reason|
|**falseilureReasonHuman**|String|Description about Failure Reason|
|**stages**|PipelineStage[]| |
### PipelineStage
|Name|Type|Description|
|---|---|---|
|**uuid**|String|UUID of Stage|
|**name**|String|Stage Name|
|**createdAt**|Integer|Creation Time of Stage|
|**startedAt**|Integer|Start Time of Stage|
|**doneAt**|Integer|End Time of Stage|
|**status**|Integer|Current Status of Stage|
|**statusHuman**|String|Description about the Current Status of Stage|
|**position**|Integer|Stage Ranking|
|**actions**|PipelineAction[]| |
### PipelineAction
|Name|Type|Description|
|---|---|---|
|**uuid**|String|UUID of Action|
|**name**|String|Action Name|
|**createdAt**|Integer|Creation Time of Action|
|**startedAt**|Integer|Start time of Action|
|**doneAt**|Integer|End Time of Action|
|**status**|Integer|Current Status of Action|
|**statusHuman**|String|Description about the Current Status of Action|
|**links**|ActionLinks| |
|**actionTypeId**|ActionTypeId| |
### ActionTypeId
|Name|Type|Description|
|---|---|---|
|**category**|String|Source Provider|
|**owner**|String|Source Provider Ownership|
|**provider**|String|Operation Provider|
|**version**|Integer|Version|
### ActionLinks
|Name|Type|Description|
|---|---|---|
|**provider**|ActionLink| |
|**status**|ActionLink| |
|**detail**|ActionLink| |
### ActionLink
|Name|Type|Description|
|---|---|---|
|**label**|String|Hyperlink Display Name|
|**url**|String|url of Hyperlink|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
