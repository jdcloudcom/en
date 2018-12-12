# exportSecret


## Description
Export confidentiality

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}:export

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|

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
|**secretPackage**|String|Confidentiality Package|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
