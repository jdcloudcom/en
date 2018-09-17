# updateTopic


## 描述
The API can be used to update subjects, create archives, modify archives, delete archives; different functions can be realized by transmitting different parameters. To modify the archives, only the parameters of the corresponding archives need to be modified; to delete the archives, only the archive parameters need to be set as blank

## 请求方式
PUT

## 请求地址
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topic

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**topicModel**|[TopicModel](##TopicModel)|True||When updating the subject, only the attributes in the topic in the topicModel need to be modified; to create archives, the target and the parameters of archiving destination (mysql, JD Cloud Elasticsearch, Object Storage Service and Data Computing Service) need to be assigned.|

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
