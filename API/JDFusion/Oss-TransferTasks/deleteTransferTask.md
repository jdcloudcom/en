# deleteTransferTask


## Description
Delete tasks according to the designated ID

## Request Method
DELETE

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Task ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|Deleted|
|**404**|Task does not exist|
|**409**|The task is in conflict, and the program has been started. Please stop the ask and delete it|
