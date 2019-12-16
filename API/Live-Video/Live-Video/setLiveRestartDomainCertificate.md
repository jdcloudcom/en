# setLiveRestartDomainCertificate


## Description
Set Live Restart Certificate
-- Take effect within 30 minutes after setting successfully


## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/liveRestartDomainCertificate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restartDomain**|String|True| |Live Restart Domain|
|**certStatus**|String|True| |Live Restart Certificate Status<br>  on: enabled<br>  off: disabled<br>- When play certificate is on (enabled), cert and key cannot be null<br>|
|**cert**|String|False| |Live Restart Certificate<br> Value: Support 4098 (maximum)<br>- When play certificate is on (enabled), cert cannot be null<br>|
|**key**|String|False| |Live Restart Certificate key<br> Value: Support 2048 (maximum)<br>- When play certificate is on (enabled), key cannot be null<br>|
|**title**|String|False| |Live Restart Certificate Alias<br>- Value: Supports uppercase and lowercase and numbers  256 bits in length<br>|


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
https://live.jdcloud-api.com/v1/liveRestartDomainCertificate
```

```
{
    "cert": "xxx", 
    "certStatus": "on", 
    "key": "xxx", 
    "restartDomain": "restart.yourdomain.com", 
    "title": "restart cert"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
