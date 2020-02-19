# describeAlarms


## Description
Search alarm rule list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/alarms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**resourceType**|String|False| |Resource type bandwidth: Bandwidth|
|**resourceId**|String|False| |Resource ID, be sure to designate resourceType while designating resourceId|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describealarms#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**alarms**|[DescribeAlarm[]](describealarms#describealarm)|List of alarm rules|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="describealarm">DescribeAlarm</div>
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
