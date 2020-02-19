# getCategory


## Description
Search category

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/categories/{categoryId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**categoryId**|Long|True| |Category ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getcategory#result)|Search category result|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**id**|Long|Category ID|
|**name**|String|Category Name|
|**level**|Integer|Category Level. The value range is [0, 3]. If the value is 0, it means the virtual root node<br>|
|**parentId**|Long|Parent category ID value 0 or null represents the level I category<br>|
|**description**|String|Category Description Information|
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

## Request Example
GET
```
https://vod.jdcloud-api.com/v1/categories/1

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "createTime": "2019-04-16T15:51:32Z", 
        "description": "description", 
        "id": 1, 
        "level": 1, 
        "name": "TV", 
        "parentId": 0, 
        "updateTime": "2019-04-16T15:51:32Z"
    }
}
```
