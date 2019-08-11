# createImageUploadTask


## Description
Get image uploading address and credential

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/imageUploadTask


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpMethod**|String|False| |Value range of HTTP request method is GET, POST, PUT, DELETE, HEAD and PATCH and the default value is PUT|
|**fileName**|String|False| |File Name|
|**fileSize**|Long|False| |File Size|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Get result of image uploading address and credential|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|
|**uploadUrl**|String|Image Uploading Address|

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
https://vod.jdcloud-api.com/v1/imageUploadTask

```
```
{
    "fileName": "The Three-body Problem in MC.PNG", 
    "fileSize": 12435, 
    "httpMethod": "PUT"
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "imageId": "d36e092b-b860-4ceb-94db-68dff87dd02a", 
        "uploadUrl": "http://s3.cn-ite-1.jcloudcs.com/vod-storage-jdcloudmttest2/source/2018/20181211/835/a6934140-13ce-4685-b8f0-4da6464a2908.mp4?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20181211T023445Z&X-Amz-SignedHeaders=host&X-Amz-Expires=299&X-Amz-Credential=986C710A6A1FD2F7220D71D3DF68FF71%2F20181211%2Fcn-ite-1%2Fs3%2Faws4_request&X-Amz-Signature=17ebe021aed33f6d684ef69b2e5fad993a3f5165017689824e43a639f0818ff9"
    }
}
```
