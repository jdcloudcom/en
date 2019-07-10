# startPipeline


## Description
Start a CodePipeline task based on uuid

## Request Method
POST

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}:start

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline|
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
|**instanceUuid**|String|uuid of the Instance Generated in This Execution|
|**uuid**|String|uuid of the CodePipeline Submitted for Running|
|**result**|Boolean|Whether the task submission succeeded or not|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
