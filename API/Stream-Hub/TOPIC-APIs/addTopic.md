# addTopic


## Description
When creating topic, only the topic parameter in the topicModel needs to be transmitted, and the other two parameters can be blank

## Request method
POST

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topic

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**topicModel**|TopicModel|True| |Example: {"topicModel":{"topic":{"archived":0,"id":"","name":"create","remark":"Note","shardNum":1,"partitionNum":2,"lifecycle":3}}}|

### TopicModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**parameterList**|Object[]|False| |For archiving-related specific parameters, the archive needs to be created, updated and deleted, and the corresponding parameter values shall be modified. <br> The four parameter values, ossFlag, bucketName, directory and objectName, are related to ossFlag. If ossFlag is false, the latter three can be blank; if it is true, the last three are the abnormal data storage locations, just fill in as needed. <br> 1) If it needs to be archived to the Data Compute, it needs to be transmitted to database, table, type, example, delimiter, targetColumn, analysisColumn, partsTargetColumn and partsAnalysisColumn. <br> 2) If it needs to be archived to JFS, it needs to be transmitted to bucket, prefix, and infix. <br>3) If it needs to be archived to JCS for Elasticsearch, it needs to be transmitted to host, port, indexType, idType, indexName, indexReferField, timestampFieldFormat, timestampIndexFormat, typeName, idReferField, noResolve, username and password. <br> 4) If it needs to be archived to mysql, it needs to be transmitted to host, database, table, username, password, type, example and delimiter. <br>5) If it needs to be archived to JD Cloud database, it needs to be transmitted to rdsId, database, table, username, password, type, example and delimiter. |
|**target**|Target|False| | |
|**topic**|Topic|False| | |
### Target
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cycle**|Integer|False| |Time Period of Performing Archiving Task|
|**name**|String|False| |Destination of Archiving|
|**recordSize**|Integer|False| |It starts to archive when achieving the data bulk|
### Topic
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**archived**|Integer|False| |Whether to archive or not (0: not archived, 1: archived)|
|**id**|Integer|False| |Subject ID|
|**lifecycle**|Integer|False| |Reserve Time After Writing Data|
|**name**|String|False| |Topic Name in the Stream Hub|
|**partitionNum**|Integer|False| |Partition|
|**remark**|String|False| |Note|
|**shardNum**|Integer|False| |Shard Number in the Stream Hub|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String|Status Information|
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|ERROR|
