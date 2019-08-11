# forbidLiveStream


## Description
Ban live streaming pushing

## Request Method
PUT

## Request Address
https://live.jdcloud-api.com/v1/streams:forbid


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|
|**forbidTime**|Long|False| |Blocked Streaming Duration, unit:s 0 represents permanent blocked streaming duration; when the value is greater than 0, it is limited blocked streaming duration, and blocking will be automatically relieved after passing the time limit|


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
https://live.jdcloud-api.com/v1/streams:forbid
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
