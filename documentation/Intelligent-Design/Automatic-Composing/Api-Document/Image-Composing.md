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
- `service`: Required, "1" refers to customized template composing, while "2" refers to intelligent and multi-size template composing
- `template_id`: Template id, if ‘service’ transmits ‘1’, required; if ‘service’ transmits ‘2’ and template id is transmitted, the template id shall be used for composing, while template id is not transmitted, three templates shall be intelligently matched for composing
- `tag`: Template style, if ‘service’ transmits ‘2’, the parameter shall be used to specify the needed style. Optional values include:
  - `1`: Simple and Neutral
  - `2`: Refreshing and Elegant
  - `3`: Gorgeous and Vigorous
  - `4`: Cool and Stylish
  - `5`: Mysterious and Tough
  - `6`: Futuristic and Tough
  - `7`: Delicate and Beautiful
  - `8`: Lively and Festive
- `images`: Optional, commodity image, if multiple images are needed to be transmitted, multiple "images" fields shall be set. If no image is transmitted, default commodity image is used
- `texts`: Optional, copy, transmit JSON character string, e.g. ‘["copy 1", "copy 2"]’. If no image is transmitted, use default copy
- `sizes`: Size of output required, transmit JSON Character String, e.g. ‘[{"width": 100, "height": 100}]’, if ‘service’ transmits ‘2’, the parameter must be transmitted, and otherwise it shall not be transmitted. **Up to 10 sizes are supported**.

### 4. Request Example
Request：

```http
POST /api/compose-image HTTP/1.1
Host: http://wkq5y1h4uomy.cn-north-1.jdcloud-api.net/
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW


Content-Disposition: form-data; name="images"; filename="/Users/zhushijie/Documents/test-psd-800x600.psd

------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="texts"

["copy 1", "copy 2"]
------WebKitFormBoundary7MA4YWxkTrZu0gW--
Content-Disposition: form-data; name="sizes"

[{"width": 100, "height": 100}]
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
|code|string | 1001 | See-[System Level Error Code](https://docs.jdcloud.com/en/image-matting/error-codes) |
|msg|string | Successful Search | See-[System Level Error Code](https://docs.jdcloud.com/en/image-matting/error-codes) |
|result|object | {...} | Result |

#### (2) Business Return Parameter
result parameter information

|Name|Type|Example Value|Description|
|---|---|---|---|
|status|string | 0 | Returned results, 0 means successful, non-0 is the corresponding error code, see Error Code - Business Level Error Code|
|requestid|string | 6979e9bd79b944b49e0d6e74079d5098 | Request id |
|message|string | success | Result status, if successful, it is success |
|result|object | {} | Processed objects |

### 2. Return Example
When ‘service’ is ‘1’, Success:

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

When ‘service’ is ‘2’ and ‘template_id’ is transmitted, Success:

```http
HTTP/1.1 200
Content-Type: application/json

{
    "code": 10000,
    "msg": "Search succeeded",
    "result": {
        "images": [
            {
                "size": {
                    "width": 400,
                    "height": 300
                },
                "url": "https://img10.360buyimg.com/tu/jfs/t1/70821/38/15777/27694/5dd63c7fE3ac8c9af/173ce88476017ceb.jpg"
            }
        ],
        "status": 0,
        "message": "OK",
        "requestId": "45d7a845-420f-450d-8460-fbddf3feafa1"
    }
}
```

When ‘service’ is ‘2’ and ‘template_id’ is not transmitted, Success:

```http
HTTP/1.1 200
Content-Type: application/json

{
    "code": 10000,
    "msg": "Search succeeded",
    "result": {
        "images": [
            // template 1
            [
                {
                    "size": {
                        "width": 400,
                        "height": 300
                    },
                    "url": "https://img10.360buyimg.com/tu/jfs/t1/70821/38/15777/27694/5dd63c7fE3ac8c9af/173ce88476017ceb.jpg"
                },
                ...
            ],
            // template 2
            [
                {
                    "size": {
                        "width": 400,
                        "height": 300
                    },
                    "url": "https://img10.360buyimg.com/tu/jfs/t1/70821/38/15777/27694/5dd63c7fE3ac8c9af/173ce88476017ceb.jpg"
                },
                ...
            ],
            // template 3
            [
                {
                    "size": {
                        "width": 400,
                        "height": 300
                    },
                    "url": "https://img10.360buyimg.com/tu/jfs/t1/70821/38/15777/27694/5dd63c7fE3ac8c9af/173ce88476017ceb.jpg"
                },
                ...
            ],
        ],
        "status": 0,
        "message": "OK",
        "requestId": "45d7a845-420f-450d-8460-fbddf3feafa1"
    }
}
```

# Acquire intelligent design template list

## API Description
Template list API for searching Automatic Composing.

## Request Description

### 1. Request Address
http://wkq5y1h4uomy.cn-north-1.jdcloud-api.net/api/intel-templates

### 2. Request Method
GET

### 3. Request Parameter

#### (1) Query parameter:
- `page`: Required, Page XX
- `per_page`: Required, XX pieces each page

### 4. Request Example

``` http
GET /api/intel-templates HTTP/1.1
Host: http://wkq5y1h4uomy.cn-north-1.jdcloud-api.net
```

## Return Instructions

Success:
```http
HTTP/1.1 200
Content-Type: application/json

{
    "data": {
        "templates": [
            {
                "id": "xxx",
                "name": "test-psd-800x600.psd",
                "thumbnail": "http://img14.360buyimg.com/tu/jfs/t1/51772/29/14975/12882/5dc138f0Edefc0f37/0a6747da912db6a8.jpg",
                "size": {
                    "height": 600,
                    "width": 800
                },
            },
            ...
        ],
        "total: 23
    }
}

```
