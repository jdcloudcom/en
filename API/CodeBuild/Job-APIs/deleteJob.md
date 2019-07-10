# deleteJob


## Description
Delete a compilation task

## Request Method
DELETE

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |uuid of Compilation Task|
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
|**commitresult**|Boolean|Whether the task submission succeeded or not|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
