# deleteLiveStreamAppSnapshot


## Description
Delete APP snapshot configuration

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/snapshotApps/{publishDomain}/appNames/{appName}/templates/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**template**|String|True| |Snapshot Template|

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
https://live.jdcloud-api.com/v1/snapshotApps/push.yourdomain.com/appNames/yourapp/templates/yoursnapshottemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
