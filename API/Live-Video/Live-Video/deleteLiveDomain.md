# deleteLiveDomain


## Description
Delete live domain
- Please operate with caution (It is suggested to restore domain A record by the domain name resolution service provider prior to domain deletion) to avoid such domain being inaccessible after deletion.
  All relevant records of the live domain will be deleted after successful deleteLiveDomain call. If it only needs to suspend the use of the live domain, it is recommended to use the stopLiveDomain interface


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|


## Request Parameter
None


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
DELETE
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
