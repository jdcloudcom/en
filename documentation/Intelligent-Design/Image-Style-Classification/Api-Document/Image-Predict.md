# Image Style Classification

## API Description
The Image Style Classification service is a function reading image information and realizing intelligent classification and management as per styles. By building the sample data set training machine, a style prediction model is created by a deep learning engine. According to the model, characteristic style elements can be recognized from image information and image design style is automatically distinguished.

## Request Description

### 1. Request Address
http://wko74nw3nxr2.cn-north-1.jdcloud-api.net/api/predict-style

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
|code|string | 1001 | See-[System Level Error Code](https://docs.jdcloud.com/en/image-style-classification/error-codes)|
|msg|string | Successful Search | See-[System Level Error Code](https://docs.jdcloud.com/en/image-style-classification/error-codes)|
|result|object | {...} | Result |

#### (2) Business Return Parameter
result parameter information

|Name|Type|Example Value|Description|
|---|---|---|---|
|status|string | 0 | Returned results, 0 means successful, and non-0 is the corresponding error code. See Error Code - Business Level Error Code|
|requestid|string | 6979e9bd79b944b49e0d6e74079d5098 | Request id |
|message|string | success | Result status, if successful, it is success |
|styles| array | [ ... ] | Processed Result |

### 2. Return Example
```js
{
  "code": 10000,
  "msg": "Search succeeded",
  "result": {
    "status": 0,
    "message": "OK",
    "requestId": "aa4899f4-db4c-4b09-8aaa-5ecd175e204e",
    "styles": [
      {
        "probability": 0.5523,
        "className": "Delicate and Beautiful"
      },
      {
        "probability": 0.3799,
        "className": "Refreshing and Elegant"
      },
      {
        "probability": 0.0279,
        "className": "Simple and Neutral"
      }
    ]
  }
}
```
