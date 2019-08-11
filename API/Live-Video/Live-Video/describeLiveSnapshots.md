# describeLiveSnapshots


## Description
Search Snapshot List


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshots


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|True| |Current Page<br>|
|**pageSize**|Integer|True| |Number of Records per Page<br>|
|**authExpire**|Integer|False| |Image download link validity period, Unit: Second, default: 3600<br>|
|**publishDomain**|String|True| |Pushing Streaming Domain<br>|
|**appName**|String|True| |Pushing streaming AppName<br>|
|**streamName**|String|True| |Streaming Name<br>|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**domainDetails**|Snapshot[]|Snapshot Information Set|
### Snapshot
|Name|Type|Description|
|---|---|---|
|**imgId**|String|Snapshot ID<br>|
|**format**|String|Snapshot Format<br>|
|**width**|Integer|Snapshot Width<br>- Unit: Pixel<br>|
|**height**|Integer|Snapshot Height<br>- Unit: Pixel<br>|
|**snapshotTime**|String|Snapshot Time Point<br>|
|**size**|Integer|Snapshot File Size<br>|
|**imgUrl**|String|Snapshot Address<br>|

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
https://live.jdcloud-api.com/v1/snapshots
```

```
{
    "appName": "your appname", 
    "authExpire": 3600, 
    "endTime": "2019-03-27T16:00:00Z", 
    "pageNum": "0", 
    "pageSize": "100", 
    "publishDomain": "your domain", 
    "startTime": "2019-03-26T16:00:00Z", 
    "streamName": "your streamname"
}
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "pageNumber": 1, 
        "pageSize": 100, 
        "snapshotList": [
            {
                "appName": "xxx", 
                "format": "jpg", 
                "height": 234, 
                "imgId": "", 
                "imgUrl": "", 
                "publishDomain": "xxx", 
                "size": 122880, 
                "snapshotTime": "2019-03-26T18:00:00Z", 
                "streamName": "xxx", 
                "width": 112
            }
        ], 
        "totalCount": 2
    }
}
```
