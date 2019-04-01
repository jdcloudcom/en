# addLiveRestartDomain


## Description
Add restart domain

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:restart


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**playDomain**|String|True|Live-Connected Playing Domain (Extensive Domain is not supported)|
|**restartDomain**|String|True|Live Restart Domain Required to Add (Extensive Domain is not supported)|


## Examples
    {
        "publishDomain": "push.yourdomain.com",
        "restartDomain": "restart.yourdomain.com"
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
