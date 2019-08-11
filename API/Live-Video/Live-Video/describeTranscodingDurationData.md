# describeTranscodingDurationData


## Description
Transcoding Duration Statistics

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/describeStatisticData:transcode


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Pushing streaming domain, which transcoding duration data produced under the domain can be searched through designating the domain. <br>|
|**appName**|String|False| |Pushing streaming, domain must be designated when taking AppName as search condition. <br>|
|**streamName**|String|False| |Stream name, domain and AppName must be designated when taking stream name as search condition. <br>|
|**grade**|String|False| |The value of code rate grade corresponds to the grade in the transcoding template, and the length of the transcoding of the specified grade can be searched. <br>|
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
https://live.jdcloud-api.com/v1/describeStatisticData:transcode
```

```
{
    "endTime": "2019-03-25T16:00:00Z", 
    "startTime": "2019-03-24T16:00:00Z"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": [
        {
            "date": "2019-03-24T16:00:00Z", 
            "duration": 1066815
        }
    ]
}
```
