# describeAlarm


## Description
Query Rule Details

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms/{alarmId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rule id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Alarm Rule ID|
|**alarmStatus**|Long|Rule status, when there are alarming resource, resources of insufficient data and normal resources under the same rule, the rule status shall be displayed according to the priority of alarming>insufficient data>normal<br>monitoring item status: -1 disabled, 1 normal, 2 alarm and 4 insufficient data|
|**alarmStatusList**|Long[]|There might be many rule status list: 1 Normal, 2 Alarm, 4 Insufficient Data|
|**baseContact**|BaseContact[]|Alarm Notification Contact|
|**createTime**|String|Creation Time|
|**dimension**|String|Resource Dimension|
|**dimensionName**|String|Resource Dimension Name|
|**enabled**|Long|Enable or not, 1 means to enable rules, 0 refers to disable rules and the default value is 1|
|**noticeOption**|NoticeOption[]|Notification Policy|
|**product**|String|Resource Type|
|**productName**|String|Resource Type Name|
|**resourceOption**|ResourceOption| |
|**ruleName**|String|Rule name, the rule name maximum contains 42 characters in length and allows Chinese, English, numbers, ''-'' and "_"|
|**ruleOption**|RuleOptionDetail| |
|**ruleType**|String|Rule type is resourceMonitor by default|
|**ruleVersion**|String|Rules Version  v1  v2|
|**tags**|Object|Resource dimension, specify dimension tag of monitoring data instance, such as resourceId=id. (Please confirm if the resource monitoring data has any tag, otherwise the rules will give the insufficient data report)|
|**webHookOption**|WebHookOption| |
### WebHookOption
|Name|Type|Description|
|---|---|---|
|**webHookContent**|String|Note for content callback: webHook will be created only when both webHookUrl and webHookProtocol are not null|
|**webHookProtocol**|String|webHook Protocol|
|**webHookSecret**|String|Callback secret, user requests signature to prevent forgery|
|**webHookUrl**|String|Callback url|
### RuleOptionDetail
|Name|Type|Description|
|---|---|---|
|**rules**|BasicRuleDetail[]|Rule triggering condition, when being designed with module parameters, rules shall be used with priority|
|**templateOption**|TemplateOption| |
### TemplateOption
|Name|Type|Description|
|---|---|---|
|**templateId**|String|Template Id|
|**templateType**|Long|Template Type. 1 - Default Template  2 - Customized Template|
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
### ResourceOption
|Name|Type|Description|
|---|---|---|
|**resourceItems**|ResourceItem[]|Designate specific resource ID setting and alarm rules, with maximum 100 per time. Prior Effectiveness of resourceItems|
|**tagsOption**|TagsOption| |
### TagsOption
|Name|Type|Description|
|---|---|---|
|**operator**|String|Operation items (relationship between tagFilter items) are or by default|
|**tags**|TagFilter[]|Resource tag, set alarm rules for resources conforming to this tag and automatically come into force for resources to which the tag is added|
### TagFilter
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**values**|String[]|Tag Value|
### ResourceItem
|Name|Type|Description|
|---|---|---|
|**region**|String|Resource region|
|**resourceId**|String|Resources id|
### NoticeOption
|Name|Type|Description|
|---|---|---|
|**effectiveIntervalEnd**|String|Effectiveness end time, default value: 23:59|
|**effectiveIntervalStart**|String|Effectiveness start time, default value: 00:00|
|**noticeCondition**|Long[]|Notification condition 1 - alarm 2 - insufficient data 3 - alarm recovery|
|**noticePeriod**|Long|Notification silent period, unit: minute, default value: 24h, now the supported values include "24h, 12h, 6h, 3h, 1h, 30 min, 15 min, 10 min and 5 min"|
|**noticeWay**|Long[]|Notification Method    1-SMS 2-Email|
### BaseContact
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact id.  Note: in case of ReferenceType=2, please fill in 0 for contact id|
|**referenceType**|Long|Contact id type: 0, contact grouping id; 1, contact id, 2, main contact of pin account|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Return Result of Rule Deletion   |   


