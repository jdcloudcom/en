# describeLiveRecordData


## Description
Search live recording duration data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/liveRecordData


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|
|**appName**|String|False| |Application Name|
|**streamName**|String|False| |Stream Name|
|**startTime**|String|True| |Start time:<br>- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example: 2018-10-21T10:00:00Z<br>- Support searching data within up to 90 days<br>|
|**endTime**|String|False| |End time:<br>- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>  Example: 2018-10-21T10:00:00Z<br>- Is null, the current time by default<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**recordData**|RecordData[]| |
### RecordData
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**date**|String|Date:<br>- yyyyMMdd<br>- Example: 20190308<br>|
|**total**|Double|Recording Duration:<br>- Unit: Minute<br>- Up to two digits after the decimal point<br>|
|**detail**|RecordDetail[]|Breakdown|
### RecordDetail
|Name|Type|Description|
|---|---|---|
|**format**|String|Format<br>  mp4<br>  flv<br>  ts<br>|
|**duration**|Double|Duration:<br>- Unit: Minute<br>- Up to two digits after the decimal point<br>|

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
https://live.jdcloud-api.com/v1/liveRecordData?publishDomain=push.yourdomain.com&appName=yourapp&streamName=yourstream&startTime=2018-10-21T10:00:00Z
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "recordDatas": [
            {
                "appName": "yourapp", 
                "date": "20180101", 
                "detail": {
                    "flv": 1234, 
                    "mp4": 123, 
                    "ts": 123124
                }, 
                "publishDomain": "push.yourdomain.com", 
                "streamName": "yourstream", 
                "total": 86310
            }, 
            {
                "appName": "yourapp", 
                "date": "20180102", 
                "detail": {
                    "flv": 1234, 
                    "mp4": 123, 
                    "ts": 123124
                }, 
                "publishDomain": "push.yourdomain.com", 
                "streamName": "yourstream", 
                "total": 86310
            }
        ]
    }
}
```
