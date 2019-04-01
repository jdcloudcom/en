# startLiveDomain


## Description
Start domain

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:start


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Domain to be Started|


## Examples
    {
        "publishDomain":"push.yourdomain.com"
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
