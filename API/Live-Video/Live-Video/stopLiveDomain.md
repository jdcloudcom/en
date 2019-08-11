# stopLiveDomain


## Description
Disable domain
- Disable live domain pair (pushing streaming domain, playing domain) change DomainStatus to offline
- After the live domain is disabled, the live domain information will remain, but the user will no longer be able to use the pushing streaming domain to push or use the playing domain to play


## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/domains:stop


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain<br>- The pushing streaming domain of the domain pairs to be disabled (pushing streaming domain, playing domain)<br>|


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
https://live.jdcloud-api.com/v1/domains:stop
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
