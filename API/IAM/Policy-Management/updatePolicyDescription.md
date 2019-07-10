# updatePolicyDescription


## Description
Modify policy descriptions

## Request Method
PUT

## Request Address
https://iam.jdcloud-api.com/v1/policy/{policyName}/description

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**policyName**|String|True| |Policy Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**updatePolicyDescriptionInfo**|UpdatePolicyDescriptionInfo|True| |Policy Description Information|

### UpdatePolicyDescriptionInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|True| |Description, 0~256 Characters|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
