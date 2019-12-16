# deleteLiveStreamAppQualityDetection


## Description
Delete quality detection template configuration at application level
- Delete quality detection template configuration at application level, taking effect after pushing streaming again


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionApps/{publishDomain}/appNames/{appName}/templates/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
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
https://live.jdcloud-api.com/v1/qualityDetectionApps/push.yourdomain.com/appNames/yourapp/templates/yourQualityDetectionTemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
