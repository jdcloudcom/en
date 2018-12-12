# describeSecretList


## Description
Obtain confidentiality list

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/secret


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
|**secretList**|SecretInfo[]|SecretList|
|**totalCount**|Integer|Number of Secret|
### SecretInfo
|Name|Type|Description|
|---|---|---|
|**createTime**|String|SThe creation time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**secretDesc**|String|SDescription to Purpose of Secret|
|**secretId**|String|SecretID|
|**secretName**|String|SName of Secret|
|**secretStatus**|Integer|Current Status of Secret: 0: Enabled; 1: Disabled|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
