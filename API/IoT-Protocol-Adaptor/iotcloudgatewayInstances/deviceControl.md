# deviceControl


## Description
Distribute device control instruction

## Request Method
POST

## Request Address
https://iotcloudgateway.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:deviceControl

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |regionId|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**devicecmd**|DeviceControlSpec|True| |iotcloudgateway instance distributes device control instruction|

### DeviceControlSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**request_id**|String|True| |Request ID|
|**peers**|String|True| |Device List|
|**br_msg**|String|True| |Device Instruction String base64|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
