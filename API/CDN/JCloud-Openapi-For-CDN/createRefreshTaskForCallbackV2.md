# createRefreshTaskForCallbackV2


## Description
Create refresh and prewarm callback task

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:createForCallbackV2


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskType**|String|True| |Refresh and prewarm type, (url: url refresh, dir: directory refresh, prefetch: prewarm)|
|**urlItems**|[UrlItemV2[]](createRefreshTaskForCallbackV2#urlitemv2)|True| | |

### <div id="UrlItemV2">UrlItemV2</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**url**|String|True| |Task url|
|**urlId**|String|False| |Returned Task id|
|**callbackUrl**|String|True| |Returned Address|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createRefreshTaskForCallbackV2#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorCount**|Integer|Count of Failed Tasks|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
