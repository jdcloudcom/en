# addCustomLiveStreamWatermarkTemplate


## Description
Add live watermark template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/watermarkCustoms:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**offsetX**|Integer|True|x Axis Offset:<br>  - Unit: Pixel<br>|
|**offsetY**|Integer|True|y Axis Offset:<br>  - Unit: Pixel<br>|
|**width**|Integer|True|Watermark Width:<br>  - Value: [0,1920]<br>|
|**height**|Integer|True|Watermark Height:<br>  - Value: [0,1920]<br>|
|**template**|String|True|Watermark Template Customized Name:<br>  - Value Requirements: For numbers, uppercase and lowercase letters, or hyphens ("-”),<br>              no special characters are allowed at the beginning and end("-")<br>  - <b>Note: It cannot be repeated with the defined template name</b><br>|
|**url**|String|True|Watermark Address:<br>  - Start with http, accessible address<br>|


## Examples
    {
        "offsetX": "jpg",
        "offsetY": "jpg",
        "width": 1080,
        "height": 720,
        "template":"test-live-video",
        "url":"http://amf.jdcloud.com"
    }
    

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
