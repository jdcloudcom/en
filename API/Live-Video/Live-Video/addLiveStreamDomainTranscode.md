# addLiveStreamDomainTranscode


## Description
Add transcoding configuration at domain level
- Add transcoding template configuration at domain level


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeDomains:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Live Pushing Streaming Domain|
|**template**|String|True| |Transcode Template<br>- Value Range: System Standard Transcode Template, User Customized Transcode Template<br>  ld (h.264/640 * 360/15f)<br>  sd (h.264/960 * 540/25f)<br>  hd (h.264/1280 * 720/25f)<br>  shd (h.264/1920 * 1080/30f)<br>  ld-265 (h.265/640 * 360/15f)<br>  sd-265 (h.265/960 * 540/25f)<br>  hd-265 (h.265/1280 * 720/25f)<br>  shd-265 (h.265/1920 * 1080/30f)<br>|


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
https://live.jdcloud-api.com/v1/transcodeDomains:config

```
```
{
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
