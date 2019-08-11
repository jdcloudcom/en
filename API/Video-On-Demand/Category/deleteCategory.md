# deleteCategory


## Description
Delete category

## Request Method
DELETE

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
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
DELETE
```
https://vod.jdcloud-api.com/v1/categories/1

```

