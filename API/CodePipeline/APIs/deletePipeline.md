# deletePipeline


## Description
Delete a CodePipeline task

## Request Method
DELETE

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline Task|
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
|**uuid**|String|uuid of CodePipeline Task|
|**result**|Boolean|true if the deletion succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
