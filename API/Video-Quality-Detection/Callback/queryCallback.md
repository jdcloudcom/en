# queryCallback


## Description
Search callback configuration

## Request Method
GET

## Request Address
https://vqd.jdcloud-api.com/v1/settings:queryCallback


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querycallback#result)|Search the result of callback configuration|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**callbackType**|String|Call Back Mode|
|**httpUrl**|String|Call back URL in the HTTP mode|
|**callbackEvents**|String[]|Call back event list|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|

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
https://vqd.jdcloud-api.com/v1/settings:queryCallback

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "callbackEvents": [
            "VqdSuccess", 
            "VqdFailure"
        ], 
        "callbackType": "http", 
        "createTime": "2019-11-27T06:52:34Z", 
        "httpUrl": "https://example.com/callback", 
        "updateTime": "2019-11-27T06:52:34Z"
    }
}
```
