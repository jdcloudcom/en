# describeSlowLogAttributes


## Description
Query the detailed information of slow log of MySQL instance. <br>- only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeSlowLogAttributes

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Slow Log Start Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**endTime**|String|True| |Slow Log End Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**dbName**|String|False| |Which database is queries for slow log? If it is not filled, it represents that slow logs of all databases are returned|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,1000). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**slowLogsAttributes**|SlowLogAttributes[]|Slow Log Information|
|**totalCount**|Integer|Total Record Entries|
### SlowLogAttributes
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database name, representing the database in which the SQL is executed|
|**sql**|String|SQL Statement|
|**executionTime**|String|Start time of SQL statement execution, with the format as YYYY-MM-DD hh:mm:ss|
|**elapsedTime**|Float|Duration of SQL Statement Execution, Unit: Second|
|**lockTime**|Float|Time of SQL Statement Waiting for Lock, Unit: Second|
|**rowsExamined**|Integer|Rows of SQL Statement Scanning|
|**rowsReturned**|Integer|Rows of SQL Statement Return|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
