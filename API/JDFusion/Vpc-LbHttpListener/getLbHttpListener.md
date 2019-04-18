# getLbHttpListener


## Description
Search the listener list according to the filter criteria

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_lbHttpListener

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**slbid**|String|False| |id of Load Balancer|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**httpListeners**|LbHttpListener[]| |
### LbHttpListener
|Name|Type|Description|
|---|---|---|
|**listenerPort**|Integer|Port Used by Instance Frontend of Load Balancer.|
|**backendServerPort**|Integer|Port Used by Instance Backend of Load Balancer|
|**status**|String|Current Status of Listening|
|**scheduler**|String|Scheduling Algorithm.|
|**vServerGroupId**|String|ID of Associated Server Group.|
|**healthCheck**|String|Enable Health Check or Not.|
|**healthCheckConnectPort**|Integer|No  Port Used for Health Check|
|**healthyThreshold**|Integer|No  After several continuous successes of health check, the health check status of backend server will change from failure to success. Value: 2-10|
|**unhealthyThreshold**|Integer|No  After several continuous failures of health check, the health check status of backend server will change from success to failure. Value: 2-10|
|**healthCheckTimeout**|Integer|No  Time needed for waiting for receiving a response from running status check. If ECS of backend has not responded within designated time, then health check is determined to be failed. Value: 1-300 (second)|
|**healthCheckInterval**|Integer|No  Time Interval of Health Check. Value: 1-50 (second)|
|**healthCheckHttpCode**|String|No  Normal HTTP Status Code of Health Check, multiple status codes are separated by commas. Value: http_2xx (Default value) | http_3xx | http_4xx | http_5xx|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
