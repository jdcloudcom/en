# startJob


## Description
Start a compilation task based on id

## Request Method
POST

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{id}:start

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Job uuid|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**category**|String|False| |Type branch/commit/tag|
|**branch**|String|False| |Value Corresponding to Type|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**commitresult**|Boolean|Whether the task submission succeeded or not|
|**buildUuid**|String|uuid of the Building Task Submitted for Running|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
