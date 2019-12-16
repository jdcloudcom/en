# deleteCustomLiveStreamQualityDetectionTemplate


## Description
Delete Live Quality Detection Template
- Before deleting quality detection template, please delete the quality detection configuration associated with the template first, otherwise it cannot be deleted


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionCustoms/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
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
https://live.jdcloud-api.com/v1/qualityDetectionCustoms/yourQualityDetectionTemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
