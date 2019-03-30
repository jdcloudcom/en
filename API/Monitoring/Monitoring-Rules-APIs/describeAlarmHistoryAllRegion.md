# describeAlarmHistoryAllRegion


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
POST

## Request Address
https://monitor.jdcloud-api.com/v1/ruleNoticeHistory


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
|**list**|AlarmHistoryWithDetail[]|Alarm History List|
|**total**|Long|Total Amount|
### AlarmHistoryWithDetail
|Name|Type|Description|
|---|---|---|
|**contacts**|DescribedNoticeContacts[]|Alarm Contacts|
|**noticeLevel**|String|‘Alarm Level Triggered’ used in frontend display. It shall be ‘common’, ‘critical’, ‘severe’ respectively from low to high|
|**noticeTime**|Long|noticeTime|
|**rule**|Rule| |
|**value**|Double|Alarm Value|
### Rule
|Name|Type|Description|
|---|---|---|
|**autoScalingPolicyId**|String|AutoScalingPolicyID|
|**calculateUnit**|String|calculateUnit|
|**calculation**|String|calculation|
|**createTime**|String|createTime|
|**dataMeaning**|Long|dataMeaning|
|**datacenter**|String|Region|
|**deleted**|Long|deleted|
|**downSample**|String|downSample|
|**enableTime**|String|enableTime|
|**enabled**|Long|enabled|
|**id**|String|uuid|
|**idpk**|Long| |
|**isLatest**|Long|isLatest|
|**metric**|String|metric|
|**metricId**|Long|metricId|
|**metricName**|String|metricName|
|**noticeLevel**|NoticeLevel| |
|**noticePeriod**|Long|notice_period|
|**operation**|String|operation|
|**period**|Long|period|
|**pin**|String|pin|
|**preVersionId**|Long|preVersionId|
|**region**|String|region|
|**resourceId**|String|Resources id|
|**rootRuleId**|Long|rootRuleID|
|**ruleType**|Long|rutye 1:Classic Monitoring  5: Custom Metric Monitoring   6: Site Monitoring 7: Availability Monitoring|
|**serviceCode**|String|serviceCode|
|**status**|Long|status|
|**statusTime**|String|statusTime|
|**tags**|Object|tags|
|**tagsNonGrouping**|String|tagsNonGrouping|
|**threshold**|Double|threshold|
|**times**|Long|times|
|**updateTime**|String|updateTime|
|**version**|Long|version|
### NoticeLevel
|Name|Type|Description|
|---|---|---|
|**custom**|Boolean|Is it the class defined by the user, true or false|
|**levels**|Object|报警级别以及对应的阈值，是一个map[string]float64对象。key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact group id, 1 - contact id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query all region alarm history|
