# deleteVideo


## Description
If the API of deleting video is called, all information related to the appointed video will be deleted at the same time, including transcode task information, transcode streaming data, etc. Meanwhile, relevant file resources in the Cloud Storage will be cleared.

## Request Method
DELETE

## Request Address
https://vod.jdcloud-api.com/v1/videos/{videoId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|True| |Video ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


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
DELETE
```
https://vod.jdcloud-api.com/v1/videos/4fc583b4-d08a-457a-9ce4-8a59c5f474ac

```

