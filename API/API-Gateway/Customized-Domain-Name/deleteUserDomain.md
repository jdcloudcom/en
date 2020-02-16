# deleteUserDomain


## Description
Delete user domain APIs

## Request Method
DELETE

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/userdomain

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainIds**|String|True| |Separate the id collection of domain to be deleted by ,|
|**apiGroupId**|String|False| |api Group id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
