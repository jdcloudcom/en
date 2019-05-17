# deleteStack


## Description
Delete Resource Stack

## Request Method
DELETE

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**stackId**|String|True| |Resource Stack ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**details**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|Delete Stack results, and Result returned after deletion succeeded is null|
