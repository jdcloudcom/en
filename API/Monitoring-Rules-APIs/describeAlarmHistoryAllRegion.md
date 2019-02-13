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
|**alarmId**|String|False| |RulesId|
|**alarming**|Long|False| |Alarming, value: 1|
|**endTime**|String|False| |End Time|
|**filters**|Filter[]|False| |Service code or resource Id list <br>filter name is serviceCodes, representing rules to query multiple product lines<br>filter name is resourceIds, representing rules to query multiple resources|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range [1, 100]|
|**resourceId**|String|False| |ResourcesId|
|**resourceIdList**|String[]|False| |resourceId list|
|**ruleType**|Long|False| |Rule types, search 1 by default, 1 presents resource monitoring, 6 presents site monitoring, 7 presents available monitoring|
|**serviceCode**|String|False| |Product Line|
|**serviceCodeList**|String[]|False| |Product Line List|
|**startTime**|String|False| |Start Time|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested Identifierid|
|**result**|Result| |

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
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact group id, 1 - contact id|
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
|**levels**|Object|Alarm level and corresponding threshold value is a map[string]float64 object. key:common, critial, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critial":10000,"fatal":15000}|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query all region alarm history|
