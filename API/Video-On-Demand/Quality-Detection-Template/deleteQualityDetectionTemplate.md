# deleteQualityDetectionTemplate


## Description
Delete Quality Control Template

## Request Method
DELETE

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/{templateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|Long|True| |Template ID|

## Request Parameter
None


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
DELETE
```
https://vod.jdcloud-api.com/v1/qualityDetectionTemplates/1

```

