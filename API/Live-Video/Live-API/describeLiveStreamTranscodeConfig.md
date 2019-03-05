# describeLiveStreamTranscodeConfig


## Description
Search transcoding template configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodes:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |Transcoding template search filter requirements; return 10 by default when no paging parameters are passed on|
|**pageNum**|Integer|False| |page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|

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
|**transcodeConfigs**|TemplateConfig[]|Code Rate Information|
### TemplateConfig
|Name|Type|Description|
|---|---|---|
|**appName**|String|APP Name|
|**publishDomain**|String|Pushing Streaming Domain|
|**streamName**|String|Stream Name|
|**transcodeConfig**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
