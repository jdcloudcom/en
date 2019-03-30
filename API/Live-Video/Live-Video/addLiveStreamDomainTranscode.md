# addLiveStreamDomainTranscode


## Description
Add domain transcoding configuration

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/transcodeDomains:config


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Live Pushing Streaming Domain|
|**template**|String|True|Transcoding Template Suffix|


## Examples
    {
        "publishDomain": "push.yourdomain.com",
        "template": "test-live-video
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
