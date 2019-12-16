# describeActiveQueryPerformance


## Description
Obtain performance information about a running SQL execution according to search conditions defined by the user. The user can search performance necks related to SQL execution based on such information and make the optimization. <br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeActiveQueryPerformance

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**db**|String|False| |Separate the database names to be searched with the English comma. All databases are deemed as the default values.|
|**threshold**|Integer|False| |The return execution time is greater than or equal to threshold records, with the value 10 by default and the unit of second|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,1000). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |50 data entries can be displayed on each page by default, with the value range: [1,100]. The displayed entries shall be a multiple of 10 only.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeActiveQueryPerformance#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**activeQueryPerformanceResult**|[ActiveQueryPerformanceResult[]](describeActiveQueryPerformance#ActiveQueryPerformanceResult)|Search Performance Statistics Result Set|
|**totalCount**|Integer|Total Record Entries|
|**pageNumber**|Integer|Page of Current Data|
|**pageSize**|Integer|Data Entries Displayed per Page|
### <a name="ActiveQueryPerformanceResult">ActiveQueryPerformanceResult</a>
|Name|Type|Description|
|---|---|---|
|**sql**|String|sql Sentence|
|**startTime**|String|The execution start time is in the format of YYYY-MM-DD hh:mm:ss|
|**elapsedTime**|Integer|Execution Duration, in second|
|**db**|String|Database Name|
|**sessionId**|String|Session ID During Execution of the SQL|
|**user**|String|User Name when Executing the SQL|
|**status**|String|SExecution State of QL|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
