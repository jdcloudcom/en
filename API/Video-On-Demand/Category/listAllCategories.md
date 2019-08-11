# listAllCategories


## Description
Search all categories

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/categories:listAll


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**flatMode**|Boolean|False| |Return result of flat structure or not|
|**treeMode**|Boolean|False| |Return result of tree structure or not|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search all category results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**flatResult**|CategoryObject[]|Result of Flat Structure|
|**treeResult**|CategoryTreeNode|Result of Tree Structure|
### CategoryTreeNode
|Name|Type|Description|
|---|---|---|
|**id**|Long|Category ID|
|**name**|String|Category Name|
|**level**|Integer|Category Level|
|**description**|String|Category Description Information|
|**children**|CategoryTreeNode[]|Sub-category|
|**createTime**|String|Creation Time|
|**updateTime**|String|Modification Time|
### CategoryObject
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
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
GET
```
https://vod.jdcloud-api.com/v1/categories:listAll

```

## Return Example
```
{
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "flatResult": [
            {
                "createTime": "2019-04-16T15:51:32Z", 
                "description": "description", 
                "id": 1, 
                "level": 1, 
                "name": "TV", 
                "parentId": 0, 
                "updateTime": "2019-04-16T15:51:32Z"
            }
        ], 
        "treeResult": {
            "children": [
                {
                    "createTime": "2019-04-16T15:51:32Z", 
                    "description": "description", 
                    "id": 1, 
                    "level": 1, 
                    "name": "TV", 
                    "parentId": 0, 
                    "updateTime": "2019-04-16T15:51:32Z"
                }
            ], 
            "createTime": "1970-01-01T00:00:00Z", 
            "description": "Virtual root category", 
            "id": 0, 
            "level": 0, 
            "name": "ROOT", 
            "updateTime": "1970-01-01T00:00:00Z"
        }
    }
}
```
