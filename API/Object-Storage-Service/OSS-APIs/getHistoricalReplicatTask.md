# getHistoricalReplicatTask


## Description
Obtain the synchronization task under the bucket according to bucket name

## Request Method
GET

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/historical-replicat-task/{taskId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Task ID|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Bucket Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](gethistoricalreplicattask#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**historyReplicationTaskInfo**|[HistoryReplicationTaskInfo](gethistoricalreplicattask#historyreplicationtaskinfo)| |
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
