# enableSecret


## Description
Enable confidentiality

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}:enable

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
