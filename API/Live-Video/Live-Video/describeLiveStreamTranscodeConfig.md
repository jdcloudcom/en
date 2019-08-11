# describeLiveStreamTranscodeConfig


## Description
Search transcoding template configuration
- Transcoding template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration
- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream
- The search is to search the domain, application, and transcoding template configuration that the stream is finally effective; instead of the template associating status of each level.


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/transcodes:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range[10, 100]<br>|
|**filters**|Filter[]|False| |Filter conditions of template configuration search:<br>  - name:   publishDomain, required (pushing streaming domain)<br>  - value:  parameters<br>  - name:   appName, required (application name)<br>  - value:  parameters<br>  - name:   streamName, not required (stream name)<br>  - value:  parameters<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

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

## Request Example
GET
```
https://live.jdcloud-api.com/v1/transcodes:config?filters.1.name=publishDomain&filters.1.values.1=push.yourdomain.com&filters.2.name=appName&filters.2.values.1=yourapp&filters.3.name=streamName&filters.3.values.1=yourstream
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 1, 
        "transcodeConfigs": [
            {
                "appName": "yourapp", 
                "publishDomain": "push.yourdomain.com", 
                "streamName": "yourstream", 
                "transcodeConfig": [
                    "hd", 
                    "lsd"
                ]
            }
        ]
    }
}
```
