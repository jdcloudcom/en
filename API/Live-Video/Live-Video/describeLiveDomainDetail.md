# describeLiveDomainDetail


## Description
Search the relevant information of specified domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain<br> -The pushing streaming domain of the domain pairs to be disabled (pushing streaming domain, playing domain)|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**publishDomains**|PublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|PlayDomain[]|Live Domain Set|
### PlayDomain
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**playDomainCname**|String|Playing Domain (Cname)|
|**domainStatus**|String|Live Domain Status<br>  online: Enable<br>  offline: Disable<br>  configuring: Configuring<br>  configure_failed: Configuration Failed<br>  checking: Checking<br>  check_failed: Checking Failed<br>|
|**playType**|String|Playing Domain Type<br>  normal: Normal Playing Domain<br>  restart: Restart Domain<br>|
|**createTime**|String|Domain Creation Time<br>- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**updateTime**|String|Domain update time- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
### PublishDomain
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**publishDomainCname**|String|Pushing Streaming Domain (Cname)|
|**domainStatus**|String|Live Domain Status<br>  online: Enable<br>  offline: Disable<br>  configuring: Configuring<br>  configure_failed: Configuration Failed<br>  checking: Checking<br>  check_failed: Checking Failed<br>|
|**createTime**|String|Domain Creation Time<br>- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**updateTime**|String|Domain update time- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|

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
https://live.jdcloud-api.com/v1/domains/push.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "playDomain": [
            {
                "createTime": "2017-11-27T06:51:25Z", 
                "domainStatus": "online", 
                "playDomain": "play.yourdomain.com", 
                "playType": "normal", 
                "publishDomainCname": "play.yourdomain.com.live-play.xxx.jcloud-cdn.com", 
                "updateTime": "2017-11-27T06:51:26Z"
            }
        ], 
        "publishDomain": [
            {
                "createTime": "2017-11-27T06:51:25Z", 
                "domainStatus": "online", 
                "publishDomain": "push.yourdomain.com", 
                "publishDomainCname": "push.yourdomain.com.live-publish.xxx.jcloud-cdn.com", 
                "updateTime": "2017-11-27T06:51:26Z"
            }
        ]
    }
}
```
