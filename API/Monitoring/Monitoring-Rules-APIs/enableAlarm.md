# enableAlarm


## Description
Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the API.

## Request Method
POST

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}/enable

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
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
