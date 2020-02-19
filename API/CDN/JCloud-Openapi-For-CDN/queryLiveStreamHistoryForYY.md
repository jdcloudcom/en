# queryLiveStreamHistoryForYY


## Description
Search historical pushing streaming data

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveStream:queryHistoryForYY


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Pushing Streaming Domain|
|**appName**|String|True| | |
|**streamName**|String|True| | |
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String| |
|**endTime**|String| |
|**domain**|String| |
|**appName**|String| |
|**streamName**|String| |
|**infoList**|[StreamHistoryInfoForYY[]](#streamhistoryinfoforyy)| |
### <div id="StreamHistoryInfoForYY">StreamHistoryInfoForYY</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**avgupspeed**|Long| |
|**avgupframerate**|Long| |
|**pushEdgeNodeIps**|String[]| |
|**anchorIps**|String[]| |
|**flvBandWidth**|Long| |
|**flvPlayerCount**|Long| |
|**hlsBandWidth**|Long| |
|**hlsPlayerCount**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
