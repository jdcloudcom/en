# modifyInstanceCC


## Description
Set the instance CC defense

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCC

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cCSpec**|CCSpec|True| |cc Parameter|

### CCSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ccProtectMode**|Integer|False| |cc Defense Mode, 0->normal  1->relaxed  2->critical  3->customized|
|**ccThreshold**|Integer|False| |CC Threshold|
|**hostQps**|Integer|False| |When ccProtectMode is a customized mode, specify the protection threshold of each Host|
|**hostUrlQps**|Integer|False| |When ccProtectMode is a customized mode, specify the protection threshold of each Host+URI|
|**ipHostQps**|Integer|False| |When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host|
|**ipHostUrlQps**|Integer|False| |When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host+URI|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
