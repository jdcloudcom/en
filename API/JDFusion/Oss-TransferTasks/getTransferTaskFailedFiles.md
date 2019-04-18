# getTransferTaskFailedFiles


## Description
Search the file list of failed migrations according to the designated task id

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks/{id}/failed-files

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
|**task**|TransferTaskFailedDetailInfo| |
### TransferTaskFailedDetailInfo
|Name|Type|Description|
|---|---|---|
|**count**|String|Count of Error Files|
|**files**|TransferTaskFailedFileInfo[]| |
### TransferTaskFailedFileInfo
|Name|Type|Description|
|---|---|---|
|**path**|String|File Path|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Task does not exist|
