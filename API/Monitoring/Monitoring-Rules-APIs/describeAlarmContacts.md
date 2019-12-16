# describeAlarmContacts


## Description
Query rule alarm contacts

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms/{alarmId}/contacts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmId**|String|True| |Rule ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Page; 1 by default, the value range: [1,∞)|
|**pageSize**|Long|False| |Paging Size; 20 by default. Value Range: [10, 100]|
|**referenceType**|Long|False| |Contact type. 0, contact grouping; 1, contact|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**contactsList**|DescribedNoticeContacts[]|List of alarm contacts|
|**total**|Long|Total number of alarm contacts|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Long|Contact ID|
|**referenceType**|Long|Contact type. 0 - contact group id, 1 - contact id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search rule contact  |   


