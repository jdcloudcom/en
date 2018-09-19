# updateAssumeRolePolicy


## Description
Modify Role Built-in Policy

## Request method
PUT

## Request address
https://iam.jdcloud-api.com/v1/role/{roleName}/assumeRolePolicy

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**roleName**|String|True||Role Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**updateAssumeRolePolicyInfo**|UpdateAssumeRolePolicyInfo|True||Role Permission Information|

### UpdateAssumeRolePolicyInfo
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**assumeRolePolicyDocument**|String|False||Role Assumption Policy|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
