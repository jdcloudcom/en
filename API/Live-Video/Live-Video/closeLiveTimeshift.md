# closeLiveTimeshift


## Description
Close Timeshift

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/liveTimeshift:close


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |Live Playing Domain|


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
PUT
```
https://live.jdcloud-api.com/v1/liveTimeshift:close
```

```
{
    "playDomain": "play.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
