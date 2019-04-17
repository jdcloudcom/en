# editTransferTask


## Description
Modify tasks according to the designated ID

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Task ID|
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


## Return Code
|Return Code|Description|
|---|---|
|**200**|Modified|
|**400**|Invalid Parameter|
|**404**|Task does not exist|
|**409**|The task is in conflict, and the task is running|
