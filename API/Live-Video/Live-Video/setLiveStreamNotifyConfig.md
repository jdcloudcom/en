# setLiveStreamNotifyConfig


## Description
Set pushing streaming callback configuration

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/streamNotifys


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Your Accelerated Domain|
|**notifyUrl**|String|True|Set the URL address to which the live streaming information is pushed:<br>  - It must start with http:// <br>  - Regular Check Format<br>|

## Examples
    {
        "publishDomain":"push.yourdomain.com",
        "notifyUrl": "http://amf.jdcloud.com"
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
