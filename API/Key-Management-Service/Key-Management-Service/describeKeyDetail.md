# describeKeyDetail


## Description
Obtain version details

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:describeKeyDetail

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

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
|**keyDetail**|KeyDetail| |
### KeyDetail
|Name|Type|Description|
|---|---|---|
|**keyId**|String|KeyID|
|**keyName**|String|Name of Key|
|**keyVersionCount**|Integer|Number of Key Version|
|**keyVersionList**|KeyVersionItem[]|KeyList of Version Details|
|**rotationCycle**|Integer|Rotation Cycle|
### KeyVersionItem
|Name|Type|Description|
|---|---|---|
|**createTime**|String|The creation time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**deleteTime**|String|The planned deletion time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**keyStatus**|Integer|Current Status of Key: 0: Enabled; 1: Disabled; 2: Planned to Be Deleted|
|**keyVersion**|String|Version Number|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
