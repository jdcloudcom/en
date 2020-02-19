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
|**urlList**|String[]|True| |Prewarm URL|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)|Prewarm Detail|
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**result**|[QueryLivePrefetchItem[]](#queryliveprefetchitem)| |
### <div id="QueryLivePrefetchItem">QueryLivePrefetchItem</div>
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
