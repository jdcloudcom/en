# updateAlarm


## Description
Modify alarm rules already created

## Request method
PATCH

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rule ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**contacts**|BaseContact[]|False| |Contact|
|**rule**|BaseRule|True| | |
|**webHookContent**|String|False| |Callback content Note: It is created only when the webHookUrl and webHookContent are not blank.webHook|
|**webHookProtocol**|String|False| |webHook protocol|
|**webHookSecret**|String|False| |Callback secret, user requests signature to prevent forgery|
|**webHookUrl**|String|False| |Callback url|

### BaseContact
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**referenceId**|Long|True| |Contact id|
|**referenceType**|Long|True| |Contact id type 0, contact grouping id; 1, contact id|
### BaseRule
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**autoScalingPolicyId**|String|False| |Auto Scaling Group ID|
|**calculateUnit**|String|True| |Unit|
|**calculation**|String|True| |Statistical method must be consistent with the defined metric, with an optional list of values: avg,sum,max,min|
|**downSample**|String|True| |Downsampling function|
|**metric**|String|True| |Monitoring Item|
|**noticeLevel**|NoticeLevel|False| | |
|**noticePeriod**|Long|True| |Notification Period Unit: Hour|
|**operation**|String|True| |Alarm comparators only can be the following types: lte(<=),lt(<),gt(>),gte(>=),eq(==),ne(! =)|
|**period**|Long|True| |Query indicator period, unit in minutes, currently supported value: 1, 2, 5, 15, 30, 60|
|**ruleType**|Long|False| |Rule category, 1 represents monitoring rules, and 6 represents site monitoring, which shall be 1 by default|
|**tags**|Object|False| |Multiple-valued tag|
|**threshold**|Double|True| |Alarm threshold, currently, only numeric type functions are available|
|**times**|Long|True| |Alarms are made when several times meet threshold value conditions through continuous detections, optional values: 1,2,3,5,10,15,30,60|
### NoticeLevel
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**custom**|Boolean|True| |Is it the class defined by the user, true or false|
|**levels**|Object|True| |Alarm class and corresponding indicator, common: moderate, critical: severe, fatal: emergency|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|
|**result**|Object| |


## Result
|Return Code|Description|
|---|---|
|**200**|OK|
