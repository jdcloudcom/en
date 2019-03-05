# describeCustomLiveStreamTranscodeTemplates


## Description
Search user customized transcoding template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodeCustoms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |Transcoding template search filter requirements; return 10 by default when no paging parameters are passed on|
|**pageNum**|Integer|False|1|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|10|Segmentation size; it is 10 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Number|Search Total Amount|
|**transcodeTemplates**|TranscodeInfo[]|Code Rate Information|
### TranscodeInfo
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
