# manualAction


## Description
Search the execution and status information about multiple designated CodePipelines


## Request Method
POST

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}/instances/{instanceUuid}/actions/{actionUuid}:manual

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline|
|**instanceUuid**|String|True| |uuid of CodePipeline Instance|
|**actionUuid**|String|True| |UUID of Action|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**status**|String|True| |Status of Manual Setting, e.g., SUCCESS, FAILED|


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
