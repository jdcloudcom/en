# abortHistoricalReplicatTask


## Description
Abort bucket name to obtain the synchronization task under the bucket

## Request Method
POST

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/historical-replicat-task/{taskId}/abort

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
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
