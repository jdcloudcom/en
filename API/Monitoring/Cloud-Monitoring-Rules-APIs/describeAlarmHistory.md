# describeAlarmHistory


## Description
Query alarm history, supporting query based on alarm rule ID, resource ID and product name.

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarmHistory

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True||Query end time of data, current time by default, it can enter long-type time, and it also can enter yyyy-MM-dd'T’HH:mm:ssZ type time|
|**id**|String|False||Id of alarm rule|
|**pageNumber**|Integer|False||Page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range[10, 100]|
|**resourceId**|String|False||Resource Id|
|**serviceCode**|String|False||Product name|
|**startTime**|String|True||Query start time of data, 24 hours ago by default, it can enter long-type time, and it also can enter yyyy-MM-dd'T’HH:mm:ssZ type time|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**alarmHistoryList**|AlarmHistory[]|Alarm history list|
|**numberPages**|Number|Number of total pages|
|**numberRecords**|Number|Number of total records|
|**pageNumber**|Number|Page|
|**pageSize**|Number|Paging size|
### <a name="AlarmHistory">AlarmHistory</a>
|Name|Type|Description|
|---|---|---|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**contactGroups**|String[]|Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**deleted**|Integer|Whether the rule has been deleted, 1 represents it has been deleted, 0 represents it has not been deleted, the deleted rules will not be retrieved when using the API for querying rules|
|**enabled**|Integer|Enable&Disable 1 Enable, 0 Disable|
|**id**|String|Rule id|
|**metric**|String|Monitoring item|
|**metricName**|String|Name of rule id monitoring item|
|**noticePeriod**|Integer|Notification period unit: hour|
|**noticeTime**|String|Alarm time|
|**operation**|String|>=、>、<、<=、==、！=|
|**period**|Integer|Statistical period (unit: minute)|
|**region**|String|Region information|
|**resourceId**|String|Resource id applied by this rule|
|**serviceCode**|String|Product corresponded to the alarm rule|
|**tag**|String|Auxiliary information of monitoring item|
|**threshold**|Number|Threshold|
|**times**|Integer|Alarm after how many times|
|**value**|Number|Alarm value|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
