# deleteKeypair


## Description
Delete key pairs.


## Request Method
DELETE

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs/{keyName}

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**keyName**|String|True| |Key Pair Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
