# queryStreambdwTable


## Description
Stream Bandwidth Table

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:streambdwTable


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**appName**|String|False| |app Name|
|**streamName**|String|False| |Stream Name|
|**pageNumber**|Integer|False| | |
|**pageSize**|Integer|False| | |
|**sortField**|String|False| |Sorting Field|
|**sortRule**|String|False|desc|Sorting Rule|
|**area**|String|False| | |
|**isp**|String|False| | |
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**data**|[StreamTableItem[]](#streamtableitem)| |
### <div id="StreamTableItem">StreamTableItem</div>
|Name|Type|Description|
|---|---|---|
|**topTimeStamp**|Long| |
|**avgbandwidth**|Double| |
|**flow**|Double| |
|**pv**|Long| |
|**streamName**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
