# describeSystemLiveStreamTranscodeTemplates


## Description
Search System Default Transcode Template List


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodeSystem


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range [10, 100]<br>|
|**filters**|Filter[]|False| |Transcoding Template Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>  - If it’s null, it means to search all the customized transcoding templates under this user<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**transcodeTemplates**|TranscodeInfo[]|Code Rate Information|

### TranscodeInfo
|Name|Type|Description|
|---|---|---|
|**videoCodec**|String|Video Encoding Format<br>  - value: h264, h265, h264<br> by default|
|**videoCodeRate**|Integer|Transcode Output Code Rate Value<br>  -  Value: [128,15000]<br>  - Unit: kpbs<br>|
|**videoFrameRate**|String|Transcode Output Frame Rate Value:<br>  - value: [1,30]<br>|
|**width**|Integer|Transcode Output Video Width:<br>  - Value: [128,4096]<br>  - Equal Ratio: If only one parameter is filled in, the output transcode video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcode video is output according to the source proportion<br>|
|**height**|Integer|Transcode Output Video Width:<br>  - Value: [128,4096]<br>  - Equal Ratio: If only one parameter is filled in, the output transcode video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcode video is output according to the source proportion<br>|
|**template**|String|Transcoding Template Customized Name:<br>  - Customized Template: Enumeration type verification, ignore uppercase and lowercase, automatically delete spaces,<br>              Value Requirements: For numbers, uppercase and lowercase letters, or hyphens("-"),<br>              no special characters are allowed at the beginning and end("-")<br>  - Note: It cannot be repeated with the standard transcoding template and the defined name<br>|
|**templateName**|String|Transcode Template Name<br>|
|**audioCodec**|String|Transcoding Output Audio Coded Format:<br>  - Value: aac, mp3<br>  - Case Insensitive<br>|
|**audioFormat**|String|Transcoding Output Audio Format:<br>  - Value: aac_lc, aac_low, aac_he, aac_he_v2<br>  - Case Insensitive<br>|
|**audioSampleRate**|Integer|Transcoding Output Audio Sampling Rate:<br>  - Value: [44100,48000]<br>|
|**audioChannel**|Integer|Transcoding Output Audio Path Number:<br>  - 1  Single Track<br>  - 2  Dual Track<br>|
|**audioCodeRate**|Integer|Transcoding Output Audio Code Rate:<br>  - Value: [16,128]<br>  - Unit: kbps<br>|
|**jdchd**|String|Jingxiang Super Definition <br>- Value: jdchd-1.0,off<br>|
|**audioComfort**|String|Comfortable Audio<br>- Value: on,off<br>|

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
https://live.jdcloud-api.com/v1/transcodeSystem?filters.1.name=template&filters.1.values.1=yt
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 1, 
        "transcodeTemplates": [
            {
                "audioChannel": 2, 
                "audioCodeRate": 64, 
                "audioCodec": "aac", 
                "audioFormat": "aac_he", 
                "audioSampleRate": 44100, 
                "height": 720, 
                "template": "lhd", 
                "templateName": "default_template_lhd", 
                "videoCodeRate": 800, 
                "videoCodec": "h264", 
                "videoFrameRate": "24", 
                "width": 1280
            }
        ]
    }
}
```
