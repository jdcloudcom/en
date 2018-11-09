# createAlarm


## Description
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## Request method
POST

## Request address
https://monitor.jcloud.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clientToken**|String|True| |Idempotent validation parameter, 32-bit at the longest, the return value will not change if the value does not change|
|**createAlarmSpec**|CreateAlarmSpec|True| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**alarmIdList**|String[]|Rule ID List Created|

## Response code
|Return code|Description|
|---|---|
|**200**|Create Rules|
