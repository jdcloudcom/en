# addLiveRestartDomain


## Description
Add restart domain


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:restart


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |Live Playing Domain<br>- Original playing domain corresponding to restarting domain, new restarting domain will be associated with the playing domain<br>|
|**restartDomain**|String|True| |Live Restarting Domain<br>- Live domain must have been completed ICP filing<br>|


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
https://live.jdcloud-api.com/v1/domains:restart
```

```
{
    "playDomain": "play.yourdomain.com", 
    "restartDomain": "restart.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
