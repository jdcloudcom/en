# describeAlarm


## Description
Search alarm rule detail

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/alarms/{alarmId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Alarm Rule ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describealarm#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**alarm**|[Alarm](describealarm#alarm)| |
### <div id="alarm">Alarm</div>
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Rule Instance ID|
|**name**|String|Rule Name|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**resourceType**|String|Resource type bandwidth: Bandwidth|
|**resourceId**|String|Resource ID|
|**resourceName**|String|Resource Name|
|**metric**|String|English identifier of monitoring item|
|**metricName**|String|Name of Monitoring Item|
|**period**|Integer|Statistical period (Unit: Minute)|
|**statisticMethod**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**operator**|String|Calculation Method >=, >, <, <=, =, ！ =|
|**threshold**|Double|Threshold|
|**times**|Integer|Alarm after how many times|
|**noticePeriod**|Integer|Notification period unit: hour|
|**status**|String|Rule status disabled: disabled enabled: enabled|
|**switchboard**|[Switchboard[]](describealarm#switchboard)|Interchanger Information|
### <div id="switchboard">Switchboard</div>
|Name|Type|Description|
|---|---|---|
|**ip**|String|IP|
|**port**|String|Port|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
