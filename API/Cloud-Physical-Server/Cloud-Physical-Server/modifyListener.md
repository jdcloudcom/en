# modifyListener


## Description
Modify listener

## Request Method
POST

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/listeners/{listenerId}:modifyListenerAttributes

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call the API (describeCPSLBRegions) to get regions supported by Cloud Physical Server|
|**listenerId**|String|True| |Listener ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**algorithm**|String|False| |Scheduling Algorithm|
|**stickySession**|String|False| |Session Persistence|
|**realIp**|String|False| |Get actual ip or not, with the value range on|off|
|**name**|String|False| |Name|
|**description**|String|False| |Description|
|**healthCheck**|String|False| |Health Check|
|**healthCheckTimeout**|Integer|False| |Maximum Time-out Period of Health Check Response|
|**healthCheckInterval**|Integer|False| |Maximum Interval of Health Check Response|
|**healthyThreshold**|Integer|False| |Health Check Result with Threshold of success|
|**unhealthyThreshold**|Integer|False| |Health Check Result with Threshold of fail|
|**serverGroupId**|String|False| |Server Group id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifylistener#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**listener**|[Listener](modifylistener#listener)|Detailed Details of Listener|
### <div id="listener">Listener</div>
|Name|Type|Description|
|---|---|---|
|**listenerId**|String|Listener ID|
|**loadBalancerId**|String|Load Balancer ID|
|**protocol**|String|Protocol|
|**port**|Integer|Port|
|**algorithm**|String|Scheduling Algorithm|
|**stickySession**|String|Session Persistence Status, with the value on|off|
|**realIp**|String|Get actual ip|
|**status**|String|Status|
|**name**|String|Name|
|**description**|String|Description|
|**healthCheck**|String|Health check status, with the value on|off|
|**healthCheckTimeout**|Integer|Maximum Time-out Period of Health Check Response, Unit: s|
|**healthCheckInterval**|Integer|Maximum Interval of Health Check Response, Unit: s|
|**healthyThreshold**|Integer|Health Check Result with Threshold of success|
|**unhealthyThreshold**|Integer|Health Check Result with Threshold of fail|
|**healthCheckIp**|String|Health Check ip|
|**serverGroupId**|String|Server Group id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
