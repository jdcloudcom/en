# decrypt


## Description
Decrypt data by using keys

## Request Method
POST

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:Decrypt

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ciphertextBlob**|String|False| |Ciphertext data Base64-encoded binary data object|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**plaintext**|String|Plaintext data Base64-encoded binary data object|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
