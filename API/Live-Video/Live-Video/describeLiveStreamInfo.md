# describeLiveStreamInfo


## Description
Search Live Real-time Streaming Information


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/streams/{publishDomain}/appNames/{appName}/streamNames/{streamName}/streamInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| |Application Name|
|**streamName**|String|True| |Stream Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ruquestId|

### Result
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**status**|String|Streaming Status<br>  on: Online Streaming<br>  off: Offline Streaming<br>|

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
https://live.jdcloud-api.com/v1/streams/push.yourdomain.com/appNames/yourapp/streamNames/yourstream/streamInfo
```

## Return Example
```
{
    "RequestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "appName": "yourapp", 
        "publishDomain": "push.yourdomain.com", 
        "status": "on", 
        "streamName": "yourstream"
    }
}
```
