# queryLiveStreamRankingForYY


## Description
Search by playing number stream

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveStream:rankingForYY


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Pushing Streaming Domain|
|**appName**|String|False| | |
|**scheme**|String|True| |Play protocol can only be hdl or hls|
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
|**scheme**|String| |
|**rankingList**|[StreamRankingForYY[]](#streamrankingforyy)| |
### <div id="StreamRankingForYY">StreamRankingForYY</div>
|Name|Type|Description|
|---|---|---|
|**streamName**|String| |
|**ranking**|Integer| |
|**playerCount**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
