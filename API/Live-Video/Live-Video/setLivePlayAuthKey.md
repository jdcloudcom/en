# setLivePlayAuthKey


## Description
Set play authentication KEY

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/livePlayAuthKey


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |Playing Domain|
|**authStatus**|String|False| |Play Authentication Status<br>  on: Start<br>  off: Close<br>- When the pushing streaming authentication status is on(on),authKey cannot be null<br>|
|**authKey**|String|False| |Play Authentication key<br>- Value: Supports uppercase and lowercase and numbers  6-32 bits in length<br>|


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
https://live.jdcloud-api.com/v1/setLivePlayAuthKey
```

```
{
    "authKey": "testAuthKey123", 
    "authStatus": "on", 
    "playDomain": "play.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
