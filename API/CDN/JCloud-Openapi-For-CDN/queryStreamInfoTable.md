# queryStreamInfoTable


## Description
Pushing streaming information

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/publishInfo

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
|**startTime**|String|True| |Start time format: yyyy-MM-dd HH:mm|
|**endTime**|String|False| |End time format of yyyy-MM-dd HH:mm|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**result**|[PushStreamInfoItem[]](#pushstreaminfoitem)| |
### <div id="PushStreamInfoItem">PushStreamInfoItem</div>
|Name|Type|Description|
|---|---|---|
|**app**|String| |
|**stream**|String| |
|**clientIp**|String| |
|**nodeIp**|String| |
|**startTime**|String|Task Creation Time, UTC time|
|**endTime**|String|Task Creation Time, UTC time|
|**duration**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
