# describeAlarmsByID


## Description
Query Rule Details

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

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
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**alarm**|Alarm| |
### Alarm
|Name|Type|Description|
|---|---|---|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**contactGroups**|String[]|Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**createTime**|String|Creation Time|
|**enabled**|Integer|Enable & Disable 1 Enable, 0 Disable|
|**id**|String|Rule ID|
|**metric**|String|Monitoring Item|
|**metricName**|String|Name of Rule ID Monitoring Item|
|**noticePeriod**|Integer|Notification Period Unit: Hour|
|**noticeTime**|String|Alarm time, this field is valid when querying the alarming rule|
|**operation**|String|>=, >, <, <=, ==, !=|
|**period**|Integer|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|Resource ID Applied by This Rule|
|**serviceCode**|String|Product Corresponded to the Alarm Rule|
|**status**|Integer|Monitoring Item Status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tag**|String|Auxiliary Information of Monitoring Item|
|**threshold**|Number|Threshold|
|**times**|Integer|Alarm after how many times|
|**value**|Number|Alarm value, this field is valid when querying the alarming rule|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
