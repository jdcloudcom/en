# createKeypair


## Description
Create key pairs. The public key part is stored in JD Cloud, and the private key in PKCS#8 format of the unencrypted PEM code will be returned. You only have on opportunity to save your private key. Please appropriately keep your private key.<br>
If the existed key pair name is uploaded, errors will be returned.


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**keyName**|String|True| |Key pair name, which is required to be unique globally. Only figures, letters in upper case and lower case, underline “_” and line-through “-” are allowed, with at most 32 characters. <br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**keyFingerprint**|String|Fingerprint of key pairs, based on the public key fingerprint format defined by RFC4716, with the MD5 information digest algorithm applied.|
|**keyName**|String|Key Pair Name|
|**privateKey**|String|Private key parts of key pairs, in the format of PEM PKCS#8.|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
