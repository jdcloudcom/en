# addLiveApp


## Description
Add the live application name
- Application name needs to be created in advance only when it requires to associate functional template at application (app) level ahead of time
- New application name is automatically created when pushing streaming


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/apps


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Live Pushing Streaming Domain|
|**appName**|String|True| |Application Name<br>- Value: Numbers, letters, line-through ("-") and underline ("_"), within 50 characters<br>|


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
https://live.jdcloud-api.com/v1/apps
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
