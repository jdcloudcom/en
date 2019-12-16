# describeAlarmHistory


## Description
Query alarm history

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarmsHistory


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**serviceCode**|String|False| |Product line identifier, the same product line has several products, for example (there are redis2.8cluster and redis4.0 under redis)|
|**product**|String|False| |Product identifier, data of all dimensions under the product will be returned by default. eg:product=redis2.8cluster (the redis2.8cluster product comprises dimensions such as redis2.8-shard, redis2.8-proxy and redis2.8-instance).|
|**dimension**|String|False| |When the parameter of dimension identifier is designated, only data of this dimension will be returned by search. For example, redis2.8cluster has different dimensions of instance and multi-part|
|**isAlarming**|Long|False| |Alarming, value: 1|
|**status**|Long|False| |Alarm status, 1 refers to alarm recovery, 2 refers to alarm and 4 refers to no data generated after alarm recovery|
|**startTime**|String|False| |Start Time|
|**endTime**|String|False| |End Time|
|**ruleType**|Long|False| |Rule types, search 1 by default, 1 indicates resource monitoring, 6 indicates site monitoring, 7 indicates availability monitoring|
|**ruleName**|String|False| |Fuzzy Search for Rule Name|
|**filters**|Filter[]|False| |serviceCodes - product line servicecode, exact match, supporting multiple codes<br>resourceIds - resource Id, exact match, supporting multiple Ids (be sure to designate serviceCode to filter by resourceIds under serviceCode. Otherwise, the parameter will not come into force)<br>alarmIds - rule Id, exact match, supporting multiple Ids|

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
|**numberPages**|Long|Total Number of Pages|
|**numberRecords**|Long|Number of Total Records|
|**pageNumber**|Long|Current Page Number|
|**pageSize**|Long|Paging Size|
### DescribedAlarmHistory
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Alarm Rule ID|
|**dimension**|String|Resource Dimension|
|**dimensionName**|String|Resource Dimension Name|
|**durationTimes**|Long|Alarm Lasting Times|
|**noticeDurationTime**|Long|Alarm Duration, Unit: Minute|
|**noticeLevel**|String|‘Alarm Level Triggered’ used in frontend display. It shall be ‘common’, ‘critical’, ‘severe’ respectively from low to high|
|**noticeLevelTriggered**|String|Alarm level triggered. It shall be 'common', 'critical', 'fatal' respectively from low to high|
|**noticeTime**|String|Alarm Time|
|**product**|String|Resource Type|
|**productName**|String|Resource Type Name|
|**receivers**|NoticeReceiver[]|Alarm Notifier|
|**resourceId**|String|Resource Id|
|**rule**|BasicRuleDetail| |
|**ruleType**|String|Rules Type|
|**status**|Long|Alarm type  1 - alarm recovery  2 - alarm  4 - insufficient data|
|**tags**|Object|Resource tags|
|**value**|Double|Alarm Value|
### BasicRuleDetail
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of indicator, such as bit/s, %, k|
|**calculation**|String|Statistical method must be consistent with the defined metric, with an optional value list of: avg, sum, max and min|
|**downSample**|String|Downsampling Function|
|**metric**|String|Unique monitoring item identifier, monitoring items available for each product line can be searched according to the DescribeMetricsForCreateAlarm APIs (use the Metric field when the rules are created) Format: metric:downsample|
|**metricName**|String|Name of Monitoring Item|
|**noticeLevel**|NoticeLevel| |
|**operation**|String|Alarm comparators only can be the following types: lte(<=),lt(<),gt(>),gte(>=),eq(==),ne(! =)|
|**period**|Long|Search indicator period (unit: minute). Now, the supported values include: 1, 2, 5, 10, 15, 30 and 60|
|**threshold**|Double|Alarm threshold, currently, only numeric type functions are available|
|**times**|Long|Alarms are made when several times meet threshold value conditions through continuous detections, optional values: 1,2,3,5,10,15,30,60|
### NoticeLevel
|Name|Type|Description|
|---|---|---|
|**custom**|Boolean|Is it the class defined by the user, true or false|
|**levels**|Object|The alarm levels and corresponding threshold values, is an object of map[string]float64. key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|
### NoticeReceiver
|Name|Type|Description|
|---|---|---|
|**email**|String| |
|**mobile**|String| |
|**personId**|Long| |
|**pin**|String| |
|**userName**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search alarm history  |  



