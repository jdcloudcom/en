# describeAlarms


## Description
Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.
1: serviceCode cannot be blank
1.1：serviceCode + resourceId
1.2: serviceCode + resourceIds
2: serviceCodes cannot be blank
3: All rules

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**alarmId**|String|False| |Rulesid|
|**enabled**|Long|False| |Rule Status: 1 is Enable, 0 is Disable|
|**filters**|Filter[]|False| |Service code or resource Id list <br>filter name is serviceCodes, representing rules to query multiple product lines<br>filter name is resourceIds, representing rules to query multiple resources|
|**isAlarming**|Long|False| |Whether it is the rule that is alarming, 0 is neglect, 1 is yes, only one can take effect at the same time as status, isAlarming takes priority to take effect|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**resourceID**|String|False| |Resource ID|
|**ruleType**|Long|False| |Rule category, 1 represents resource monitoring, 6 represents site monitoring and 7 represents availability monitoring|
|**serviceCode**|String|False| |Product Name|
|**status**|Long|False| |Rule Alarm Status, 1: Normal, 2: Alarm, 4: Insufficient Data|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**alarmList**|Alarm[]|List of rules|
|**total**|Long|Total Number of Rules|
### DescribedAlarm
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Calculation Unit|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**createTime**|String|Creation Time|
|**downSample**|String|Downsampling Method|
|**enabled**|Long|Enable or not|
|**id**|String|Alarm Rule ID|
|**metric**|String|Monitoring Item|
|**metricName**|String|Name of Monitoring Item|
|**noticeLevel**|NoticeLevel| |
|**noticePeriod**|Integer|Alarm Period|
|**operation**|String|gt, gte, lt, lte, eq, ne|
|**period**|Long|Statistical Period (Unit: Minute)|
|**region**|String|Region Information|
|**resourceId**|String|xx Resourcesid|
|**serviceCode**|String|Product Line Code|
|**status**|Long|Monitoring Item Status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tags**|Object|Tag|
|**threshold**|Number|Alarm Threshold|
|**times**|Long|Alarm Frequency|
### NoticeLevel
|Name|Type|Description|
|---|---|---|
|**custom**|Boolean|Is it the class defined by the user, true or false|
|**levels**|Object|Alarm class and corresponding indicator, common: moderate, critical: severe, fatal: emergency|

## Response code
|Return code|Description|
|---|---|
|**200**|Query monitoring rule results|
