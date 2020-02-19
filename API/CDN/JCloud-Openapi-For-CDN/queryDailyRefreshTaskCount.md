# queryDailyRefreshTaskCount


## Description
Search refresh and prewarm task quota

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/task:count


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**refreshAllCount**|Integer| |
|**prefetchAllCount**|Integer| |
|**dirAllCount**|Integer| |
|**refreshUsedCount**|Integer| |
|**prefetchUsedCount**|Integer| |
|**dirUsedCount**|Integer| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
