# resumeLiveStream


## Description
Recover live streaming pushing

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/streams:resume


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**appName**|String|True|Application Name|
|**publishDomain**|String|True|Your Accelerated Domain|
|**streamName**|String|True|Stream name|

## Examples
    {
        "playDomain":"play.yourdomain.com",
        "streamName": "test-stream",
        "appName": "live"
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
