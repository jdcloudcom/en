# addCustomLiveStreamTranscodeTemplate


## Description
Add customized transcoding template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**videoCodeRate**|Integer|True|Transcoding Output Code Rate Value:<br> - Value Range:[200,3000]<br> - Unit: kpbs<br>|
|**videoFrameRate**|String|True|Transcoding Output Frame Rate Value:<br>  - Value: 15, 25, 30, 60<br>|
|**width**|Integer|False|Transcoding Output Video Width:<br>  - Value: [100,1920]<br>  - Equal Ratio: If only one parameter is filled in, the output transcoding video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcoding video is output according to the source proportion<br>|
|**height**|Integer|False|Transcoding Output Video Width:<br>  - Value: [100,1920]<br>  - Equal Ratio: If only one parameter is filled in, the output transcoding video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcoding video is output according to the source proportion<br>|
|**template**|String|True|Transcoding Template Suffix:<br>  - Standard Quality Template:<br>- ld(h.264/640*360/15f)<br>- sd(h.264/854*480/24f)<br>- hd(h.264/1280*720/25f)<br>- shd(h.264/1920*1080/30f)<br>  - Value Requirements: For numbers, uppercase and lowercase letters, or hyphens ("-”),<br>              no special characters are allowed at the beginning and end("-")<br>  - <b>Note: It cannot be repeated with the standard transcoding template and the defined name</b><br>|
|**audioCodec**|String|True|Transcoding Output Audio Coded Format:<br>  - Value: aac, mp3<br>  - Case Insensitive<br>|
|**audioFormat**|String|True|Transcoding Output Audio Format:<br>  - Value: aac_lc, aac_low, aac_he, aac_he_v2<br>  - Case Insensitive<br>|
|**audioSampleRate**|Integer|True|Transcoding Output Audio Sampling Rate:<br>  - Value: [44100,48000]<br>|
|**audioChannel**|Integer|True|Transcoding Output Audio Path Number:<br>  - 1  Single Track<br>  - 2  Dual Track<br>|
|**audioCodeRate**|Integer|True|Transcoding Output Audio Code Rate:<br>  - Value: [16,128]<br>  - Unit: kbps<br>|



## Examples
    {
        "videoCodeRate": 300,
        "videoFrameRate": "15",
        "width": 1080,
        "height": 720,
        "template":"test-live-video",
        "audioCodec":"aac",
        "audioFormat":"aac_low",
        "audioSampleRate":44108,
        "audioChannel":2,
        "audioCodeRate":30
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
