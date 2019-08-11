# describeTrafficData


## Description
Traffic Statistics
- Search traffic data within a certain period.
- Search Cycle: 1 minute
- Search Time Span: 30 days


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeStatisticData:traffic


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Playing domain, which bandwidth data produced under the domain can be searched through designating the domain. <br>|
|**appName**|String|False| |Pushing streaming, domain must be designated when taking AppName as search condition. <br>|
|**streamName**|String|False| |Streaming Name<br>|
|**ispName**|String|False| |Operator<br>|
|**locationName**|String|False| |Region<br>|
|**protocolType**|String|False| |Protocol, Value: HTMP, FLV, HLS<br>|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Array|Statistical Results|
|**requestId**|String|ruquestId|


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
https://live.jdcloud-api.com/v1/describeStatisticData:traffic
```

```
{
    "endTime": "2019-03-27T16:00:00Z", 
    "startTime": "2019-03-26T16:00:00Z"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": [
        {
            "data": {
                "value": 188486700
            }, 
            "endTime": "2019-03-26T07:31:00Z", 
            "startTime": "2019-03-26T07:30:00Z"
        }, 
        {
            "data": {
                "value": 376973400
            }, 
            "endTime": "2019-03-26T07:32:00Z", 
            "startTime": "2019-03-26T07:31:00Z"
        }, 
        {
            "data": {
                "value": 376973400
            }, 
            "endTime": "2019-03-26T07:33:00Z", 
            "startTime": "2019-03-26T07:32:00Z"
        }
    ]
}
```
