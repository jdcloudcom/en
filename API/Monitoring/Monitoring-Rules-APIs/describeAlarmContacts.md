# describeAlarmContacts


## Description
Query rule alarm contacts

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}/contacts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rulesid|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range [1, 100]|
|**referenceType**|Long|False| |Contact type. 0, contact grouping; 1, contact|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**contactsList**|DescribedNoticeContacts[]|List of alarm contacts|
|**total**|Long|Total number of alarm contacts|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact grouping id, 1 - contact id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query alarm contacts|
