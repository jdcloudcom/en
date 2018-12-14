# encrypt


## Description
Encrypt data by using keys

## Request Method
POST

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:Encrypt

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**plaintext**|String|False| |Plaintext data Base64-encoded binary data object|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**ciphertextBlob**|String|Ciphertext data Base64-encoded binary data object|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
