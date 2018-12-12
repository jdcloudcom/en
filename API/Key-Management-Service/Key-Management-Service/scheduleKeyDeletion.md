# scheduleKeyDeletion


## Description
It is planned to delete the key at a time in future (7 days by default).

## Request Method
DELETE

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}:delete

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**delayDays**|Integer|False| |The delayed deletion time, counted on the basis of day, is 7 days by default, and the supported time range is 7~30 days.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**202**|Accepted|
|**404**|Not found|
