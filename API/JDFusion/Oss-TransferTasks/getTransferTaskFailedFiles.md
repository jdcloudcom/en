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
|**bucket**|TransferTaskFailedDetailInfo| |
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
