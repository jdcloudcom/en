# describeKey


## Description
Obtain key details

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}

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
|**keyInfo**|KeyInfo| |
### KeyInfo
|Name|Type|Description|
|---|---|---|
|**createTime**|String|The creation time of key in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**deleteTime**|String|The planned deletion time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**keyDesc**|String|Use of Key|
|**keyId**|String|KeyID|
|**keyName**|String|Name of Key|
|**keyStatus**|Integer|Current Status of Key: 0: Enabled; 1: Disabled; 2: Planned to Be Deleted|
|**rotationCycle**|Integer|The Key rotation cycle of 0 means no rotation.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
