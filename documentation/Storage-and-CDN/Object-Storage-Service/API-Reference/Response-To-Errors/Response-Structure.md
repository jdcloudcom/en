# Error Response Structure

If an error occurs at the time of interacting with APIs, response of cloud storage server includes:

1. Corresponding HTTP 3xx, 4xx and 5xx status code (HTTP Status)

2. Message body of JSON format

The following is an example of returning JSON:
```
{“code”   :”AccessDenied”,”message”:”Access   Denied”,”resource”:”/mybucket/public/index.html”,
”requestId”:”71515159-E06D-406F-81C4-E03FA635B831”}
```

The following table introduces the meaning of each element:

|Name|Description|
|-|-|
|code|Error Code|
|message|Description of error message through which the problem can be preliminarily located. |
|RequestId|Unique ID of Identification Request |
|Resource|Include request resource descriptor of Bucket or Object. |
