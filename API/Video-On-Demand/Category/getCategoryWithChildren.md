# getCategoryWithChildren


## Description
Search category and its sub-category. If the appointed category ID is 0, one root category and its sub-category (i.e., level I category) will be returned.

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/categories/{categoryId}:getWithChildren

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**categoryId**|Long|True| |Category ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search result of category and its sub-category|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**id**|Long|Category ID|
|**name**|String|Category Name|
|**level**|Integer|Category Level|
|**description**|String|Category Description|
|**children**|SubCategory[]|Sub-category|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|
### SubCategory
|Name|Type|Description|
|---|---|---|
|**id**|Long|Category ID|
|**name**|String|Category Name|
|**level**|Integer|Category Level|
|**description**|String|Category Description|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
## Return Example
```
{
    "code": 200, 
    "requestId": "082b1779-8617-42ec-a396-c9e5992c273a", 
    "result": {
        "children": [
            {
                "createTime": "2019-03-08T12:06:44Z", 
                "description": null, 
                "id": 405, 
                "level": 2, 
                "name": "Science Fiction", 
                "updateTime": "2019-07-09T05:52:13Z"
            }
        ], 
        "createTime": "2019-03-08T12:06:39Z", 
        "description": null, 
        "id": 404, 
        "level": 1, 
        "name": "Film", 
        "updateTime": "2019-07-09T05:52:06Z"
    }
}
```
