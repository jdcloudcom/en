# startLiveDomain


## Description
Start domain
- Enable live domain pair (pushing streaming domain, playing domain) in disabled status  change DomainStatus to online


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:start


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain<br>- The pushing streaming domain of the domain pairs to be started (pushing streaming domain, playing domain)<br>|


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
https://live.jdcloud-api.com/v1/domains:start
```

```
{
    "publishDomain": "push.yourdomain.com"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
