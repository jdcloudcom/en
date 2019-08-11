# addCustomLiveStreamTranscodeTemplate


## Description
Add customized transcoding template
- The system has preset the standard transcoding templates. If they cannot meet your requirements of transcoding, you can add your customized transcoding templates through the interface
- System Standard Transcoding Templates<br>
    ld (h.264/640 * 360/15f)<br>
    sd (h.264/854 * 480/25f)<br>
    hd (h.264/1280 * 720/25f)<br>
    shd (h.264/1920 * 1080/30f)<br>
    2k (h.264/2560 * 1440/30f)<br>
    4k (h.264/3840 * 2160/30f)<br>
    ld-265 (h.265/640 * 360/15f)<br>
    sd-265 (h.265/854 * 480/25f)<br>
    hd-265 (h.265/1280 * 720/25f)<br>
    shd-265 (h.265/1920 * 1080/30f)<br>
    2k-265 (h.265/2560 * 1440/30f)<br>
    4k-265 (h.265/3840 * 2160/30f)<br>



## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoCodec**|String|False| |Video Encoding Format, value: h264, h265, h264<br> by default|
|**videoCodeRate**|Integer|True| |Code Rate of Transcode Output<br>- Value Range: [128,15000]<br>- Unit: kpbs<br>|
|**videoFrameRate**|String|True| |Frame Rate of Transcode Output<br>- Value: [1,30]<br>|
|**width**|Integer|False| |Video Width of Transcode Output<br>- Value: [128,4096]<br>- If only one of (width, height) is set, then zoom the output transcode of another item equally according to the set parameter item<br>- If none of (width, height) is set, then output the transcode according to the source stream size<br>|
|**height**|Integer|False| |Video Width of Transcode Output<br>- Value: [128,4096]<br>- If only one of (width, height) is set, then zoom the output transcode of another item equally according to the set parameter item<br>- If none of (width, height) is set, then output the transcode according to the source stream size<br>|
|**template**|String|True| |Transcode Template (Transcode stream output suffix)<br>- Value Requirements: Numbers, uppercase and lowercase letters or hyphen ("-"), it must begin and end with a number or letter, the length cannot exceed 50 characters<br>- <b>Note: It cannot duplicate the standard transcode template of system and the current user customized naming</b><br>- System Standard Transcode Templates<br>  ld (h.264/640 * 360/15f)<br> sd (h.264/854 * 480/25f)<br> hd (h.264/1280 * 720/25f)<br> shd (h.264/1920 * 1080/30f)<br> 2k (h.264/2560 * 1440/30f)<br> 4k (h.264/3840 * 2160/30f)<br> ld-265 (h.265/640 * 360/15f)<br> sd-265 (h.265/854 * 480/25f)<br> hd-265 (h.265/1280 * 720/25f)<br> shd-265 (h.265/1920 * 1080/30f)<br> 2k-265 (h.265/2560 * 1440/30f)<br> 4k-265 (h.265/3840 * 2160/30f)<br>|
|**audioCodec**|String|True| |Audio Coding Format of Transcoding Output<br>- Value: aac, mp3<br>- Case Insensitive<br>|
|**audioFormat**|String|True| |Audio Format of Transcoding Output<br>- Value: aac_lc, aac_low, aac_he, aac_he_v2<br>- Case Insensitive<br>|
|**audioSampleRate**|Integer|True| |Audio Sampling Rate of Transcoding Output<br>- Value: [44100,48000]<br>|
|**audioChannel**|Integer|True| |Audio Channel Number of Transcoding Output<br>  1: Mono<br>  2: Stereo<br>|
|**audioCodeRate**|Integer|True| |Audio Coding Rate of Transcoding Output<br>- Value: [16,128]<br>- Unit: kbps<br>|
|**jdchd**|String|False| |Jingxiang Super Definition Switch<br>- Value: jdchd-1.0,off<br>- Jingxiang Super Definition only supports h.264 for the time being<br>|
|**audioComfort**|String|False| |Comfortable Audio<br>- Value: on,off<br>|



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
