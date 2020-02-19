# queryStreambdwDiagram


## Description
Streaming Bandwidth Trend Chart

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:streambdwDiagram


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**appName**|String|False| |app Name|
|**streamName**|String|False| |Stream Name|
|**subDomain**|String|False| |Subdomain|
|**fields**|String|False| |Field Required To Be Searched|
|**area**|String|False| | |
|**isp**|String|False| | |
|**reqMethod**|String|False| | |
|**scheme**|String|False| |Searched Stream Protocol Type|
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**details**|[StreamDiagramItem[]](#streamdiagramitem)| |
### <div id="StreamDiagramItem">StreamDiagramItem</div>
|Name|Type|Description|
|---|---|---|
|**timeStamp**|Long| |
|**data**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
