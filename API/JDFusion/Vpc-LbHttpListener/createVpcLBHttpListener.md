# createVpcLBHttpListener


## Description
Create HTTP listener

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_lbHttpListener

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**httpListener**|CreateLoadBalancerHTTPListener|True| |Create HTTP listener|

### CreateLoadBalancerHTTPListener
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**loadBalancerId**|String|False| |Yes  Instance ID of Load Balancer|
|**listenerPort**|Integer|False| |Yes  Port Used by Instance Frontend of Load Balancer|
|**backendServerPort**|Integer|False| |Yes  Port Used by Instance Backend of Load Balancer|
|**vserverGroupId**|String|False| |No  Server Group ID|
|**bandwidth**|Integer|False| |Yes  Bandwidth Peak of Listening|
|**healthCheckConnectPort**|Integer|False| |No  Port Used for Health Check|
|**healthyThreshold**|Integer|False| |No  After several continuous successes of health check, the health check status of backend server will change from failure to success. Value: 2-10|
|**unhealthyThreshold**|Integer|False| |No  After several continuous failures of health check, the health check status of backend server will change from success to failure. Value: 2-10|
|**healthCheckTimeout**|Integer|False| |No  Time needed for waiting for receiving a response from running status check. If ECS of backend has not responded within designated time, then health check is determined to be failed. Value: 1-300 (second)|
|**healthCheckInterval**|Integer|False| |No  Time Interval of Health Check. Value: 1-50 (second)|
|**healthCheckHttpCode**|String|False| |No  Normal HTTP Status Code of Health Check, multiple status codes are separated by commas. Value: http_2xx (default value) | http_3xx | http_4xx | http_5xx|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
