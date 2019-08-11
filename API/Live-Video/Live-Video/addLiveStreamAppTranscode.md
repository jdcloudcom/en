# addLiveStreamAppTranscode


## Description
Add application transcoding configuration
- Add transcoding template configuration at application level


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeApps:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**template**|String|True| |Transcode Template (Transcode stream output suffix)<br>- Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"), it must begin and end with a number or letter, the length cannot exceed 50 characters<br>- <b>Note: It cannot duplicate the standard transcode template of system and the current user customized naming</b><br>- System Standard Transcode Templates<br>  ld (h.264/640 * 360/15f)<br> sd (h.264/854 * 480/25f)<br> hd (h.264/1280 * 720/25f)<br> shd (h.264/1920 * 1080/30f)<br> 2k (h.264/2560 * 1440/30f)<br> 4k (h.264/3840 * 2160/30f)<br> ld-265 (h.265/640 * 360/15f)<br> sd-265 (h.265/854 * 480/25f)<br> hd-265 (h.265/1280 * 720/25f)<br> shd-265 (h.265/1920 * 1080/30f)<br> 2k-265 (h.265/2560 * 1440/30f)<br> 4k-265 (h.265/3840 * 2160/30f)<br>|


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
https://live.jdcloud-api.com/v1/transcodeApps:config
```

```
{
    "appName": "yourapp", 
    "publishDomain": "push.yourdomain.com", 
    "template": "shd"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
