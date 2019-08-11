# describeLiveDomains


## Description
Search domain list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False|1|Page Number<br>- Value Range[1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>- Value Range[10, 100]<br>|
|**publishDomain**|String|False| |Pushing streaming domain<br>- Currently only supports exact search<br>- When it is null, search all live domains of the user<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**domainDetails**|DomainDetails[]|Domain Information Set|
### DomainDetails
|Name|Type|Description|
|---|---|---|
|**publishDomains**|PublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|PlayDomain[]|Playing Domain Set|
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
https://live.jdcloud-api.com/v1/domains?publishDomain=push.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "domainDetails": [
            {
                "playDomains": [
                    {
                        "createTime": "2017-11-27T06:51:25Z", 
                        "playDomain": "play.yourdomain.com", 
                        "playDomainCname": "play.yourdomain.com.live-play.xxx.jcloud-cdn.com", 
                        "playDomainStatus": "online", 
                        "playType": "normal", 
                        "updateTime": "2017-11-27T06:51:26Z"
                    }
                ], 
                "publishDomains": [
                    {
                        "createTime": "2017-11-27T06:51:25Z", 
                        "publishDomain": "push.yourdomain.com", 
                        "publishDomainCname": "push.yourdomain.com.live-publish.xxx.jcloud-cdn.com", 
                        "publishDomainStatus": "online", 
                        "updateTime": "2017-11-27T06:51:26Z"
                    }
                ]
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 1
    }
}
```
