# describeAlarms


## Description
Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**enabled**|Integer|False| |Rule Status: 1 is Enable, 0 is Disable|
|**isAlarming**|Integer|False| |Whether it is the rule that is alarming, 0 is neglect, 1 is yes, only one can take effect at the same time as status, isAlarming takes priority to take effect|
|**pageNumber**|Integer|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**resourceId**|String|False| |Resource Id|
|**serviceCode**|String|False| |Product Name|
|**status**|Integer|False| |Rule Alarm Status, 1: Normal, 2: Alarm, 4: Insufficient Data|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**alarmList**|Alarm[]|List of rules|
|**numberPages**|Number|Number of Total Pages|
|**numberRecords**|Number|Total Number of Records|
|**pageNumber**|Number|Page|
|**pageSize**|Number|Paging Size|
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
|**operation**|String|>=、>、<、<=、==、！=|
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
