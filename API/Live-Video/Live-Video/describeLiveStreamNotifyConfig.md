# describeLiveStreamNotifyConfig


## Description
Search callback address of live streaming status

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streamNotifys/{publishDomain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|

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
|**publishDomain**|String|Pushing Streaming Domain|
|**notifyUrl**|String|Callback address of streaming status|

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
https://live.jdcloud-api.com/v1/streamNotifys/push.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "notifyUrl": "http://xxx.com/xxx/xxx", 
        "publishDoamin": "push.yourdomain.com"
    }
}
```
