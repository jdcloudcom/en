# describeLiveSnapshotUrl


## Description
Acquire Snapshot Address


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshots/{imgId}:url


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**imgId**|String|True| |Snapshot ID<br>|
|**authExpire**|Integer|False| |Address validity period, Unit: Second, default: 3600<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**imgId**|String|Snapshot ID|
|**imgUrl**|String|Image Address|

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
https://live.jdcloud-api.com/v1/snapshots/{imgId}:url
```

```
{
    "authExpire": 3600
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "imgId": "", 
        "imgUrl": ""
    }
}
```
