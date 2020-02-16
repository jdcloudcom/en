# setCallback


## Description
Set callback configuration

## Request Method
POST

## Request Address
https://vqd.jdcloud-api.com/v1/settings:setCallback


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**callbackType**|String|True| |Call back mode only supports http now|
|**httpUrl**|String|False| |Field in HTTP mode is required|
|**callbackEvents**|String[]|True| |Callback event list. <br>- VqdSuccess video quality detection succeeded<br>- VqdFailure video quality detection failed<br>- VqdStart start video quality detection<br>|


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
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vqd.jdcloud-api.com/v1/settings:setCallback

```
```
{
    "callbackEvents": [
        "VqdSuccess", 
        "VqdFailure"
    ], 
    "callbackType": "http", 
    "httpUrl": "https://example.com/callback"
}
```

