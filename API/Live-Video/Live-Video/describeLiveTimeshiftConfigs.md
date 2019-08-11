# describeLiveTimeshiftConfigs


## Description
Search timeshift configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveTimeshift:configs


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page Number<br>- Value Range[1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range[10, 100]<br>|
|**playDomain**|String|True| |Live Playing Domain<br>- Currently Only Support Exact Matching<br>|


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
|**timeshiftConfigs**|TimeshiftConfig[]|Live Domain Set|
### TimeshiftConfig
|Name|Type|Description|
|---|---|---|
|**publishDomains**|TimeshiftPublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|TimeshiftPlayDomain[]|Playing Domain Set|
### TimeshiftPlayDomain
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**timeshiftStatus**|String|Live Timeshift Status:<br>  on: Start<br>  off: Close<br>|
|**playType**|String|Playing Domain Type:<br>  normal: Normal Playing Domain(Timeshift Playing Domain)<br>|
### TimeshiftPublishDomain
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|

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
https://live.jdcloud-api.com/v1/liveTimeshift:configs?playDomain=play.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 10, 
        "timeshiftConfigs": [
            {
                "playDomains": [
                    {
                        "playDomain": "play.yourdomain.com", 
                        "playType": "normal", 
                        "timeshiftStatus": "on"
                    }
                ], 
                "publishDomains": [
                    {
                        "publishDomain": "push.yourdomain.com"
                    }
                ]
            }
        ], 
        "totalCount": 1
    }
}
```
