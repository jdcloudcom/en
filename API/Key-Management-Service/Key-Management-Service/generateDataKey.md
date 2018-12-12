# generateDataKey


## Description
Obtain plaintext/ciphertext of a data key from KMS

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:GenerateDataKey

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**ciphertextBlob**|String|Ciphertext DEK Base64-encoded binary data object|
|**plaintext**|String|Plaintext DEK Base64-encoded binary data objt|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
