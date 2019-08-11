# deleteVideoStreams


## Description
Delete video transcode flow

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/videos/{videoId}:deleteStreams

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|True| |Video ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskIds**|Long[]|True| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Delete video transcode flow|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**okTaskIds**|Number[]|List of Transcode Task ID Deleted|
|**notFoundTaskIds**|Number[]|List of Transcode Task ID Not Found|
|**failedTaskIds**|Number[]|List of Transcode Task ID Failed to Be Deleted|

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
POST
```
https://vod.jdcloud-api.com/v1/videos/f74a601a-6abc-46a6-9739-f53e9dfe041f:deleteStreams

```
```
{
    "taskIds": [
        3043282
    ]
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "bkpp35strh9u48t6jmtgqmgfewwbtqve", 
    "result": {
        "failedTaskIds": [], 
        "notFoundTaskIds": [], 
        "okTaskIds": [
            "3043282"
        ]
    }
}
```
