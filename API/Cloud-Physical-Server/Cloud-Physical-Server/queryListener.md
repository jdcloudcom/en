# queryListener


## Description
Search listener details

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/listeners/{listenerId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call APIs (queryCPSLBRegions) to get regions supported by Cloud Physical Server|
|**listenerId**|String|True| |Listener ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**listener**|Listener|Detailed Details of Listener|
### Listener
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
