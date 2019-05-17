# querySendStatus


## Description
Get Sending Status

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v1/regions/{regionId}/querySendStatus

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**querySendStatusSpec**|QuerySendStatusSpec|True| |Get sending status request parameter|

### QuerySendStatusSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application Id|
|**taskId**|String|True| |Task Id|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|QuerySendStatus[]|Send status response parameter|
### QuerySendStatus
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Total Quantity|
|**detailList**|SendStatus[]|Send information detail list|
### SendStatus
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**appId**|String|ApplicationID|
|**taskId**|String|TaskID|
|**templateId**|String|SMSID|
|**mobileNum**|String|Mobile Phone Number|
|**stateFlag**|Integer|Sending status -1:initial status; 0:Successfully sent to gateway; 1:Successfully downloaded; 2:Sending failed; 3:Failed to send to gateway, expired and failed;4:Sent to gateway, expired and failed|
|**sendTime**|String|Sending Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
