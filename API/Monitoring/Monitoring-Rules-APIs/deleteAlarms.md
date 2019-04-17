# deleteAlarms


## Description
Batch Delete Rules

## Request Method
DELETE

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ids**|String|True| |For rule id to be deleted, use "|” to separate multiple rules|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String|Requested identifierid|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
