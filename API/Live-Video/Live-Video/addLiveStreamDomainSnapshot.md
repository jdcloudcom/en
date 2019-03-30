# addLiveStreamDomainSnapshot


## Description
Add domain live snapshot configuration

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/snapshotDomains:template


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Your Pushing Streaming Accelerated Domain|
|**template**|String|True|Snapshot Template Customized Name|


## Examples
    {
        "publishDomain": "push.yourdomain.com",
        "template": "test-live-video"
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
