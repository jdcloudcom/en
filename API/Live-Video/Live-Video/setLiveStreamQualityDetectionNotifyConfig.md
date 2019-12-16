# setLiveStreamQualityDetectionNotifyConfig


## Description
Set Live Quality Detection Callback Notification Address


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/qualityDetectionNotifys:config


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**notifyUrl**|String|True| |The URL address of the quality detection callback notification:<br>- starts with http://, the address accessible by Internet<br>|


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
https://live.jdcloud-api.com/v1/qualityDetectionNotifys:config
```

```
{
    "notifyUrl": "http://xxx.com/xxx/xxx", 
    "publishDomain": "push.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
