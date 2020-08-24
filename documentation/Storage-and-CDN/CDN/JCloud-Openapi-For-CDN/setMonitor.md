# setMonitor


## Description
Set the origin server monitoring information. Origin server monitoring related configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/monitor

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cycle**|Integer|True| |Probing period, with the value as 1 and 5 and the unit of minute|
|**monitorPath**|String|True| |Probing path|
|**httpRequestHeader**|Object|False| |http request header|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](setmonitor#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**monitorId**|Long| |

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
