# describeTopic


## Description
Query the assigned subject, the archiving information will be returned if it has been archived

## Request method
GET

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topic

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**topic**|[TopicModel](##TopicModel)||
### <a name="TopicModel">TopicModel</a>
|Name|Type|Description|
|---|---|---|
|**parameterList**|Object[]|For archiving-related specific parameters, the archive needs to be created, updated and deleted, and the corresponding parameter values shall be modified. <br> The four parameter values, ossFlag, bucketName, directory and objectName, are related to ossFlag. If ossFlag is false, the latter three can be blank; if it is true, the last three are the abnormal data storage locations, just fill in as needed. <br> 1) If it needs to be archived to the data computing service, it needs to be transmitted to database, table, type, example, delimiter, targetColumn, analysisColumn, partsTargetColumn and partsAnalysisColumn. <br> 2) If it needs to be archived to JFS, it needs to be transmitted to bucket, prefix, and infix. <br>3) If it needs to be archived to JD Cloud Elasticsearch, it needs to be transmitted to host, port, indexType, idType, indexName, indexReferField, timestampFieldFormat, timestampIndexFormat, typeName, idReferField, noResolve, username and password. <br> 4) If it needs to be archived to mysql, it needs to be transmitted to host, database, table, username, password, type, example and delimiter. <br>5) If it needs to be archived to JD Cloud database, it needs to be transmitted to rdsId, database, table, username, password, type, example and delimiter. |
|**target**|[Target](##Target)||
|**topic**|[Topic](##Topic)||
### <a name="Target">Target</a>
|Name|Type|Description|
|---|---|---|
|**cycle**|Integer|Time period of performing archiving task|
|**name**|String|Destination of archiving|
|**recordSize**|Integer|It starts to archive when achieving the data bulk|
### <a name="Topic">Topic</a>
|Name|Type|Description|
|---|---|---|
|**archived**|Integer|Whether to archive or not (0: not archived, 1: archived)|
|**id**|Integer|Subject id|
|**lifecycle**|Integer|Reserve time after writing data|
|**name**|String|topic name in the streaming data bus|
|**partitionNum**|Integer|Partition|
|**remark**|String|Note|
|**shardNum**|Integer|shard number in the streaming data bus|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT FOUND|
