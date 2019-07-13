# addCustomLiveStreamTranscodeTemplate


## Description
Add customized transcoding template
- The system has preset the standard transcoding templates. If they cannot meet your requirements of transcoding, you can add your customized transcoding templates through the interface
- System Standard Transcoding Templates<br>
    ld (h.264/640 * 360/15f)<br>
    sd (h.264/960 * 540/25f)<br>
    hd (h.264/1280 * 720/25f)<br>
    shd (h.264/1920 * 1080/30f)<br>
    ld-265 (h.265/640 * 360/15f)<br>
    sd-265 (h.265/960 * 540/25f)<br>
    hd-265 (h.265/1280 * 720/25f)<br>
    shd-265 (h.265/1920 * 1080/30f)<br>



## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoCodec**|String|False| |Video Encoding Format, value: h264, h265, h264<br> by default|
|**videoCodeRate**|Integer|True| |Transcode Rate of Transcoding Output<br>- Value Range: [1,6000]<br>- Unit: kpbs<br>|
|**videoFrameRate**|String|True| |Frame Rate of Transcode Output<br>- Value: [1,30]<br>|
|**width**|Integer|False| |Video Width of Transcoding Output<br>- Value: [128,1920]<br>- If only one of (width, height) is set, then zoom the output transcode of another item equally according to the set parameter item<br>- if none of (width, height) is set, then output the transcode according to the source stream size<br>|
|**height**|Integer|False| |Video Width of Transcoding Output<br>- Value: [128,1920]<br>- If only one of (width, height) is set, then zoom the output transcode of another item equally according to the set parameter item<br>- if none of (width, height) is set, then output the transcode according to the source stream size<br>|
|**template**|String|True| |Transcode Template (Transcode Stream Output Suffix)<br>- Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"), both ends must be a number or a letter, the length cannot exceed 50 characters<br>- <b>Note: It cannot duplicate the standard transcode template of system and the current user customized naming</b><br>- System Standard Transcode Templates<br>  ld (h.264/640 * 360/15f)<br>  sd (h.264/960 * 540/25f)<br>  hd (h.264/1280 * 720/25f)<br>  shd (h.264/1920 * 1080/30f)<br>  ld-265 (h-265/640 * 360/15f)<br>  sd-265 (h-265/960 * 540/25f)<br>  hd-265 (h-265/1280 * 720/25f)<br>  shd-265 (h-265/1920 * 1080/30f)<br>|
|**audioCodec**|String|True| |Audio Coding Format of Transcoding Output<br>- Value: aac, mp3<br>- Case Insensitive<br>|
|**audioFormat**|String|True| |Audio Format of Transcoding Output<br>- Value: aac_lc, aac_low, aac_he, aac_he_v2<br>- Case Insensitive<br>|
|**audioSampleRate**|Integer|True| |Audio Sampling Rate of Transcoding Output<br>- Value: [44100,48000]<br>|
|**audioChannel**|Integer|True| |Audio Channel Number of Transcoding Output<br>  1: Mono<br>  2: Stereo<br>|
|**audioCodeRate**|Integer|True| |Audio Coding Rate of Transcoding Output<br>- Value: [16,128]<br>- Unit: kbps<br>|


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
https://live.jdcloud-api.com/v1/transcodeCustoms:template

```
```
{
    "audioChannel": 2, 
    "audioCodeRate": 48, 
    "audioCodec": "aac", 
    "audioFormat": "aac_lc", 
    "audioSampleRate": 44100, 
    "height": 1080, 
    "template": "yt", 
    "videoCodeRate": 1500, 
    "videoFrameRate": "30", 
    "width": 1920
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
