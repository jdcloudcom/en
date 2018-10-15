# describeAlarmHistory


## Description
Query alarm history, supporting query based on alarm rule ID, resource ID and product name.

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarmHistory

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |Query end time of data, current time by default, it can enter long-type time, and it also can enter yyyy-MM-dd'T’HH:mm:ssZ type time|
|**id**|String|False| |ID of Alarm Rule|
|**pageNumber**|Integer|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**resourceId**|String|False| |Resource Id|
|**serviceCode**|String|False| |Product Name|
|**startTime**|String|True| |Query start time of data, 24 hours ago by default, it can enter long-type time, and it also can enter yyyy-MM-dd'T’HH:mm:ssZ type time|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**alarmHistoryList**|AlarmHistory[]|Alarm History List|
|**numberPages**|Number|Number of Total Pages|
|**numberRecords**|Number|Total Number of Records|
|**pageNumber**|Number|Page|
|**pageSize**|Number|Paging Size|
### AlarmHistory
|Name|Type|Description|
|---|---|---|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**contactGroups**|String[]|Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**deleted**|Integer|Whether the rule has been deleted, 1 represents it has been deleted, 0 represents it has not been deleted, the deleted rules will not be retrieved when using the API for querying rules|
|**enabled**|Integer|Enable & Disable 1 Enable, 0 Disable|
|**id**|String|Rule ID|
|**metric**|String|Monitoring Item|
|**metricName**|String|Name of Rule ID Monitoring Item|
|**noticePeriod**|Integer|Notification Period Unit: Hour|
|**noticeTime**|String|Alarm Time|
|**operation**|String|>=, >, <, <=, ==, !=|
|**period**|Integer|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|Resource ID Applied by This Rule|
|**serviceCode**|String|Product Corresponded to the Alarm Rule|
|**tag**|String|Auxiliary Information of Monitoring Item|
|**threshold**|Number|Threshold|
|**times**|Integer|Alarm after how many times|
|**value**|Number|Alarm Value|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
