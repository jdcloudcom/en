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
|**position**|Integer|False| |Watermark Location<br>- Value Range: Top Left: 1, Top Right: 3, Bottom Left: 7, Bottom Right: 9, Default: 1<br>|
|**offsetUnit**|String|False| |Offset Unit <br>- Value:percent,pixel<br>- percent: by percent; pixel: pixel by default:pixel<br>|
|**offsetX**|Integer|True| |x Axis Offset<br>- Value range<br>  percent: (0,100]<br>  pixel: (0,1920]<br>|
|**offsetY**|Integer|True| |y Axis Offset<br>- Value range<br>  percent: (0,100]<br>  pixel: (0,1920]<br>|
|**sizeUnit**|String|False| |Watermark Size Unit <br>- Value:percent,pixel<br>- percent: by percent; pixel: pixel by default:pixel<br>|
|**width**|Integer|True| |Watermark Width:<br>- Value Range<br>  percent: (0,100]<br>  pixel: (0,1920]<br>|
|**height**|Integer|True| |Watermark Height:<br>- Value Range<br>  percent: (0,100]<br>  pixel: (0,1920]<br>|
|**template**|String|True| |Customized Watermark Template Name<br>-&ensp; Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"), underline ("_"),<br>&ensp;&ensp; no special character of ("-") is allowed at both ends,<br>&ensp;&ensp; the length cannot exceed 50 characters, utf-8 format<br>-&ensp;<b>Note: No duplication to defined names</b><br>|
|**uploadId**|String|False| |For the returned uploadId parameter when creating the upload task, uploadId is compulsory when uploading the watermark image through API<br>|
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
    "offsetUnit": "pixel", 
    "offsetX": 10, 
    "offsetY": 20, 
    "sizeUnit": "pixel", 
    "template": "yourwatermark", 
    "uploadId": "response uploadId from createImageUploadTask api", 
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
