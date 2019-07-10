# detachGroupPolicy


## Description
Disassociate policies for user groups

## Request Method
DELETE

## Request Address
https://iam.jdcloud-api.com/v1/group/{groupName}:detachGroupPolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupName**|String|True| |Name of User Group|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**policyName**|String|True| |Policy Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
