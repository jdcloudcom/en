# createKeypair


## Description
Create key pairs. The public key part is stored in JD Cloud, and the private key in PKCS#8 format of the unencrypted PEM code will be returned. You only have on opportunity to save your private key. Please appropriately keep your private key.<br>
If the existed key pair name is uploaded, errors will be returned.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**keyName**|String|True| |Key pair name, which is required to be unique globally. Only figures, letters in upper case and lower case, underline “_” and line-through “-” are allowed, with at most 32 characters. <br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**keyName**|String|Key Pair Name|
|**privateKey**|String|Private key parts of key pairs, in the format of PEM PKCS#8.|
|**keyFingerprint**|String|Fingerprint of key pairs, based on the public key fingerprint format defined by RFC4716, with the MD5 information digest algorithm applied.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
