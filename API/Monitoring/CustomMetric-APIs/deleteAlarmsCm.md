# deleteAlarmsCm


## Description
Delete custom metric monitoring rules

## Request Method
DELETE

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/cm/alarms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ids**|String|True| |ids, separate multiple ids by \||


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested Identifierid|
|**result**|Object| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
