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


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**audioChannel**|Integer|Transcoding Output Audio Path Number|
|**audioCodeRate**|Integer|Transcoding Output Audio Code Rate|
|**audioCodec**|String|Transcoding Output Audio Coded Format|
|**audioFormat**|String|Transcoding Output Audio Format|
|**audioSampleRate**|Integer|Transcoding Output Audio Sampling Rate|
|**height**|Integer|Transcoding Output Video Width|
|**template**|String|Transcoding Template Customized Name|
|**videoCodeRate**|Integer|Transcoding Output Code Rate Value|
|**videoFrameRate**|String|Transcoding Output Frame Rate Value|
|**width**|Integer|Transcoding Output Video Width|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
