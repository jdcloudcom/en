# describeCustomLiveStreamRecordConfig


## Description
Search live recording configuration
- Recording template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration
- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream
- Such search aims at searching recording template configurations of domain, application, stream with final effect rather than templates association at all levels


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/records:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range [10, 100]<br>|
|**filters**|Filter[]|False| |Filter conditions of recording configuration search:<br>  - name:   publishDomain, required (pushing streaming domain)<br>  - value:  parameters<br>  - name:   appName, required (application name)<br>  - value:  parameters<br>  - name:   streamName, not required (stream name)<br>  - value:  parameters<br>|

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
|**recordConfigs**|LiveRecordConfig[]|Template Information|
### LiveRecordConfig
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**recordConfig**|String| |

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
https://live.jdcloud-api.com/v1/records:config?filters.1.name=publishDomain&filters.1.values.1=push.yourdomain.com&filters.2.name=appName&filters.2.values.1=yourapp&filters.3.name=streamName&filters.3.values.1=yourstream
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 100, 
        "recordConfigs": [
            {
                "appName": "yourapp", 
                "publishDomain": "push.yourdomain.com", 
                "recordConfig": [
                    "yourrecordtemplate"
                ], 
                "streamName": "yourstream"
            }
        ], 
        "totalCount": 2
    }
}
```
