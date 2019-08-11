# describeLivePlayAuthKey


## Description
Search play authentication KEY

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/livePlayAuthKey


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |Live Playing Domain<br>- Only Support Exact Matching<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**authStatus**|String|Play Authentication Status<br>  on: Start<br>  off: Close<br>|
|**authKey**|String|Play Authentication Key|

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
GET
```
https://live.jdcloud-api.com/v1/livePlayAuthKey?playDomain=play.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "authKey": "sfdseeessdfeswer123", 
        "authStatus": "on", 
        "playDomain": "play.yourdomain.com"
    }
}
```
