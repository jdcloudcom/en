# describeAlarmContacts


## Description
Query rule alarm contacts

## Request Method
GET

## Request Address
https://monitor.jcloud.com/v1/regions/:regionId/alarms/:alarmId/contacts


## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Current page, 1 by default|
|**pageSize**|Integer|False| |Page size, 20 by default; value range [1, 100]|
|**referenceType**|Integer|False| |Contact type. 0, contact grouping; 1, contact|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**contactsList**|DescribedNoticeContacts[]|List of alarm contacts|
|**total**|Integer|Total number of alarm contacts|
### DescribedNoticeContacts
|Name|Type|Description|
|---|---|---|
|**referenceId**|Integer|Contact ID|
|**referenceType**|Integer|Contact type. 0 - contact grouping id, 1 - contact id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query alarm contacts|
