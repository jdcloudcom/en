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
|**template**|String|True| |Transcoding Template<br>- Value Range: System Standard Transcoding Templates, User Customized Transcoding Template<br>- System Standard Transcoding Templates<br>  ld (h.264/640 * 360/15f)<br>  sd (h.264/854 * 480/24f)<br>  hd (h.264/1280 * 720/25f)<br>  shd (h.264/1920 * 1080/30f)<br>|


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
