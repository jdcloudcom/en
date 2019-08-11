# addLiveStreamAppWatermark


## Description
Add watermark configuration at application level


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/watermarkApps:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**template**|String|True| |Watermark Template Name|


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

## Request Example
POST
```
https://live.jdcloud-api.com/v1/watermarkApps:config
```

```
{
    "appName": "yourapp", 
    "publishDomain": "push.yourdomain.com", 
    "template": "yourwatermarktemplate"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
