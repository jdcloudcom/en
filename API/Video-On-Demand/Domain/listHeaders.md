# listHeaders


## Description
Search domain access header parameter list

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:listHeaders

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search result of domain access header parameter list|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**headers**|GetHeaderResultObject[]|Header Parameter List|
### GetHeaderResultObject
|Name|Type|Description|
|---|---|---|
|**headerName**|String|Header Parameter Name|
|**headerValue**|String|Header Parameter Value|
|**headerType**|String|Header parameter type, value range: req and resp|

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
https://vod.jdcloud-api.com/v1/domains/2:listHeaders

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "headers": [
            {
                "headerName": "Access-Control-Allow-Origin", 
                "headerType": "resp", 
                "headerValue": "*"
            }
        ]
    }
}
```
