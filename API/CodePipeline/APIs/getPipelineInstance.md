# getPipelineInstance


## Description
Search the execution result and status information about CodePipeline

## Request Method
GET

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}/instance/{instanceUuid}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline|
|**instanceUuid**|String|True| |The uuid of the execution history record of CodePipeline can also be replaced with the latest character string to obtain the recent status|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**isSimple**|Boolean|False| |As for the execution status of CodePipeline, if isSimple is true, only the status of each of the stages is displayed, and the action status in the stages will be ignored|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pipelineInstance**|PipelineInstance| |
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
|**200**|ok|
