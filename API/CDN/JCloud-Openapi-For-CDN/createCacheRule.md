# createCacheRule


## Description
Add cache rules

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/cacheRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**weight**|Integer|False| |The weight value of this configuration varies within the value range 1-10, and 1 is the maximum value|
|**ttl**|Long|False| |Cache time, in second|
|**contents**|String|False| |Rule content. Other types can start with / or ., such as /a/b or.jpg|
|**cacheType**|Integer|False| |Cache method: 0 means no cache, 1 means customization|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**configId**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
