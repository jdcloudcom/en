# setHeader


## Description
Set domain access header parameter

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:setHeader

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**headerName**|String|True| |Header Parameter Name. Value range of access header parameter supported currently: <br>  Content-Disposition<br>  Content-Language<br>  Expires<br>  Access-Control-Allow-Origin<br>  Access-Control-Allow-Methods<br>  Access-Control-Max-Age<br>  Access-Control-Expose-Headers<br>|
|**headerValue**|String|True| |Header Parameter Value|
|**headerType**|String|True| |Header parameter type, value range: req and resp|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


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
POST
```
https://vod.jdcloud-api.com/v1/domains/2:setHeader

```
```
{
    "headerName": "Access-Control-Allow-Origin", 
    "headerType": "resp", 
    "headerValue": "*"
}
```

