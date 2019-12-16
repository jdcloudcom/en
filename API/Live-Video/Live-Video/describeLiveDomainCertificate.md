# describeLiveDomainCertificate


## Description
Search Live Playing Certificate

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveDomainCertificate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|True| |(Live or Timeshift) Playing Domain<br>- Only Support Exact Matching<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**certStatus**|String|(Live or Timeshift) Play Certificate Status<br>  on: enabled<br>  off: disabled<br>|
|**cert**|String|(Live or Timeshift) Live Playing Certificate|
|**title**|String|(Live or Timeshift) Live Playing Certificate Alias|

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
https://live.jdcloud-api.com/v1/liveDomainCertificate?playDomain=play.yourdomain.com

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "cert": "xxx", 
        "certStatus": "on", 
        "playDomain": "play.yourdomain.com", 
        "title": "my cert"
    }
}
```
