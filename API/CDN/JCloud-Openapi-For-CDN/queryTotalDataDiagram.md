# queryTotalDataDiagram


## Description
Total Data Trend Chart of Domain Bandwidth

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:domainbdwDiagram


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**period**|String|False| |Search cycle, fiveMin by default|
|**fields**|String|True| |pv,flow,avgbandwidth will connect and check corresponding back-to-origin fields|
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**details**|[TotalDetalItem[]](#totaldetalitem)| |
### <div id="TotalDetalItem">TotalDetalItem</div>
|Name|Type|Description|
|---|---|---|
|**data**|Object| |
|**oriData**|Object| |
|**timeStamp**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
