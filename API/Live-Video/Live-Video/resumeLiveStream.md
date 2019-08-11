# resumeLiveStream


## Description
Recover live streaming pushing

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/streams:resume


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|


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
https://live.jdcloud-api.com/v1/streams:resume
```

```
{
    "appName": "yourapp", 
    "publishDomain": "push.yourdomain.com", 
    "streamName": "yourstream"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
