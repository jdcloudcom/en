# attachRolePolicy


## Description
Associate policies for roles

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/role/{roleName}:attachRolePolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

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
