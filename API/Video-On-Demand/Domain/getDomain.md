# getDomain


## Description
Search domain

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getdomain#result)|Search domain result|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**id**|String|Domain Name ID|
|**name**|String|Domain Name|
|**cname**|String|Domain CNAME|
|**status**|String|Domain Status. Value range: <br>  init - initial status<br>  configuring - configuring<br>  normal - normal<br>  stopped - out of service<br>|
|**source**|String|Domain Source. Value range:<br>  system - produced by the system<br>  custom - built by users<br>|
|**asDefault**|Boolean|If it is the default domain|
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
https://vod.jdcloud-api.com/v1/domains/2

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "asDefault": false, 
        "cname": "vodplay.lomagicode.com.jdcloud-cdn.com", 
        "createTime": "2019-04-16T10:37:00Z", 
        "id": 2, 
        "name": "vodplay.lomagicode.com", 
        "source": "custom", 
        "status": "normal", 
        "updateTime": "2019-04-16T10:37:00Z"
    }
}
```
