# getData


## Description
Acquire Data


## Request Method
POST

## Request Address
https://umodeling.jdcloud-api.com/v1/regions/{regionId}/task:getData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vo**|[GetDataVO](getdata#getdatavo)|True| |Acquire Data|

### <div id="getdatavo">GetDataVO</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |Task ID|
|**role**|String|True| |Data Target Role|
|**fromRole**|String|True| |Data Source Role|
|**key**|String|True| |Data key|
|**taskType**|String|True| |Task Type|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getdata#result)| |
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
