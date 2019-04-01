# describeAlarmHistory


## Description
Query alarm history
The priority of retrieval condition combination from high to low is
1. alarmId
2. serviceCode
2.1 serviceCode + resourceId
2.2 serviceCode + resourceIds
3. serviceCodes
4. User’s All Rules

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarmHistory

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**serviceCode**|String|False| |Product Line|
|**resourceId**|String|False| |Resource Id|
|**resourceIdList**|String[]|False| |resourceId List|
|**alarmId**|String|False| |RulesId|
|**alarming**|Long|False| |Alarming, value: 1|
|**serviceCodeList**|String[]|False| |Product Line List|
|**startTime**|String|False| |Start Time|
|**endTime**|String|False| |End Time|
|**ruleType**|Long|False| |Rule types, search 1 by default, 1 indicates resource monitoring, 6 indicates site monitoring, 7 indicates availability monitoring|
|**filters**|Filter[]|False| |Service code or resource Id list <br>filter name is serviceCodes, representing rules to query multiple product lines<br>filter name is resourceIds, representing rules to query multiple resources|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**alarmHistoryList**|DescribedAlarmHistory[]|Alarm History List|
|**total**|Long|Total Amount|
### DescribedAlarmHistory
|Name|Type|Description|
|---|---|---|
|**alarm**|DescribedAlarm| |
|**contacts**|DescribedNoticeContacts[]|Alarm Contacts|
|**noticeLevelTriggered**|String|Alarm level triggered. It shall be 'common', 'critical', 'fatal' respectively from low to high|
|**noticeTime**|String|Alarm Time|
|**value**|Double|Alarm Value|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact group id, 1 - contact id|
### DescribedAlarm
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Calculation Unit|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min|
|**createTime**|String|Creation Time|
|**downSample**|String|Downsampling Method|
|**enabled**|Long|Enable or not|
|**id**|String|Alarm Rule ID|
|**metric**|String|Monitoring Item|
|**metricName**|String|Name of Monitoring Item|
|**noticeLevel**|NoticeLevel| |
|**noticePeriod**|Long|Alarm Period|
|**operation**|String|gt, gte, lt, lte, eq, ne|
|**period**|Long|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|xx Resourcesid|
|**serviceCode**|String|Product Line Code|
|**status**|Long|Monitoring Item Status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tags**|Object|Tag|
|**threshold**|Double|Alarm Threshold|
|**times**|Long|Alarm Frequency|
### NoticeLevel
|Name|Type|Description|
|---|---|---|
|**custom**|Boolean|Is it the class defined by the user, true or false|
|**levels**|Object|报警级别以及对应的阈值，是一个map[string]float64对象。key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query Alarm History|
