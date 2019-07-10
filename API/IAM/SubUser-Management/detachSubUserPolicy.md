# detachSubUserPolicy


## Description
Disassociate policies for sub-users

## Request Method
DELETE

## Request Address
https://iam.jdcloud-api.com/v1/subUser/{subUser}:detachSubUserPolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subUser**|String|True| |Sub-user Name|

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
