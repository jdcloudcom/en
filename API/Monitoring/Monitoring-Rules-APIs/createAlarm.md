# createAlarm


## Description
Create alarm rules

## Request Method
POST

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**baseContact**|BaseContact[]|False| |Alarm Notification Contact|
|**clientToken**|String|True| |Idempotence validation parameter, 36-bit at the longest. If the clientTokens of two requests are equal, the rule id created for the first time will be returned, and the rule is created only once|
|**dimension**|String|False| |For available resource dimension, please search with the describeProductsForAlarm APIs|
|**enabled**|Long|False| |Enable or not, 1 means to enable rules, 0 refers to disable rules and the default value is 1|
|**noticeOption**|NoticeOption[]|False| |Notification Policy|
|**product**|String|True| |Resource type, for available type list, please search with the describeProductsForAlarm APIs.|
|**resourceOption**|ResourceOption|True| | |
|**ruleName**|String|True| |Rule name, the rule name maximum contains 42 characters in length and allows Chinese, English, numbers, ''-'' and "_"|
|**ruleOption**|RuleOption|True| | |
|**ruleType**|String|False| |Rule type is resourceMonitor by default|
|**tags**|Object|False| |Resource dimension, specify dimension tag of monitoring data instance, such as resourceId=id. (Please confirm if the resource monitoring data has any tag, otherwise the rules will give the insufficient data report)|
|**webHookOption**|WebHookOption|False| | |

### WebHookOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**webHookContent**|String|False| |Note for content callback: webHook will be created only when both webHookUrl and webHookProtocol are not null|
|**webHookProtocol**|String|False| |webHook protocol|
|**webHookSecret**|String|False| |Callback secret, user requests signature to prevent forgery|
|**webHookUrl**|String|False| |Callback url|
### RuleOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**rules**|BasicRule[]|False| |Rule triggering condition, when being designed with module parameters, rules shall be used with priority|
|**templateOption**|TemplateOption|False| | |
### TemplateOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|String|False| |Template Id|
|**templateType**|Long|False| |Template Type. 1 - Default Template  2 - Customized Template|
### BasicRule
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**calculation**|String|True| |Statistical method must be consistent with the defined metric, with an optional list of values: avg,sum,max,min|
|**downSample**|String|False| |Downsampling Function|
|**metric**|String|True| |Unique monitoring item identifier, monitoring items available for each product line can be searched according to the DescribeMetricsForCreateAlarm APIs (use the Metric field when the rules are created) Format: metric:downsample|
|**noticeLevel**|NoticeLevel|False| | |
|**operation**|String|True| |Alarm comparators only can be the following types: lte(<=),lt(<),gt(>),gte(>=),eq(==),ne(! =)|
|**period**|Long|True| |Search indicator period (unit: minute). Now, the supported values include: 1, 2, 5, 10, 15, 30 and 60|
|**threshold**|Double|True| |Alarm threshold, currently, only numeric type functions are available|
|**times**|Long|True| |Alarms are made when several times meet threshold value conditions through continuous detections, optional values: 1,2,3,5,10,15,30,60|
### NoticeLevel
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**custom**|Boolean|True| |Is it the class defined by the user, true or false|
|**levels**|Object|True| |The alarm levels and corresponding threshold values, is an object of map[string]float64. key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|
### ResourceOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceItems**|ResourceItem[]|False| |Designate specific resource ID setting and alarm rules, with maximum 100 per time. Prior Effectiveness of resourceItems|
|**tagsOption**|TagsOption|False| | |
### TagsOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**operator**|String|False| |Operation items (relationship between tagFilter items) are or by default|
|**tags**|TagFilter[]|False| |Resource tag, set alarm rules for resources conforming to this tag and automatically come into force for resources to which the tag is added|
### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|
### ResourceItem
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**region**|String|True| |Resource region|
|**resourceId**|String|True| |Resources id|
### NoticeOption
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**effectiveIntervalEnd**|String|False| |Effectiveness end time, default value: 23:59|
|**effectiveIntervalStart**|String|False| |Effectiveness start time, default value: 00:00|
|**noticeCondition**|Long[]|False| |Notification condition 1 - alarm 2 - insufficient data 3 - alarm recovery|
|**noticePeriod**|Long|False| |Notification silent period, unit: minute, default value: 24h, now the supported values include "24h, 12h, 6h, 3h, 1h, 30 min, 15 min, 10 min and 5 min"|
|**noticeWay**|Long[]|False| |Notification Method    1-SMS 2-Email|
### BaseContact
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**referenceId**|Long|True| |Contact id.  Note: in case of ReferenceType=2, please fill in 0 for contact id|
|**referenceType**|Long|True| |Contact id type: 0, contact grouping id; 1, contact id, 2, main contact of pin account|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Created Rule id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Return Result of Rule Creation |  




