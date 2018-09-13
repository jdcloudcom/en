# createAlarm


## Description
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## Request method
POST

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clientToken**|String|True||Idempotent validation parameter, 32-bit at the longest, the return value will not change if the value does not change|
|**createAlarmSpec**|[CreateAlarmSpec](##CreateAlarmSpec)|True|||

### <a name="CreateAlarmSpec">CreateAlarmSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**calculation**|String|True||Statistical method must be consistent with the defined metric, with an optional list of values: avg, max, sum, min|
|**contactGroups**|String[]|False||Contact group notified by alarm rules must be already created on the console, for example“[‘contact group 1’, ‘contact group 2’]”|
|**contactPersons**|String[]|False||Contacts notified by alarm rules must be already created on the console, for example“[‘contact 1’, ‘contact 2’]”|
|**downSample**|String|False||Sampling frequency, some metrics support setting downSample, through <a href=”https://www.jdcloud.com/help/detail/2791/isCatalog/1”>[Query indicator list of available creating monitoring rules]</a>Interface is available for viewing.|
|**metric**|String|True||Please view <a href="https://www.jdcloud.com/help/detail/2791/isCatalog/1”> for values[Query indicator list of available creating monitoring rules]]</a> metric field of interface|
|**noticePeriod**|Integer|False||Notification period unit: hour|
|**operation**|String|True||Alarm comparators only can be the following types<=,<,>,>=,==,! =|
|**period**|Integer|True||Statistical period, unit in minutes, currently supported value: 2, 5, 15, 30, 60|
|**resourceIds**|String[]|True||Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example"['resourceId1','resourceId2']"|
|**serviceCode**|String|True||Product name, please view <a href="https://www.jdcloud.com/help/detail/2791/isCatalog/1”> for values[Query indicator list of available creating monitoring rules]]</a> serviceCode field of interface|
|**threshold**|Number|True||Alarm threshold, currently, only numeric type functions are available|
|**times**|Integer|True||Continuous periods, alarms are made when several statical periods meet threshold value conditions through continuous detections, optional values: 1, 2, 3, 5|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifier id|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**alarmIdList**|String[]|Rule id list created successfully|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
