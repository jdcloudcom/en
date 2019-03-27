# addCustomLiveStreamWatermarkTemplate


## Description
Add live watermark template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/watermarkCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**height**|Integer|True| |Height|
|**offsetX**|Integer|True| |x Axis Offset  Unit: Pixel|
|**offsetY**|Integer|True| |y Axis Offset  Unit: Pixel|
|**template**|String|True| |Record Template Customized Name|
|**url**|String|True| |Height|
|**width**|Integer|True| |Width|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
