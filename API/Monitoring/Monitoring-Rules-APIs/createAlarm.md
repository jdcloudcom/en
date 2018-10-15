# createAlarm


## Description
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## Request method
POST

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clientToken**|String|True| |Idempotent validation parameter, 32-bit at the longest, the return value will not change if the value does not change|
|**createAlarmSpec**|CreateAlarmSpec|True| | |

### CreateAlarmSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**calculation**|String|True| |Statistical method must be consistent with the defined metric, with an optional list of values: avg, max, sum, min|
|**contactGroups**|String[]|False| |Contact group notified by alarm rules must be already created on the console, for example“[‘contact group 1’, ‘contact group 2’]”|
|**contactPersons**|String[]|False| |Contacts notified by alarm rules must be already created on the console, for example“[‘contact 1’, ‘contact 2’]”|
|**downSample**|String|False| |Sampling frequency, some metrics support setting downSample, through <a href='http://docs.jdcloud.com/monitoring/api/describemetricsforcreatealarm'>[Query metric list to create monitoring rules available]</a>API is available for viewing.|
|**metric**|String|True| |For values, please view <a href='http://docs.jdcloud.com/monitoring/api/describemetricsforcreatealarm'> [Query metric list to create monitoring rules available]</a> metric field of API|
|**noticePeriod**|Integer|False| |Notification Period Unit: Hour|
|**operation**|String|True| |Alarm comparison is limited to <=,<,>,>=,==,!=|
|**period**|Integer|True| |Statistical period, unit: minutes, currently supported value: 2, 5, 15, 30, 60|
|**resourceIds**|String[]|True| |Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example ['resourceId1','resourceId2'] |
|**serviceCode**|String|True| |For values of product name, please view <a href='http://docs.jdcloud.com/monitoring/api/describemetricsforcreatealarm'>[Query metric list to create monitoring rules available ]</a> serviceCode field of API|
|**threshold**|Number|True| |Alarm threshold, currently, only numeric type is available|
|**times**|Integer|True| |Continuous periods, alarms are made when several statistical periods meet threshold value conditions through continuous detections, optional values: 1, 2, 3, 5|

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
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
