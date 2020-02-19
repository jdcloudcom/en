# updateCacheRule


## Description
Modify cache rule

## Request Method
PUT

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/cacheRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**weight**|Integer|True| |The weight value of this configuration varies within the value range 1-10, and 1 is the maximum value|
|**ttl**|Long|True| |Cache time, in second|
|**contents**|String|False| |Rule content. Other types can start with / or ., such as /a/b or.jpg|
|**cacheType**|Integer|True| |Cache method: 0 means no cache, 1 means customization|
|**configId**|Long|True| |Cache Rule Configuration ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
