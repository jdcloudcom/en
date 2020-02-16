# sendData


## Description
Data Uploading


## Request Method
POST

## Request Address
https://umodeling.jdcloud-api.com/v1/regions/{regionId}/task:sendData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vo**|[SendDataVO](senddata#senddatavo)|True| |Data Uploading|

### <div id="senddatavo">SendDataVO</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |Task ID|
|**role**|String|True| |Data Source Role|
|**toRole**|String|True| |Data Target Role|
|**key**|String|True| |Data key|
|**value**|String|True| |Data Value|
|**taskType**|String|True| |Task Type|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](senddata#result)| |
|**requestId**|String|Request ID, requests are different at each time|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|true is success, false is failure|
|**message**|String|Description Information|
|**data**|Integer|Query Data Result|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
