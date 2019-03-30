# addLiveDomain


## Description
Add live domain

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Live Pushing Streaming Domain (Extensive Domain is not supported)|
|**playDomain**|String|True|Live Playing Domain (Extensive Domain is not supported)|


## Examples
    {
        "publishDomain": "push.yourdomain.com",
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
