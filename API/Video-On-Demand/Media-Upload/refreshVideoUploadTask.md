# refreshVideoUploadTask


## Description
Refresh video uploading address and credential

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/videoUploadTask:refresh


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**videoId**|String|True| |Video Address|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Refresh result of video uploading address and credential|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**videoId**|String|Video ID|
|**uploadUrl**|String|Video Upload Address|

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
https://vod.jdcloud-api.com/v1/videoUploadTask?videoId=edfc74ea-be4c-418b-b841-31ddd2b33203

```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "uploadUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-jdcloudmttest2/source/2018/20181211/835/a6934140-13ce-4685-b8f0-4da6464a2908.mp4?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20181211T023445Z&X-Amz-SignedHeaders=host&X-Amz-Expires=299&X-Amz-Credential=986C710A6A1FD2F7220D71D3DF68FF71%2F20181211%2Fcn-ite-1%2Fs3%2Faws4_request&X-Amz-Signature=17ebe021aed33f6d684ef69b2e5fad993a3f5165017689824e43a639f0818ff9", 
        "videoId": "d36e092b-b860-4ceb-94db-68dff87dd02a"
    }
}
```
