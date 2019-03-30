# closeLiveTimeShift


## Description
Close timeshift

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/liveTimeShift:close


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**playDomain**|String|True|Live Pushing Streaming Domain|


## Examples
    {
        "playDomain": "play.yourdomain.com"
    }

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
