# createAlarm


## Description
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## Request Method
POST

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientToken**|String|True| |Idempotence validation parameter, 36-bit at the longest. If the clientTokens of two requests are equal, the rule id created for the first time will be returned, and the rule is created only once|
|**createAlarmSpec**|CreateAlarmParam|True| | |

### CreateAlarmParam
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**calculateUnit**|String|True| |Unit|
|**calculation**|String|True| |Statistical method must be consistent with the defined metric, with an optional list of values: avg,sum,max,min|
|**contactGroups**|String[]|False| |Contact group notified by alarm rules must be already created on the console, for example“[‘contact group 1’, ‘contact group 2’]”|
|**contactPersons**|String[]|False| |Contacts notified by alarm rules must be already created on the console, for example“[‘contact 1’, ‘contact 2’]”]|
|**downSample**|String|True| |Downsampling function|
|**metric**|String|True| |Query Metric field returned by list interface of available monitoring item based on the product line|
|**noticeLevel**|NoticeLevel|False| | |
|**noticePeriod**|Long|False| |Notification period unit: hour|
|**operation**|String|True| |Alarm comparators only can be the following types: lte(<=),lt(<),gt(>),gte(>=),eq(==),ne(! =)|
|**period**|Long|True| |Query indicator period, unit in minutes, currently supported value: 1, 2, 5, 15, 30, 60|
|**resourceIds**|String[]|True| |Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example"['resourceId1','resourceId2']"|
|**serviceCode**|String|True| |Product Name|
|**tags**|Object|False| |Multiple-valued tag|
|**threshold**|Double|True| |Alarm threshold, currently, only numeric type functions are available|
|**times**|Long|True| |Alarms are made when several times meet threshold value conditions through continuous detections, optional values: 1,2,3,5,10,15,30,60|
|**webHookContent**|String|False| |Callback content Note: It is created only when the webHookUrl and webHookContent are not blank.webHook|
|**webHookProtocol**|String|False| |webHook protocol|
|**webHookSecret**|String|False| |Callback secret, user requests signature to prevent forgery|
|**webHookUrl**|String|False| |Callback url|
### NoticeLevel
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**custom**|Boolean|True| |Is it the class defined by the user, true or false|
|**levels**|Object|True| |报警级别以及对应的阈值，是一个map[string]float64对象。key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**alarmIdList**|String[]|Rule ID List Created|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Create Rules|
