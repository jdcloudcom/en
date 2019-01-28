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
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|TransferTaskProgressInfo| |
### TransferTaskProgressInfo
|Name|Type|Description|
|---|---|---|
|**failedFileCount**|String|Count of Files Failed in Migration|
|**id**|String|Task ID|
|**status**|String|Running Status|
|**succeedFileCount**|String|Count of Files Succeeded in Migration|
|**timeStart**|String|Start Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Task does not exist|
