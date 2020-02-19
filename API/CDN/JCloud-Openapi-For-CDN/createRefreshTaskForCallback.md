# createRefreshTaskForCallback


## Description
Create refresh and prewarm callback task

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:createForCallback


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskType**|String|True| |Refresh and prewarm type, (url: url refresh, dir: directory refresh, prefetch: prewarm)|
|**urlItems**|[UrlItem[]](createrefreshtaskforcallback#urlitem)|True| | |

### <div id="urlitem">UrlItem</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**url**|String|True| |Task url|
|**urlId**|Long|False| |Returned Task id|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createrefreshtaskforcallback#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorCount**|Integer|Count of Failed Tasks|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|