# updateAlarm


## Description
Modify alarm rules already created, support to modify alarm rules and notified contact information When the alarm rule is in the status of “Enabled” the alarm rule is allowed to be modified.

## Request method
PATCH

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rule ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**calculation**|String|True| |Statistical method: average value=avg, maximum value=max, minimum value=min, summation=sum|
|**contactGroups**|String[]|False| |Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|False| |Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**downSample**|String|False| |Sampling Frequency|
|**metric**|String|True| |Query Metric field returned by list API of available monitoring item based on the product line|
|**noticePeriod**|Integer|False| |Notification Period Unit: Hour|
|**operation**|String|True| |>=, >, <, <=, ==, !=|
|**period**|Integer|True| |Statistical Period (Unit: Minute), optional value: 2, 5, 15, 30, 60|
|**serviceCode**|String|True| |Product Name|
|**threshold**|Number|True| |Threshold|
|**times**|Integer|True| |Alarm after how many times, optional value: 1, 2, 3, 5|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Rule ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
