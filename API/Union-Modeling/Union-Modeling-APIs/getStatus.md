# getStatus


## Description
Acquire task status


## Request Method
POST

## Request Address
https://umodeling.jdcloud-api.com/v1/regions/{regionId}/task:getStatus

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vo**|[GetStatusVO](getstatus#getstatusvo)|True| |Acquire task status|

### <div id="getstatusvo">GetStatusVO</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |Task ID|
|**appKey**|String|True| |Account ID|
|**role**|String|True| |Data Role|
|**taskType**|String|True| |Task Type|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getstatus#result)| |
|**requestId**|String|Request ID, requests are different at each time|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|true is success, false is failure|
|**message**|String|Description Information|
|**data**|String|Query Data Result|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
