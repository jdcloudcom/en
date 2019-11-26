# Automatic Composing


## API Description
Automatic Composing is an image design tool of stability, high efficiency and intelligence, with which users can enter images and copywriting materials and rapidly output image design results. The system will make comprehensive application of image identification, Image Style Classification and other technologies according to inputted contents and finish complicated and taxing design steps such as material analysis, type setting and color matching.

## Request Description

### 1. Request Address
http://wkq5y1h4uomy.cn-north-1.jdcloud-api.net/api/compose/design

### 2. Request Method
POST

### 3. Request Parameter
This API adopts the `FormData` uploading format. For any doubts, please refer to demo.

#### (1) body Request Parameter
|Name|Type|Compulsory|Example Value|Description|
|---|---|---|---|---|
|service|int| Yes | 1 | 1 refers to customized template composing, while 2 refers to intelligent and multi-size template composing |
|template_id|string| Yes |  | Template id |
|texts|[]| Yes | ['Copywriting 1', 'Copywriting 2'] | Copywriting Array |
|images|[file]| Yes | [] | Image Array |

### 4. Request Example
Request：

```http
POST /api/compose/design HTTP/1.1
Host: <HOST>
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW


Content-Disposition: form-data; name="images"; filename="/Users/zhushijie/Documents/test-psd-800x600.psd

------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="texts"

<TEXT>
------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="texts"

<TEXT>
------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="template_id"

<TEMPLATE_ID>
------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="service"

<SERVICE>
------WebKitFormBoundary7MA4YWxkTrZu0gW--
```
## Return Instructions

### 1. Return Parameter

#### (1) Public Return Parameter

|Name|Type|Example Value|Description|
|---|---|---|---|
|code|string | 1001 | See-[System Level Error Code](https://docs.jdcloud.com/cn/image-matting/error-codes) |
|msg|string | Successful Search | See-[System Level Error Code](https://docs.jdcloud.com/cn/image-matting/error-codes) |
|result|object | {...} | Result |

#### (2) Business Return Parameter
result parameter information

|Name|Type|Example Value|Description|
|---|---|---|---|
|status|string | 0 | Returned results, 0 means successful, non-0 is the corresponding error code, see Error Code - Business Level Error Code|
|requestid|string | 6979e9bd79b944b49e0d6e74079d5098 | Request id |
|message|string | success | Result status, if successful, it is success |
|image_url|string | http://example.com/xxx.png | Synthesized Image Address |

### 2. Return Example
```http
HTTP/1.1 200
Content-Type: application/json

{
    "code": 10000,
    "msg": "Search succeeded",
    "result": {
        "image_url": "https://img30.360buyimg.com/tu/jfs/t1/80487/39/15221/177188/5dcbab45E5b7a420d/fdc002d76f4e40f0.jpg",
        "status": 0,
        "message": "OK",
        "requestId": "45d7a845-420f-450d-8460-fbddf3feafa1"
    }
}
```
