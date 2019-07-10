# stopBuild


## Description
Stop the building task

## Request Method
POST

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{jobid}/builds/{id}:stop

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
|**id**|String| |
|**result**|Boolean| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
