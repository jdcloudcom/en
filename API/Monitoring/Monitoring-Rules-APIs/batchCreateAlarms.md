# batchCreateAlarms


## Description
Batch create alarm rules, it can create multiple alarm rules for several instances.

## Request Method
POST

## Request Address
https://monitor.jcloud.com/v1/regions/{regionId}/alarms/batch

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**clientToken**|String|True| |Idempotence validation parameter, 36-bit at the longest|
|**contacts**|BaseContact[]|False| |Notify contacts|
|**datacenter**|String|False| |Region|
|**resourceIds**|String[]|True| |Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example"['resourceId1','resourceId2']"|
|**ruleType**|Integer|False| |Rule category, 1 represents resource monitoring, and 6 represents site monitoring, which shall be 1 by default|
|**rules**|BaseRule[]|True| |Batch creation of rule lists is required|
|**saveTemplate**|Boolean|False| |Confirm to save it as a template|
|**serviceCode**|String|True| |Product line identifier, xxx corresponding to rulesserviceCode|
|**templateName**|String|False| |Template name, which cannot be blank when the template is saved|
|**templateServiceCode**|String|False| |Product line identifier, when it is saved as the a template, the template's correspondingserviceCode|
|**webHookContent**|String|False| |Callback content  Note: It is created only when the webHookUrl and webHookContent are not blank.webHook|
|**webHookProtocol**|String|False| |webHook protocol|
|**webHookSecret**|String|False| |Callback secret, user requests signature to prevent forgery|
|**webHookUrl**|String|False| |Callback url|

### BaseContact
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**referenceId**|Integer|True| |Contact id|
|**referenceType**|Integer|True| |Contact id type 0, contact grouping id; 1, contact id|
### BaseRule
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**autoScalingPolicyId**|String|False| |Auto Scaling Group ID|
|**calculateUnit**|String|True| |Unit|
|**calculation**|String|True| |Statistical method must be consistent with the defined metric, with an optional list of values: avg,sum,max,min|
|**downSample**|String|True| |Downsampling function|
|**metric**|String|True| |Monitoring Item|
|**noticeLevel**|NoticeLevel|False| | |
|**noticePeriod**|Integer|True| |Notification Period Unit: Hour|
|**operation**|String|True| |Alarm comparators only can be the following types: lte(<=),lt(<),gt(>),gte(>=),eq(==),ne(! =)|
|**period**|Integer|True| |Query indicator period, unit in minutes, currently supported value: 1, 2, 5, 15, 30, 60|
|**ruleType**|Integer|False| |Rule category, 1 represents monitoring rules, and 6 represents site monitoring, which shall be 1 by default|
|**tags**|Object|False| |Multiple-valued tag|
|**threshold**|Number|True| |Alarm threshold, currently, only numeric type functions are available|
|**times**|Integer|True| |Alarms are made when several times meet threshold value conditions through continuous detections, optional values: 1,2,3,5,10,15,30,60|
### NoticeLevel
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**custom**|Boolean|True| |Is it the class defined by the user, true or false|
|**levels**|Object|True| |Alarm class and corresponding indicator, common: moderate, critical: severe, fatal: emergency|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**alarmIDList**|String[]|Rule id List Created Successfully|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Create Rules by Batch|
