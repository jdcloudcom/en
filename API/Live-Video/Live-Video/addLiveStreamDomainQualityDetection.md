# addLiveStreamDomainQualityDetection


## Description
Add Domain Name Quality Detection Configuration
- Add Quality Detection Template Configuration at Domain Name Level


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionDomains:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**template**|String|True| |Quality Detection Template<br>|


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
POST
```
https://live.jdcloud-api.com/v1/qualityDetectionDomains:template
```

```
{
    "publishDomain": "push.yourdomain.com", 
    "template": "yourQualityDetectionTemplate"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
