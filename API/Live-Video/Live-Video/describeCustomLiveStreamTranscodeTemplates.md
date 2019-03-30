# describeCustomLiveStreamTranscodeTemplates


## Description
Search user customized transcoding template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False|Transcoding Template Search Filter Conditions:<br>  - name:   template  Recording Template Customized Name<br>  - value:  If the parameter is null, search all<br>|

### Filter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**name**|String|True|Name of Filter Requirements|
|**values**|String[]|True|Value of Filter Requirements|

## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"template",
           "value":"test-live-video"}]
    }

## Response parameter
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
|**videoCodeRate**|Integer|Transcoding Output Code Rate Value<br>  - Value: [200,3000]<br>  - Unit: kpbs<br>|
|**videoFrameRate**|String|Transcoding Output Frame Rate Value:<br>  - Value: 15/1, 25/1, 30/1, 60/1<br>|
|**width**|Integer|Transcoding Output Video Width:<br>  - Value: [100,1920]<br>  - Equal Ratio: If only one parameter is filled in, the output transcoding video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcoding video is output according to the source proportion<br>|
|**height**|Integer|Transcoding Output Video Width:<br>  - Value: [100,1920]<br>  - Equal Ratio: If only one parameter is filled in, the output transcoding video is adjusted in proportion to the parameter<br>  - Source-followed: If neither parameter is filled in, the transcoding video is output according to the source proportion<br>|
|**template**|String|Transcoding Template Customized Name|
|**audioCodec**|String|Transcoding Output Audio Coded Format:<br>  - Value: aac, mp3<br>  - Case Insensitive<br>|
|**audioFormat**|String|Transcoding Output Audio Format:<br>  - Value: aac_lc, aac_low, aac_he, aac_he_v2<br>  - Case Insensitive<br>|
|**audioSampleRate**|Integer|Transcoding Output Audio Sampling Rate:<br>  - Value: [44100,48000]<br>|
|**audioChannel**|Integer|Transcoding Output Audio Path Number:<br>  - 1  Single Track<br>  - 2  Dual Track<br>|
|**audioCodeRate**|Integer|Transcoding Output Audio Code Rate:<br>  - Value: [16,128]<br>  - Unit: kbps<br>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
