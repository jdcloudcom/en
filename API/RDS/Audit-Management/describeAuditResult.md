# describeAuditResult


## Description
Only support check of audit content of MySQL instance

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditResult

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accountName**|String|False| |Account Name|
|**dbName**|String|False| |Database Name|
|**endTime**|String|True| |Search the end time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time cannot exceed 3 days|
|**pageNumber**|Integer|False| |Page displaying the data; it is 1 by default, the value range: [-1,∞)|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with the value range: 10, 20, 50|
|**startTime**|String|True| |Search the start time, with the format as: YYYY-MM-DD HH:mm:ss, the start time cannot be 30 days earlier than the current time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**auditResult**|AuditResult[]| |
|**totalCount**|Integer| |
### AuditResult
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name|
|**dbName**|String|Database Name|
|**ip**|String|Source IP|
|**operation**|String|Operation Types|
|**sql**|String|sql Sentence|
|**startTime**|String|SQL Execution Time|
|**threadId**|String|Thread ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
