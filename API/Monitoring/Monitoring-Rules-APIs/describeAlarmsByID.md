# describeAlarmsByID


## Description
Query Rule Details

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**alarmId**|String|True| |Rule ID|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

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
|**noticeTime**|String| |
|**operation**|String|>=、>、<、<=、=、！=|
|**period**|Long|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|Resource ID Applied by This Rule|
|**serviceCode**|String|Product Corresponded to the Alarm Rule|
|**status**|Long|Monitoring Item Status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tag**|String|Auxiliary Information of Monitoring Item|
|**threshold**|Double|Threshold|
|**times**|Long|Alarm after how many times|
|**value**|Double|Alarm Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query monitoring rule results|
