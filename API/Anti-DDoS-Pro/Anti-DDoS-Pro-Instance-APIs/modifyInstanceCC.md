# modifyInstanceCC


## Description
Set the instance CC defense

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCC

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cCSpec**|CCSpec|True| |cc Parameter|

### CCSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ccProtectMode**|Integer|False| |cc Defense Mode, 0->normal  1->relaxed  2->critical  3->customized|
|**ccThreshold**|Long|False| |cc Threshold|
|**hostQps**|Long|False| |When ccProtectMode is a customized mode, specify the protection threshold of each Host|
|**hostUrlQps**|Long|False| |When ccProtectMode is a customized mode, specify the protection threshold of each Host+URI|
|**ipHostQps**|Long|False| |When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host|
|**ipHostUrlQps**|Long|False| |When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host+URI|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Setting failed, 1: Setting succeeded|
|**message**|String|Please specify reasons for setting failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
