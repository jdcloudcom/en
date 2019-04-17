# describeLiveStreamTranscodeConfig


## Description
Search transcoding template configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodes:config


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False|Template Configuration Search Filter Conditions:<br>  - name:   publishDomain, compulsory (Live Pushing Streaming Domain)<br>  - value:  Parameter<br>  - name:   appName, compulsory (app Name)<br>  - value:  Parameter<br>  - name:   streamName, non-compulsory (Pushing Streaming Name)<br>  - value:  parameter<br>|

### Filter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**name**|String|True|Name of Filter Requirements|
|**operator**|String|False|Operator of filter requirements is eq by default|
|**values**|String[]|True|Value of Filter Requirements|


## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"publishDomain",
           "value":"push.yourdomain.com"},
          {
           "name":"appName",
           "value":"live"
           }]
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
|**transcodeConfigs**|TemplateConfig[]|Code Rate Information|
### TemplateConfig
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**transcodeConfig**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
