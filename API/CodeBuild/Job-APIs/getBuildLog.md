# getBuildLog


## Description
Search the building task execution log

## Request Method
GET

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{jobid}/builds/{id}/log

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobid**|String|True| |job uuid|
|**id**|String|True| |uuid of Building Task|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**offsetNumber**|Integer|False| |Search the log offset, 0 by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**log**|String| |
|**offsetNumber**|Integer| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
