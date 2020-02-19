# describeErrorLog


## Description
Search the summary information of error logs of PostgreSQL instance. <br>- Only Support PostgreSQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeErrorLog

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Slow Log Start Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the ecurrent time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**endTime**|String|True| |Slow Log End Time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the ecurrent time is no more than 7 days, the start time shall not be greater than the end time, and the end time shall not be greater than the current time|
|**dbName**|String|False| |Which database is queries for slow log? If it is not filled, it represents that slow logs of all databases are returned|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,1000). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeerrorlog#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorLogs**|[ErrorLogDigest[]](describeerrorlog#errorlogdigest)|Error Logs File Set|
|**totalCount**|Integer|Total Record Entries|
### <div id="errorlogdigest">ErrorLogDigest</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Execution start time of Error Logs|
|**dbName**|String|Database name, representing the database in which the SQL is executed|
|**dbNameAccount**|String|Database account, representing which account the database is under|
|**errorLogInformation**|String|Information of Error Logs|
|**errorSeverity**|String|Level of Error Logs|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeErrorLog() {
    DescribeErrorLogRequest request = new DescribeErrorLogRequest();
    request.setInstanceId("pg-x2fyuzvwak");
    request.setStartTime("2020-01-08 00:00:00");
    request.setEndTime("2020-01-08 14:00:00");
    request.setRegionId("cn-north-1");
    DescribeErrorLogResponse response = rdsClient.describeErrorLog(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaomoqw3bjbesaav55w5imbpewrwk2v", 
    "result": {
        "errorLogs": [], 
        "totalCount": 0
    }
}
```
