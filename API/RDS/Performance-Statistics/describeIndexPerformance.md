# describeIndexPerformance


## Description
Obtain statistics on index performance based on user-defined query conditions, and provide missing indexes and suggestions for index creation. Users can use these information to find index-related performance bottlenecks and optimize them. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/performance:describeIndexPerformance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**db**|String|False| |Multiple names of the database to be queried are separated by commas and all databases are by default.|
|**pageNumber**|Integer|False| |The default of the page number of the data displayed is 1 and the value range is [-1,1000). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page.|
|**pageSize**|Integer|False| |The default of the number of data displayed per page is 50 and the value range is [1,100]. It can only be a multiple of 10 used for the API to query the list.|
|**queryType**|String|True| |Query Type, Return Results of Fields From High to Low for Different Query Types. <br>The following types are supported:<br>Missing: Index missing<br>Size: Index size, unit KB<br>Updates: Index updates<br>Scans: Table scan times<br>Used: Least used|<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**indexPerformanceResult**|IndexPerformanceResult[]|When the queryType is Missing, the field is empty <br>when the queryType is other values, return IndexPerformanceResult|
|**missingIndexResult**|MissingIndexResult[]|When queryType is Missing, the result set is MissingIndexResult<br>when queryType is other values, the field is null.|
|**pageNumber**|Integer|The Page Number of the Current Data|
|**pageSize**|Integer|The Number of Data Displayed Per Page|
|**totalCount**|Integer|Total Number of Records|
### IndexPerformanceResult
|Name|Type|Description|
|---|---|---|
|**db**|String|Database Name|
|**index**|String|Index Name|
|**lastUserScan**|String|The most recent table scan time, format: YYYY-MM-DD hh:mm:ss|
|**lastUserSeek**|String|Last index search time, format YYYY-MM-DD hh:mm:ss|
|**lastUserUpdate**|String|The most recent index update time, format: YYYY-MM-DD hh:mm:ss|
|**sizeKB**|Integer|Index Size, Unit: KB|
|**table**|String|Table Name|
|**userScans**|Integer|Cumulative number of table scans since the server was started|
|**userSeeks**|Integer|Cumulative index search times since the server was started|
|**userUpdates**|Integer|Cumulative number of index updates since the server was started|
### MissingIndexResult
|Name|Type|Description|
|---|---|---|
|**avgUserImpact**|Number|The average percentage gain that the user may get during query after implementing this missing index. This value indicates that if this missing index is implemented, the query cost will decrease by this percentage on average.|
|**db**|String|Database Name|
|**equalityColumns**|String|A comma-separated list of columns that make up the equality predicate. The form of the predicate is as follows: <br>table.column =constant_value|
|**includedColumns**|String|A comma-separated list of columns that make up the unequal predicate. The predicate may take the following form:<br>table.column > constant_value<br> Any comparison operator other than '=' indicates they are unequal.|
|**inequalityColumns**|String|A comma-separated list of the covered columns for the query, i.e., the fields following Include in the SQL statement that created the index|
|**table**|String|Table Name|
|**userScans**|Integer|Number of scans caused by the query of a user that might have used the suggested index in the group.|
|**userSeeks**|Integer|The number of searches caused by a user query that might have used the suggested index in the group.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
