# queryLivePrefetchTask


## Description
Search live prewarm Task

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:queryLivePrefetchTask


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**urlList**|String[]|False| |Prewarm URL|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Prewarm Detail|
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**result**|QueryLivePrefetchItem[]| |
### QueryLivePrefetchItem
|Name|Type|Description|
|---|---|---|
|**stream**|String| |
|**code**|Integer| |
|**message**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
