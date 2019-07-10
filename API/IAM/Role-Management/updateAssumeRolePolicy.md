# updateAssumeRolePolicy


## Description
Modify the role embedment policy

## Request Method
PUT

## Request Address
https://iam.jdcloud-api.com/v1/role/{roleName}/assumeRolePolicy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**roleName**|String|True| |Role Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**updateAssumeRolePolicyInfo**|UpdateAssumeRolePolicyInfo|True| |Role Permission Information|

### UpdateAssumeRolePolicyInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**assumeRolePolicyDocument**|String|False| |Trusted Entity Information|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
