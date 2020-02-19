# createCategory


## Description
Add category

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/categories


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Category Name|
|**parentId**|Long|False| |Parent category ID value 0 or null represents the level I category<br>|
|**description**|String|False| |Category Description Information|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createcategory#result)|Add category result|
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
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vod.jdcloud-api.com/v1/categories

```
```
{
    "description": "description", 
    "name": "TV", 
    "parentId": 0
}
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
