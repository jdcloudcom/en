# describeLiveRestartDomainCertificate


## Description
Search Live Restart Playing Certificate

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveRestartDomainCertificate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restartDomain**|String|True| |Live Restart Domain<br>- Only Support Exact Matching<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**restartDomain**|String|Live Restart Domain|
|**certStatus**|String|Live Restart Play Certificate Status<br>  on: enabled<br>  off: disabled<br>|
|**cert**|String|Live Restart Certificate|
|**title**|String|Live Restart Certificate Alias|

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
https://live.jdcloud-api.com/v1/liveRestartDomainCertificate?restartDomain=restart.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "cert": "xxx", 
        "certStatus": "on", 
        "restartDomain": "restart.yourdomain.com", 
        "title": "restart cert"
    }
}
```
