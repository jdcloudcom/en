# startLiveApp


## Description
Enable Application
- Enable Application in Disabled Status


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/apps:start


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Live Pushing Streaming Domain|
|**appName**|String|True| |Application Name|


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
PUT
```
https://live.jdcloud-api.com/v1/apps:start
```

```
{
    "appName": "yourapp", 
    "publishDomain": "push.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
