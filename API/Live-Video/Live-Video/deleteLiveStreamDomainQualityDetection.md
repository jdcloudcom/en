# deleteLiveStreamDomainQualityDetection


## Description
Delete domain name quality detection configuration
- Delete quality detection template configuration at domain level, taking effect after pushing streaming again gain


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionDomains/{publishDomain}/templates/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**template**|String|True| |Quality Detection Template|

## Request Parameter
None


## Return Parameter
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
https://live.jdcloud-api.com/v1/qualityDetectionDomains/push.yourdomain.com/templates/yourQualityDetectionTemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
