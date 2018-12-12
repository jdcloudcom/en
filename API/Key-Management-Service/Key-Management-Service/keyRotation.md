# keyRotation


## Description
Rotate keys now and postpone automatic rotation cycle

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:rotate

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
