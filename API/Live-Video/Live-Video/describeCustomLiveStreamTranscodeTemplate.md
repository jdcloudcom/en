# describeCustomLiveStreamTranscodeTemplate


## Description
Search user customized transcoding template details


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Transcoding Template|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**videoCodec**|String|Video Encoding Format<br>  - value: h264, h265, h264<br> by default|
|**videoCodeRate**|Integer|Transcoding Output Code Rate Value<br>- Unit: kpbs<br>|
|**videoFrameRate**|String|Transcoding Output Frame Rate Value<br>|
|**width**|Integer|Transcoding Output Video Width<br>|
|**height**|Integer|Transcoding Output Video Width<br>|
|**template**|String|Transcoding Template<br>|
|**audioCodec**|String|Transcoding Output Audio Coded Format<br>|
|**audioFormat**|String|Transcoding Output Audio Format<br>|
|**audioSampleRate**|Integer|Transcoding Output Audio Sampling Rate<br>|
|**audioChannel**|Integer|Audio Channel Number of Transcoding Output<br>  1: Mono<br>  2: Stereo<br>|
|**audioCodeRate**|Integer|Audio Code Rate of Transcoding Output<br>- Unit: kbps<br>|

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
GET
```
https://live.jdcloud-api.com/v1/transcodeCustoms/yt

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "audioChannel": 2, 
        "audioCodeRate": 16, 
        "audioCodec": "aac", 
        "audioFormat": "aac_lc", 
        "audioSampleRate": 44800, 
        "height": 480, 
        "template": "yt", 
        "videoCodeRate": 300, 
        "videoFrameRate": "25/1", 
        "width": 720
    }
}
```
