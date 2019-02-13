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
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**httpListener**|CreateLoadBalancerHTTPListener|True| |Create HTTP listener|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateLoadBalancerHTTPListener
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backendServerPort**|Integer|False| |Yes  Port Used by Instance Backend of Load Balancer|
|**bandwidth**|Integer|False| |Yes  Bandwidth Peak of Listening|
|**healthCheckConnectPort**|Integer|False| |No  Port Used for Health Check|
|**healthCheckHttpCode**|String|False| |No  Normal HTTP Status Code of Health Check, multiple status codes are separated by commas. Value: http_2xx (default value) | http_3xx | http_4xx | http_5xx|
|**healthCheckInterval**|Integer|False| |No  Time Interval of Health Check. Value: 1-50 (second)|
|**healthCheckTimeout**|Integer|False| |No  Time needed for waiting for receiving a response from running status check. If ECS of backend has not responded within designated time, then health check is determined to be failed. Value: 1-300 (second)|
|**healthyThreshold**|Integer|False| |No  After several continuous successes of health check, the health check status of backend server will change from failure to success. Value: 2-10|
|**listenerPort**|Integer|False| |Yes  Port Used by Instance Frontend of Load Balancer|
|**loadBalancerId**|String|False| |Yes  Instance ID of Load Balancer|
|**unhealthyThreshold**|Integer|False| |No  After several continuous failures of health check, the health check status of backend server will change from success to failure. Value: 2-10|
|**vserverGroupId**|String|False| |No  Server Group ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
