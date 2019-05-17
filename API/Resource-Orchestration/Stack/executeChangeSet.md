# executeChangeSet


## Description
Execute change set

## Request Method
POST

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}/changesets/{changesetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**stackId**|String|True| |Resource Stack ID|
|**changesetId**|String|True| |Change SetID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object|Null at all times|
|**requestId**|String|Requested identifier id|


## Return Code
|Return Code|Description|
|---|---|
|**200**|Execute change set|
