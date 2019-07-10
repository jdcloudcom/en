# stopPipelineInstance


## Description
Stop one execution of CodePipeline

## Request Method
POST

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}/instance/{instanceUuid}:stop

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline|
|**instanceUuid**|String|True| |uuid of CodePipeline Execution|
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
|**instanceUuid**|String| |
|**actionUuid**|String| |
|**result**|Bool| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
