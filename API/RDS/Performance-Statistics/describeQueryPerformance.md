# describeQueryPerformance


## 描述
Obtain the information of performance statistics of SQL execution, such as slow SQL, etc. based on user-defined query conditions. Based on this information, users can find and optimize performance bottlenecks related to SQL execution. <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeQueryPerformance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|False||The default of the number of the data displayed is 1 and the value range is [-1,1000]. When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page.|
|**pageSize**|Integer|False||The default of the number of data displayed per page is 50 and the value range is [1,100]. It can only be a multiple of 10 used for the interface to query the list.|
|**queryType**|String|True||查询类型，不同的查询类型按照相应的字段从高到低返回结果。<br>支持如下类型：<br>ExecutionCount：执行次数<br>LastRows：上次返回行数<br>ElapsedTime：平均执行时间<br>CPUTime：平均CPU时间<br>LogicalReads：平均逻辑读<br>LogicalWrites：平均逻辑写<br>PhysicalReads：平均物理读<br>|
|**threshold**|Integer|False||Return only records whose query condition is larger than or equal to threshold and the default is 0|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|The Page Number of the Current Data|
|**pageSize**|Integer|The Number of Data Displayed Per Page|
|**queryPerformanceResult**|[QueryPerformanceResult[]](##QueryPerformanceResult)|The Result Set of Query Performance Statistics|
|**totalCount**|Integer|Total Number of Records|
### <a name="QueryPerformanceResult">QueryPerformanceResult</a>
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
