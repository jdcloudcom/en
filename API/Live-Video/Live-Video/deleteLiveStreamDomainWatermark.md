# deleteLiveStreamDomainWatermark


## Description
Delete watermark template configuration at domain level
- Delete watermark template configuration at domain level


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/watermarkDomains/{publishDomain}/templates/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**template**|String|True| |Watermark Template|

## Request Parameter
None


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
DELETE
```
https://live.jdcloud-api.com/v1/watermarkDomains/push.yourdomain.com/templates/yourwatermarktemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
