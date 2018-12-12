# describeSecretVersionList


## Description
Obtain confidentiality details

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|

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
|**secretDetail**|SecretDetail| |
### SecretDetail
|Name|Type|Description|
|---|---|---|
|**secretInfo**|SecretInfo|Basic Information of key|
|**secretVersionCount**|Integer|Number of Secret Version|
|**secretVersionList**|SecretVersionItem[]|SecretList of Version Details|
### SecretInfo
|Name|Type|Description|
|---|---|---|
|**createTime**|String|SThe creation time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**secretDesc**|String|SDescription to Purpose of Secret|
|**secretId**|String|SecretID|
|**secretName**|String|SName of Secret|
|**secretStatus**|Integer|Current Status of Secret: 0: Enabled; 1: Disabled|
### SecretVersionItem
|Name|Type|Description|
|---|---|---|
|**expireTime**|String|The expiration time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**secretData**|String|Content of key|
|**secretStatus**|Integer|Current Status of Secret: 0: Enabled; 1: Disabled|
|**secretVersion**|String|Version Identifier|
|**startTime**|String|SThe secret activation time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
