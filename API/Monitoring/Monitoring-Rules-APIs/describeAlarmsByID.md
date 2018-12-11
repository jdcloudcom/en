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
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min|
|**contactGroups**|String[]| |
|**contactPersons**|String[]| |
|**createTime**|String| |
|**enabled**|Long|Enable & Disable 1 Enable, 0 Disable|
|**id**|String|Rule ID|
|**metric**|String|Monitoring Item|
|**metricName**|String|Name of Rule ID Monitoring Item|
|**noticePeriod**|Long|Notification Period Unit: Hour|
|**noticeTime**|String|Alarm time, this field is valid when querying the alarming rule|
|**operation**|String|>=、>、<、<=、==、！=|
|**period**|Long|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|Resource ID Applied by This Rule|
|**serviceCode**|String|Product Corresponded to the Alarm Rule|
|**status**|Long|Monitoring Item Status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tag**|String|Auxiliary Information of Monitoring Item|
|**threshold**|Double|Threshold|
|**times**|Long|Alarm after how many times|
|**value**|Double|Alarm Value|

## Response code
|Return code|Description|
|---|---|
|**200**|Query monitoring rule results|
