# describeSlowLogs


## Description
Query the summary information of slow log of MySQL instance. <br>- only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeSlowLogs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Slow Log Start Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the current time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**endTime**|String|True| |Slow Log End Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the current time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**dbName**|String|False| |Which database is queries for slow log? If it is not filled, it represents that slow logs of all databases are returned|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,1000). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeslowlogs#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**slowLogs**|[SlowLogDigest[]](describeslowlogs#slowlogdigest)|Slow Log Information|
|**totalCount**|Integer|Total Record Entries|
### <div id="slowlogdigest">SlowLogDigest</div>
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database name, representing the database in which the SQL is executed|
|**sql**|String|SQL Statement|
|**executionTime**|String|Start time of SQL statement execution, with the format as YYYY-MM-DD hh:mm:ss|
|**executionCount**|Integer|Execution of SQL Statement|
|**elapsedTime**|[DigestData](describeslowlogs#digestdata)|Duration of SQL statement execution, unit: second|
|**lockTime**|[DigestData](describeslowlogs#digestdata)|Time of SQL statement waiting for lock, unit: second|
|**sqlLength**|[DigestData](describeslowlogs#digestdata)|Length of SQL statement|
|**rowsExamined**|[DigestData](describeslowlogs#digestdata)|Rows of SQL statement scanning|
|**rowsReturned**|[DigestData](describeslowlogs#digestdata)|Rows of SQL statement return|
### <div id="digestdata">DigestData</div>
|Name|Type|Description|
|---|---|---|
|**pct95**|Float|Represent that 95% data in the execution results lower than or equal to the value|
|**max**|Float|Maximum of Execution Results|
|**avg**|Float|Average of Execution Results|
|**min**|Float|Minimum of Execution Results|
|**total**|Double|Total of Execution Results|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeSlowLogs() {
    DescribeSlowLogsRequest request = new DescribeSlowLogsRequest();
    request.setRegionId("cn-north-1");
    request.setPageNumber(1);
    request.setPageSize(20);
    request.setStartTime("2020-01-08 00:00:00");
    request.setEndTime("2020-01-08 14:00:00");
    request.setInstanceId("mysql-k67q8n46si");
    DescribeSlowLogsResponse response = rdsClient.describeSlowLogs(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaojtjd19rwgeruauestqgwwfm9imwv", 
    "result": {
        "slowLogs": [], 
        "totalCount": 0
    }
}
```
