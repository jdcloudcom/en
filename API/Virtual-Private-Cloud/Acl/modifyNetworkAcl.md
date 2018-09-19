# modifyNetworkAcl


## Description
Modify NetworkAcl Interface

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkAclId**|String|True||networkAclId ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**networkAclName**|String|False||networkAcl name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
