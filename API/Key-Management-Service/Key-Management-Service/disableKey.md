# disableKey


## Description
Disable keys in “enabled” status

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:disable

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
