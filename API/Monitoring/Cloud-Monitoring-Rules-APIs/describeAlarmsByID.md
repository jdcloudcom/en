# describeAlarmsByID


## Description
Query rule details

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|True||Rule id|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifier id|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**alarm**|[Alarm](##Alarm)||
### <a name="Alarm">Alarm</a>
|Name|Type|Description|
|---|---|---|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**contactGroups**|String[]|Contact group notified, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|Contact notified, for example“[‘contact 1’, ‘contact 2’]”|
|**createTime**|String|Creation time|
|**enabled**|Integer|Enable&Disable 1 Enable, 0 Disable|
|**id**|String|Rule id|
|**metric**|String|Monitoring item|
|**metricName**|String|Name of rule id monitoring item|
|**noticePeriod**|Integer|Notification period unit: hour|
|**noticeTime**|String|Alarm time  ,  this field is valid when querying the alarming rule|
|**operation**|String|>=、>、<、<=、==、！=|
|**period**|Integer|Statistical period (unit: minute)|
|**region**|String|Region information|
|**resourceId**|String|Resource id applied by this rule|
|**serviceCode**|String|Product corresponded to the alarm rule|
|**status**|Integer|Monitoring item status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tag**|String|Auxiliary information of monitoring item|
|**threshold**|Number|Threshold|
|**times**|Integer|Alarm after how many times|
|**value**|Number|Alarm value, this field is valid when querying the alarming rule|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
