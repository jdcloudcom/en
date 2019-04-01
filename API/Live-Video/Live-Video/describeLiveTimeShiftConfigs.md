# describeLiveTimeShiftConfigs


## Description
Search timeshift configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveTimeShift:configs


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**playDomain**|String|True|Live Pushing Streaming Domain|


## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "playDomain":"play.yourdomain.com"
    }
    
    

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**timeShiftConfigs**|TimeShiftConfig[]|Live Timeshift Set|
### TimeShiftConfig
|Name|Type|Description|
|---|---|---|
|**publishDomains**|ShiftPublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|ShiftPlayDomain[]|Live Domain Set|
### ShiftPlayDomain
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Live Playing Domain|
|**timeShiftStatus**|String|Live Timeshift Status:<br>  - on represents start<br>  - off represents close<br>|
|**playType**|String|Playing Domain Type:<br>  - normal  Normal Playing Domain<br>  - restart Restart Playing Domain<br>|
### ShiftPublishDomain
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Live Pushing Streaming Domain|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
