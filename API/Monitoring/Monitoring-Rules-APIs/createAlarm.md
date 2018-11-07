# createAlarm


## Description
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## Request method
POST

## Request address
https://monitor.jcloud.com/v1/regions/{regionId}/alarms

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**contactGroups**|String[]|False| |Contact group notified by alarm rules must be already created on the console, for example“[‘contact group 1’, ‘contact group 2’]”|
|**contactPersons**|String[]|False| |Contacts notified by alarm rules must be already created on the console, for example“[‘contact 1’, ‘contact 2’]”]|
|**downSample**|String|False| |Sampling Frequency|
|**metric**|String|True| |Query Metric field returned by list interface of available monitoring item based on the product line|
|**noticePeriod**|Integer|False| |Notification period unit: hour|
|**resourceIds**|String[]|True| |Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example"['resourceId1','resourceId2']"|
|**serviceCode**|String|True| |Product Name|
|**threshold**|Number|True| |Query cycle of indicators, unit: min, current supported value: 2, 5, 15, 30, 60|
|**times**|Integer|True| |Alarm when several successive detections meet the threshold conditions, optional:1,2,3,5|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**alarmIdList**|String[]|Rule ID List Created|

## Response code
|Return code|Description|
|---|---|
|**200**|Create Rules|
