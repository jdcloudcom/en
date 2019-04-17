# disableAlarm


## Description
Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.

## Request Method
POST

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}/disable

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |region|
|**alarmId**|String|True| |Rule ID|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String|Requested identifierid|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
