# queryOnlineStream


## Description
Online Stream Information

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/online

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appName**|String|False| |app Name|
|**streamName**|String|False| |Stream Name|
|**pageSize**|Integer|False|10|Search Paging Size|
|**pageNumber**|Integer|False|1| |
|**startTime**|String|False| |Start time format: yyyy-MM-dd HH:mm|
|**endTime**|String|False| |End time format of yyyy-MM-dd HH:mm|
|**recLevel**|Long|False| |Top Stream Priority|
|**connId**|String|False| |Connection No. of Stream on the Edge|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**result**|[OnlineStreamInfo[]](#onlinestreaminfo)| |
### <div id="OnlineStreamInfo">OnlineStreamInfo</div>
|Name|Type|Description|
|---|---|---|
|**app**|String| |
|**stream**|String| |
|**clientIp**|String| |
|**serverIp**|String| |
|**frameRate**|Double| |
|**frameLossRate**|Double| |
|**lastActive**|Long| |
|**realFps**|Double| |
|**uploadSpeed**|Long| |
|**videoCodecId**|Long| |
|**videoDataRate**|Long| |
|**audioCodecId**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
