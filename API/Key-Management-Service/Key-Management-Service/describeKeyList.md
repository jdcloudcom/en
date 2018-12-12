# describeKeyList


## Description
Obtain key list

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/key


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|10|Page size; it is 10 by default; value range[10, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**keyList**|KeyInfo[]|KeyList|
|**totalCount**|Integer|Quantity of Key|
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
