# attachGroupPolicy


## Description
Associate policies for sub-users

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/group/{groupName}:attachGroupPolicy

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
