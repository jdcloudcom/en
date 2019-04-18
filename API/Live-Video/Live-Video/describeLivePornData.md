# describeLivePornData


## Description
Search live porn identification number data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/livePornData


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|False| |Application Name|
|**streamName**|String|False| |Stream Name|
|**startTime**|String|True| |Start time<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Support searching data within up to 90 days<br>|
|**endTime**|String|False| |End time:<br>- UTC Time<br>  Format:yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example:2018-10-21T10:00:00Z<br>- Is null, the current time by default<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pornData**|PornData[]| |
### PornData
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**date**|String|Date<br>- yyyyMMdd<br>- Example: 20190308<br>|
|**total**|Integer|Sheets of Porn Identification:<br>- Unit: Sheet<br>|

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
https://live.jdcloud-api.com/v1/livePornData?publishDomain=push.yourdomain.com&appName=yourapp&streamName=yourstream&startTime=2018-10-21T10:00:00Z

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pronDatas": [
            {
                "appName": "yourapp", 
                "date": "20180101", 
                "publishDomain": "push.yourdomain.com", 
                "streamName": "yourstream", 
                "total": 86310
            }, 
            {
                "appName": "yourapp", 
                "date": "20180102", 
                "publishDomain": "push.yourdomain.com", 
                "streamName": "yourstream", 
                "total": 86310
            }
        ]
    }
}
```
