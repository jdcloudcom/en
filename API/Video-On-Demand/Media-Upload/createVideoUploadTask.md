# createVideoUploadTask


## Description
Get video uploading address and credential

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/videoUploadTask


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpMethod**|String|False| |Value range of HTTP request method is GET, POST, PUT, DELETE, HEAD and PATCH and the default value is PUT|
|**title**|String|True| |Video Title|
|**fileName**|String|True| |File Name|
|**fileSize**|Long|False| |File Size|
|**coverUrl**|String|False| |Cover Address|
|**description**|String|False| |Video Description|
|**categoryId**|Long|False| |Category ID|
|**tags**|String[]|False| |Video Tag Set|
|**transcodeTemplateIds**|Long[]|False| |Transcode Template ID Set|
|**watermarkIds**|Long[]|False| |Watermark ID Set|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createvideouploadtask#result)|Get result of video uploading address and credential|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**videoId**|String|Video ID|
|**uploadUrl**|String|Upload address|
|**authToken**|String|Upload credential|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vod.jdcloud-api.com/v1/videoUploadTask

```
```
{
    "categoryId": 1, 
    "coverUrl": null, 
    "description": "The Three-body Problem in MC is the Three-body Problem animation sponsored and produced by Shenyoubafang with Minecraft", 
    "fileName": "The Three-body Problem in MC.mp4", 
    "fileSize": 12495245, 
    "httpMethod": "PUT", 
    "tags": [
        "The Three-body Problem", 
        "Animation"
    ], 
    "title": "The Three-body Problem in MC", 
    "transcodeTemplateIds": [
        1, 
        2
    ], 
    "watermarkIds": [
        1, 
        2
    ]
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "authToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", 
        "uploadUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-jdcloudmttest2/source/2018/20181211/835/a6934140-13ce-4685-b8f0-4da6464a2908.mp4?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20181211T023445Z&X-Amz-SignedHeaders=host&X-Amz-Expires=299&X-Amz-Credential=986C710A6A1FD2F7220D71D3DF68FF71%2F20181211%2Fcn-ite-1%2Fs3%2Faws4_request&X-Amz-Signature=17ebe021aed33f6d684ef69b2e5fad993a3f5165017689824e43a639f0818ff9", 
        "videoId": "d36e092b-b860-4ceb-94db-68dff87dd02a"
    }
}
```
