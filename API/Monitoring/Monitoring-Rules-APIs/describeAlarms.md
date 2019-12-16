# describeAlarms


## Description
Search rule list

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**serviceCode**|String|False| |Product line identifier, the same product line has several products, for example (there are redis2.8cluster and redis4.0 under redis)|
|**product**|String|False| |Product identifier, there are many products under redis (redis2.8cluster and redis4.0). When serviceCode and product are designated at the same time, product shall come into force with priority|
|**dimension**|String|False| |Dimension identifier under product, be sure to designate product while designating dimension|
|**ruleName**|String|False| |Rule Name|
|**ruleType**|Long|False| |Rule category, 1 represents resource monitoring, 6 represents site monitoring and 7 represents availability monitoring|
|**enabled**|Long|False| |Rule Status: 1 is Enable, 0 is Disable|
|**ruleStatus**|Long|False| |Resource rule status  2: alarm  4. insufficient data|
|**filters**|Filter[]|False| |Service code or resource Id list<br>products - product, exact match, supporting multiple products<br>resourceIds - resource Id, exact match, supporting multiple Ids (be sure to designate serviceCode, product or dimension, otherwise this parameter will not come into force)<br>alarmIds - rule id, exact match, supporting multiple ids|

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
|**alarmList**|DescribeGroupAlarm[]|List of rules|
|**numberPages**|Long|Total Number of Pages|
|**numberRecords**|Long|Number of Total Records|
|**pageNumber**|Long|Current Page Number|
|**pageSize**|Long|Paging Size|
### DescribeGroupAlarm
|Name|Type|Description|
|---|---|---|
|**alarmId**|String|Alarm Rule ID|
|**alarmStatus**|Long|Rule status, when there are alarming resource, resources of insufficient data and normal resources under the same rule, the rule status shall be displayed according to the priority of alarming>insufficient data>normal<br>monitoring item status: -1 disabled, 1 normal, 2 alarm and 4 insufficient data|
|**alarmStatusList**|Long[]|There might be many rule status list: 1 Normal, 2 Alarm, 4 Insufficient Data|
|**createTime**|String|Creation Time|
|**dimension**|String|Resource Dimension|
|**dimensionName**|String|Resource Dimension Name|
|**enabled**|Long|Enable or not, 1 means to enable rules, 0 refers to disable rules and the default value is 1|
|**product**|String|Resource Type|
|**productName**|String|Resource Type Name|
|**resourceOption**|ResourceOption| |
|**ruleName**|String|Rule name, the rule name maximum contains 42 characters in length and allows Chinese, English, numbers, ''-'' and "_"|
|**ruleOption**|RuleOptionDetail| |
|**ruleType**|String|Rule type is resourceMonitor by default|
|**ruleVersion**|String|Rules Version  v1  v2|
|**tags**|Object|Resource dimension, specify dimension tag of monitoring data instance, such as resourceId=id. (Please confirm if the resource monitoring data has any tag, otherwise the rules will give the insufficient data report)|
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
|**resourceId**|String|xx Resourcesid|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search rule list  |  


