# querySendStatus


## Description
Get Sending Status

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v2/regions/{regionId}/querySendStatus

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application ID|
|**sequenceNumber**|String|True| |SN|
|**phone**|String|False| |Mobile Phone Number|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|QuerySendStatus[]|Send status response parameter|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
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
|**sequenceNumber**|String|Task SN|
|**templateId**|String|SMSID|
|**mobileNum**|String|Mobile Phone Number|
|**stateFlag**|Integer|Sending status -1:initial status; 0:Successfully sent to gateway; 1:Successfully downloaded; 2:Sending failed; 3:Failed to send to gateway, expired and failed;4:Sent to gateway, expired and failed|
|**sendTime**|String|Sending Time yyyy-MM-dd HH:mm:ss|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
