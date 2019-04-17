# createTransferTask


## Description
Create Task

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**task**|TransferTaskInfo|False| | |
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|

### TransferTaskInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dstAddress**|TaskAddressInfo|False| | |
|**name**|String|False| |Task Name|
|**srcAddress**|TaskAddressInfo|False| | |
### TaskAddressInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accessKey**|String|False| |accesskey of Source Address|
|**bucket**|String|False| |Bucket of Source Address|
|**endpoint**|String|False| |Endpoint of Source Address|
|**prefix**|String|False| |Prefix of Source Address cannot start with /|
|**secretKey**|String|False| |securitykey of Source Address|
|**storageType**|String|False| |Task Type: s3file, aliyunfile are supported in the source address, only s3file is supported in the target|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|TransferTaskInfoWithID| |
### TransferTaskInfoWithID
|Name|Type|Description|
|---|---|---|
|**dstAddress**|TaskAddressInfo| |
|**id**|String|Task ID|
|**name**|String|Task Name|
|**srcAddress**|TaskAddressInfo| |
### TaskAddressInfo
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|accesskey of Source Address|
|**bucket**|String|Bucket of Source Address|
|**endpoint**|String|Endpoint of Source Address|
|**prefix**|String|Prefix of Source Address cannot start with /|
|**secretKey**|String|securitykey of Source Address|
|**storageType**|String|Task Type: s3file, aliyunfile are supported in the source address, only s3file is supported in the target|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid Parameter|
|**201**|Creation succeeded|
