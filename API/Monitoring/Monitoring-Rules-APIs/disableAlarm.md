# disableAlarm


## Description
Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.

## Request method
POST

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}:disable

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rule ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
