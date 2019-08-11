# describeOperationRecords


## Description
Search operation log

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/operationRecords


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|
|**startTime**|String|True| |Start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |End time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**action**|Integer|False| |Operation type, search all types by default.<br>- 0: All<br>- 1: Package change<br>- 2: Protection rule change<br>- 3: Protection object change<br>- 4: IP Address change<br>- 5: Protection package name change|
|**name**|String|False| |Protection package name, supporting fuzzy match|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|OperationRecord[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Instance Counts|
|**totalPage**|Integer|Total Number of Pages|
### OperationRecord
|Name|Type|Description|
|---|---|---|
|**time**|String|Operation Time|
|**name**|String|Name of Protection Package|
|**action**|Integer|Operation type.<br>- 1: Package change<br>- 2: Protection rule change<br>- 3: Protection object change<br>- 4: IP Address change<br>- 5: Protection package name change|
|**info**|String|Operation Details|
|**operator**|String|Operator|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
