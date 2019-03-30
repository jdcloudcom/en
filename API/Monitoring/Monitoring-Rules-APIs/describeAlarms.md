# describeAlarms


## Description
Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.
1：alarmId cannot be blank
2：serviceCode cannot be blank
2.1：serviceCode + resourceId
2.2: serviceCode + resourceIds
3: serviceCodes cannot be blank
4: All rules

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**serviceCode**|String|False| |Product Name|
|**resourceId**|String|False| |Resource ID|
|**ruleType**|Long|False| |Rule category, 1 represents resource monitoring, 6 represents site monitoring and 7 represents availability monitoring|
|**status**|Long|False| |Rule Alarm Status, 1: Normal, 2: Alarm, 4: Insufficient Data|
|**enabled**|Long|False| |Rule Status: 1 is Enable, 0 is Disable|
|**isAlarming**|Long|False| |Whether it is the rule that is alarming, 0 is neglect, 1 is yes, only one can take effect at the same time as status, isAlarming takes priority to take effect|
|**alarmId**|String|False| |Rulesid|
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
|**alarmList**|DescribedAlarm[]|List of rules|
|**total**|Long|Total Number of Rules|
### DescribedAlarm
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Calculation Unit|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min|
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
|**levels**|Object|报警级别以及对应的阈值，是一个map[string]float64对象。key:common, critical, fatal, value: the threshold values corresponding to alarm levels, which shall meet the progressive relationship corresponding to operation parameters. eg: "levels":{"common":1000,"critical":10000,"fatal":15000}|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query monitoring rule results|
