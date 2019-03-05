# addCustomLiveStreamTranscodeTemplate


## Description
Add customized transcoding template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**audioChannel**|Integer|True| |Transcoding Output Audio Path Number|
|**audioCodeRate**|Integer|True| |Transcoding Output Audio Code Rate|
|**audioCodec**|String|True| |Transcoding Output Audio Coded Format|
|**audioFormat**|String|True| |Transcoding Output Audio Format|
|**audioSampleRate**|Integer|True| |Transcoding Output Audio Sampling Rate|
|**height**|Integer|True| |Transcoding Output Video Width|
|**template**|String|True| |Transcoding Template Customized Name|
|**videoCodeRate**|Integer|True| |Transcoding Output Code Rate Value|
|**videoFrameRate**|String|True| |Transcoding Output Frame Rate Value|
|**width**|Integer|True| |Transcoding Output Video Width|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
