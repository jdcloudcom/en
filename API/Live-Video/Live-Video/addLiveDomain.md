# addLiveDomain


## Description
Add live domain
- Before creating a live domain, live broadcast service must be subscribed first
- Live domain must have been completed ICP filing


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Live Pushing Streaming Domain<br>- Extensive Domain is not supported<br>|
|**playDomain**|String|True| |Live Playing Domain<br>- Extensive Domain is not supported<br>|


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
https://live.jdcloud-api.com/v1/domains
```

```
{
    "playDomain": "play.yourdomain.com", 
    "publishDomain": "push.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
