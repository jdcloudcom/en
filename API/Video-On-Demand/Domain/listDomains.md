# listDomains


## Description
Search domain list

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; the default value is 1|
|**pageSize**|Integer|False|10|page size; the default value is 10; the value range is [10, 100]|
|**sorts**|Sort[]|False| | |

### Sort
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Sorting Attribute Name|
|**direction**|String|False| |Sorting Direction|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search domain list result|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search total amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|DomainObject[]|Paging Content|
### DomainObject
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
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
GET
```
https://vod.jdcloud-api.com/v1/domains

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "content": [
            {
                "asDefault": true, 
                "cname": "221583-playvod.jdcloud.com.jdcloud-cdn.com", 
                "createTime": "2019-04-16T10:37:00Z", 
                "id": 1, 
                "name": "221583-playvod.jdcloud.com", 
                "status": "normal", 
                "type": "system", 
                "updateTime": "2019-04-16T10:37:00Z"
            }, 
            {
                "asDefault": false, 
                "cname": "vodplay.lomagicode.com.jdcloud-cdn.com", 
                "createTime": "2019-04-16T10:37:00Z", 
                "id": 2, 
                "name": "vodplay.lomagicode.com", 
                "source": "custom", 
                "status": "normal", 
                "updateTime": "2019-04-16T10:37:00Z"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 1, 
        "totalPages": 1
    }
}
```
