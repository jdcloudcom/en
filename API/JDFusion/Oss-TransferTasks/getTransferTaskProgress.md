# getTransferTaskProgress


## Description
Search the migration progress according to the designated id

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks/{id}/progress

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Task ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|TransferTaskProgressInfo| |
### TransferTaskProgressInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Task ID|
|**status**|String|Running Status|
|**timeStart**|String|Start Time|
|**succeedFileCount**|String|Count of Files Succeeded in Migration|
|**failedFileCount**|String|Count of Files Failed in Migration|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Task does not exist|
