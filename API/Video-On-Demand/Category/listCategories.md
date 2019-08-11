# listCategories


## Description
Search category list. Return category list information in the paging form.

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/categories


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
|**result**|Result|Search category list information result …|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalElements**|Integer|Search total amount|
|**totalPages**|Integer|Total Number of Pages|
|**content**|CategoryObject[]|Paging Content|
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
https://vod.jdcloud-api.com/v1/categories

```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "content": [
            {
                "createTime": "2019-04-16T15:51:32Z", 
                "description": "description", 
                "id": 1, 
                "level": 0, 
                "name": "TV", 
                "parentId": 0, 
                "updateTime": "2019-04-16T15:51:32Z"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalElements": 1, 
        "totalPages": 1
    }
}
```
