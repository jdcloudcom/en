# describeQueryPerformance


## Description
Obtain the information of performance statistics of SQL execution, such as slow SQL, etc. based on user-defined query conditions. Based on this information, users can find and optimize performance bottlenecks related to SQL execution. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeQueryPerformance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False||The default of the number of the data displayed is 1 and the value range is [-1,1000]. When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page.|
|**pageSize**|Integer|False||The default of the number of data displayed per page is 50 and the value range is [1,100]. It can only be a multiple of 10 used for the interface to query the list.|
|**queryType**|String|True||Query type, return results of fields from high to low for different query types. <br>The following types are supported:<br>ExecutionCount: Execution times<br>LastRows: Return row number last time<br>ElapsedTime: Average execution times<br>CPUTime: Average CPU time<br>LogicalReads: Average logical reads<br>LogicalWrites: Average logical writes<br>PhysicalReads: Average physical reads<br>|
|**threshold**|Integer|False||Return only records whose query condition is larger than or equal to threshold and the default is 0|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|The Page Number of the Current Data|
|**pageSize**|Integer|The Number of Data Displayed Per Page|
|**queryPerformanceResult**|[QueryPerformanceResult[]](##QueryPerformanceResult)|The Result Set of Query Performance Statistics|
|**totalCount**|Integer|Total Number of Records|
### <a name="QueryPerformanceResult">QueryPerformanceResult</a>
|Name|Type|Description|
|---|---|---|
|**elapsedTime**|Integer|Average Execution Time in milliseconds (ms)|
|**executionCount**|Integer|Number of Executions|
|**lastExecutionTime**|String|Last execution time, format: YYYY-MM-DD hh:mm:ss|
|**lastRows**|Integer|Number of Records in Last Return|
|**logicalReads**|Integer|Average Logical Reads|
|**logicalWrites**|Integer|Average Logical Writes|
|**physicalReads**|Integer|Average Physical Reads|
|**sql**|String|sql statement|
|**workerTime**|Integer|Average CPU Usage Time in milliseconds (ms)|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
