# createTransferTask


## Description
Create Task

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks_simple

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**task**|TransferSimpleTaskInfo|False| | |

### TransferSimpleTaskInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Task Name|
|**srcAddress**|SimpleTaskAddressInfo|False| | |
|**dstAddress**|SimpleTaskAddressInfo|False| | |
### SimpleTaskAddressInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |Cloud Information ID|
|**bucket**|String|False| |Bucket of Source Address|
|**prefix**|String|False| |Prefix of Source Address cannot start with /|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|TransferTaskInfoWithID| |
### TransferTaskInfoWithID
|Name|Type|Description|
|---|---|---|
|**id**|String|Task ID|
|**name**|String|Task Name|
|**srcAddress**|TaskAddressInfo| |
|**dstAddress**|TaskAddressInfo| |
### TaskAddressInfo
|Name|Type|Description|
|---|---|---|
|**storageType**|String|Task Type: s3file, aliyunfile are supported in the source address, only s3file is supported in the target|
|**accessKey**|String|accesskey of Source Address|
|**secretKey**|String|securitykey of Source Address|
|**endpoint**|String|Endpoint of Source Address|
|**bucket**|String|Bucket of Source Address|
|**prefix**|String|Prefix of Source Address cannot start with /|
|**cloudID**|String|Cloud Information ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|Creation succeeded|
|**400**|Invalid Parameter|
