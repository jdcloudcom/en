# addTopic


## 描述
When creating topic, only the topic parameter in the topicModel needs to be transmitted, and the other two parameters can be blank

## 请求方式
POST

## 请求地址
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topic

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**topicModel**|[TopicModel](##TopicModel)|True||Example: {"topicModel":{"topic":{"archived":0,"id":"","name":"create","remark":"note","shardNum":1,"partitionNum":2,"lifecycle":3}}}<br>|

### <a name="TopicModel">TopicModel</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**parameterList**|Object[]|False||For archiving-related specific parameters, the archive needs to be created, updated and deleted, and the corresponding parameter values shall be modified. <br> The four parameter values, ossFlag, bucketName, directory and objectName, are related to ossFlag. If ossFlag is false, the latter three can be blank; if it is true, the last three are the abnormal data storage locations, just fill in as needed. <br> 1) If it needs to be archived to the data computing service, it needs to be transmitted to database, table, type, example, delimiter, targetColumn, analysisColumn, partsTargetColumn and partsAnalysisColumn. <br> 2) If it needs to be archived to JFS, it needs to be transmitted to bucket, prefix, and infix. <br>3) If it needs to be archived to JD Cloud Elasticsearch, it needs to be transmitted to host, port, indexType, idType, indexName, indexReferField, timestampFieldFormat, timestampIndexFormat, typeName, idReferField, noResolve, username and password. <br> 4) If it needs to be archived to mysql, it needs to be transmitted to host, database, table, username, password, type, example and delimiter. <br>5) If it needs to be archived to JD Cloud database, it needs to be transmitted to rdsId, database, table, username, password, type, example and delimiter. |
|**target**|[Target](##Target)|False|||
|**topic**|[Topic](##Topic)|False|||
### <a name="Target">Target</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cycle**|Integer|False||Time period of performing archiving task|
|**name**|String|False||Destination of archiving|
|**recordSize**|Integer|False||It starts to archive when achieving the data bulk|
### <a name="Topic">Topic</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**archived**|Integer|False||Whether to archive or not (0: not archived, 1: archived)|
|**id**|Integer|False||Subject id|
|**lifecycle**|Integer|False||Reserve time after writing data|
|**name**|String|False||topic name in the streaming data bus|
|**partitionNum**|Integer|False||Partition|
|**remark**|String|False||Note|
|**shardNum**|Integer|False||shard number in the streaming data bus|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String|Status information|
|**status**|Boolean||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|ERROR|
