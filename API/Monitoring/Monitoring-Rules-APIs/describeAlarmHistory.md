# describeAlarmHistory


## Description
Query alarm history
Supporting query based on alarm rule ID, resource ID and product name.
1. serviceCode
1.1 serviceCode + resourceId
1.2 serviceCode + resourceIds
2. serviceCodes
3. User's All Rules

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
|**alarmId**|String|False| |RulesId|
|**alarming**|Long|False| |Alarming, value: 1|
|**endTime**|String|False| |End Time|
|**filters**|Filter[]|False| |Service code or resource Id list <br>filter name is serviceCodes, representing rules to query multiple product lines<br>filter name is resourceIds, representing rules to query multiple resources|
|**pageNumber**|Long|False| |Current Page, 1 by default|
|**pageSize**|Long|False| |Paging Size, 20 by default. Value Range: [1, 100]|
|**resourceId**|String|False| |Resource Id|
|**serviceCode**|String|False| |Product Line|
|**startTime**|String|False| |Start Time|

### Filter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**alarmHistoryList**|AlarmHistory[]|Alarm History List|
|**total**|Long|Total Amount|
### DescribedAlarmHistory
|Name|Type|Description|
|---|---|---|
|**alarm**|DescribedAlarm| |
|**contacts**|DescribedNoticeContacts[]|Alarm Contacts|
|**noticeLevelTriggered**|String|Alarm level triggered. It shall be 'common', 'critical', 'fatal' respectively from low to high|
|**noticeTime**|String|Alarm Time|
|**value**|Double|Alarm Value|
### DescribedAlarm
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Calculation Unit|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
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
|**levels**|Object|Alarm class and corresponding indicator, common: moderate, critical: severe, fatal: emergency|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact grouping id, 1 - contact id|

## Response code
|Return code|Description|
|---|---|
|**200**|Query Alarm History|
