# setHttpHeader


## Description
Add httpHeader. HttpHeader related configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/httpHeader

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**headerType**|String|True| |header type [resp,req]|
|**headerName**|String|True| |header name|
|**headerValue**|String|True| |header value|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
