# Image Matting


## API Description
Image Matting service is an intelligent service matting background for the image body and producing transparent bottom image. Based on machine learning and intelligent image recognition technology, image processing efficiency can be greatly promoted and labor cost can be reduced.

## Request Description

### 1. Request Address
http://wko7luloi5tj.cn-north-1.jdcloud-api.net/api/cutout/

### 2. Request Method
POST

### 3. Request Parameter
#### (1) header Request Parameter
|Name|Type|Compulsory|Example Value|Description|
|---|---|---|---|---|
|**Authorization**|string| Yes | JDCLOUD2-HMAC-SHA256Credential=access...	| Signature|

#### (2) body Request Parameter
|Name|Type|Compulsory|Example Value|Description|
|---|---|---|---|---|
|**Null**|binary| Yes | Null | Image content, introduce image|

### 4. Request Code Example
It is suggested that you use the SDK provided by us to make the call. See the use method of sdk for details on how to get and call the SDK

## Return Instructions

### 1. Return Parameter

#### (1) Public Return Parameter

|Name|Type|Example Value|Description|
|---|---|---|---|
|code|string | 1001 | See-[System Level Error Code](https://docs.jdcloud.com/en/image-matting/error-codes) |
|msg|string | Successful Search | See-[System Level Error Code](https://docs.jdcloud.com/en/image-matting/error-codes) |
|result|object | {...} | Result |

#### (2) Business Return Parameter
result parameter information

|Name|Type|Example Value|Description|
|---|---|---|---|
|status|string | 0 | Returned results, 0 means successful, and non-0 is the corresponding error code. See Error Code - Business Level Error Code|
|requestid|string | 6979e9bd79b944b49e0d6e74079d5098 | Request id |
|message|string | success | Result status, if successful, it is success |
|cutout_image_url|string | http://example.com/xxx.png | Processed image address |

### 2. Return Example
```js
{
  "code": 10000,
  "msg": "Search succeeded",
  "result": {
    "status": 0,
    "message": "OK",
    "cutout_image_url": "http://example.com/d2efdefffea41a18.png",
    "requestId": "aa4899f4-db4c-4b09-8aaa-5ecd175e204e"
  }
}
```
