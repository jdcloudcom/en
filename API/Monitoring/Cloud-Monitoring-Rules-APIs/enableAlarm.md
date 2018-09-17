# enableAlarm


## Description
Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the API.

## Request method
POST

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}:enable

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|True||Rule id|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
