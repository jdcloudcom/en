# addCustomLiveStreamWatermarkTemplate


## Description
Add user customized watermark template


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/watermarkCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**offsetX**|Integer|True| |x Axis Offset<br>- Unit: Pixel<br>|
|**offsetY**|Integer|True| |y Axis Offset:<br>- Uni: Pixel<br>|
|**width**|Integer|True| |Watermark Width:<br>- Value: [0,1920]<br>- Unit: Pixel<br>|
|**height**|Integer|True| |Watermark Height:<br>- Value: [0,1920]<br>- Unit: Pixel<br>|
|**template**|String|True| |Customized Watermark Template Name<br>-&ensp; Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"), <br>&ensp;&ensp; no special character of ("-") is allowed at both ends,<br>&ensp;&ensp; the length cannot exceed 50 characters, utf-8 format<br>-&ensp;<b>Note: No duplication to defined names</b><br>|
|**url**|String|True| |Watermark Address<br>-&ensp; Start with &ensp;http://, which is a publicly accessible address<br>|


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

## Request Example
POST
```
https://live.jdcloud-api.com/v1/watermarkCustoms:template

```
```
{
    "height": 30, 
    "offsetX": 10, 
    "offsetY": 20, 
    "template": "yourwatermark", 
    "url": "http://xxx.com/xxx.jpg", 
    "width": 50
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
