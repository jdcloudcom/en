# describeSlowLogs


## Description
Query the summary information of slow log of MySQL instance. <br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeSlowLogs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Which database is queries for slow log? If it is not filled, it represents that slow logs of all databases are returned|
|**endTime**|String|True| |Slow log end time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than 30 days, and the end time shall be no more than the current time|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,1000). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|
|**startTime**|String|True| |Slow log start time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than 30 days, and the end time shall be no more than the current time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**slowLogs**|SlowLogDigest[]|Slow Log Information|
|**totalCount**|Integer|Total Record Entries|
### SlowLogDigest
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database name, representing the database in which the SQL is executed|
|**elapsedTime**|DigestData|Duration of SQL Statement Execution, Unit: Second|
|**executionCount**|Integer|Execution of SQL Statement|
|**executionTime**|String|Start time of SQL statement execution, with the format as YYYY-MM-DD hh:mm:ss|
|**lockTime**|DigestData|Time of SQL Statement Waiting for Lock, Unit: Second|
|**rowsExamined**|DigestData|Rows of SQL Statement Scanning|
|**rowsReturned**|DigestData|Rows of SQL Statement Return|
|**sql**|String|SQL Statement|
|**sqlLength**|DigestData|Length of SQL Statement|
### DigestData
|Name|Type|Description|
|---|---|---|
|**avg**|Float|Average of Execution Results|
|**max**|Float|Maximum of Execution Results|
|**min**|Float|Minimum of Execution Results|
|**pct95**|Float|Represent that 95% data in the execution results lower than or equal to the value|
|**total**|Double|Total of Execution Results|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
