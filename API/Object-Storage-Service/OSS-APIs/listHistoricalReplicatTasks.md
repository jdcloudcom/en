# listHistoricalReplicatTasks


## Description
Obtain the synchronization task list under the bucket according to bucket name

## Request Method
GET

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/historical-replicat-task/

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Bucket Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**marker**|String|False| |Initial key of the synchronization task list|
|**limit**|Integer|False| |The results returned per search is 1,000 by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](listhistoricalreplicattasks#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**listResult**|[ListResult](listhistoricalreplicattasks#listresult)| |
### <div id="listresult">ListResult</div>
|Name|Type|Description|
|---|---|---|
|**historyReplicationTaskInfoList**|[HistoryReplicationTaskInfo[]](listhistoricalreplicattasks#historyreplicationtaskinfo)| |
|**nextMarker**|String|The object to be searched the next time|
### <div id="historyreplicationtaskinfo">HistoryReplicationTaskInfo</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|Long| |
|**action**|String|Whether to replace|
|**bucketName**|String|bucket name|
|**bucketRegion**|String|bucket region|
|**targetBucketName**|String|Object bucket name|
|**targetBucketRegion**|String|Object bucket region|
|**storageClass**|String|Storage Type|
|**prefixSet**|String[]| |
|**createdTime**|String|Task Creation Time|
|**progress**|Double|Task progress|
|**status**|String|Task Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
