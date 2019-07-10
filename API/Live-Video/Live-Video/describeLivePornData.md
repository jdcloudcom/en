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
|**publishDomain**|String|False| |Pushing Streaming Domain|
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
|**pornData**|PornCountStatisticResult[]| |
### PornCountStatisticResult
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Time Point<br>|
|**endTime**|String|Time Point<br>|
|**data**|PornCountStatisticData| |
### PornCountStatisticData
|Name|Type|Description|
|---|---|---|
|**count**|Integer|Sheets of Porn Identification:<br>- Unit: Sheet<br>|

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
        "pornData": [
            {
                "data": {
                    "count": 0
                }, 
                "endTime": "2019-04-15T15:59:59Z", 
                "startTime": "2019-04-14T16:00:00Z"
            }, 
            {
                "data": {
                    "count": 0
                }, 
                "endTime": "2019-04-16T15:59:59Z", 
                "startTime": "2019-04-15T16:00:00Z"
            }
        ]
    }
}
```
