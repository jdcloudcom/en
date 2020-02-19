# createHistoricalReplicatTask


## Description
Create historical synchronization task

## Request Method
POST

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/historical-replicat-task/

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Bucket Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**action**|String|True| |Whether to replace|
|**bucketName**|String|True| |bucket name|
|**bucketRegion**|String|True| |bucket region|
|**targetBucketName**|String|True| |Target bucket name|
|**targetBucketRegion**|String|True| |Target bucket region|
|**storageClass**|String|True| |Storage Type|
|**prefixSet**|String[]|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createhistoricalreplicattask#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**historyReplicationTask**|[HistoryReplicationTask](createhistoricalreplicattask#historyreplicationtask)| |
### <div id="historyreplicationtask">HistoryReplicationTask</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
|**400**|Invalid parameter|
|**500**|Internal server error|
