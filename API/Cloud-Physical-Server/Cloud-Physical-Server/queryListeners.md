# queryListeners


## Description
Search Listener

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/listeners

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Name|
|**loadBalancerId**|String|False| |Load Balancer Instance ID, exact matching|
|**filters**|Filter[]|False| |listenerId - Listener ID, exact matching, supporting multiple IDs<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**listeners**|Listener[]| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### Listener
|Name|Type|Description|
|---|---|---|
|**listenerId**|String|Listener ID|
|**loadBalancerId**|String|Load Balancer ID|
|**protocol**|String|Protocol|
|**port**|Integer|Port|
|**algorithm**|String|Scheduling Algorithm|
|**stickySession**|String|Session Persistence Status, with the value on|off|
|**stickySessionTimeout**|Integer|Session Persistence Time-out Period, Unit: s|
|**cookieType**|String|Session Type|
|**realIp**|String|Get actual ip|
|**certificateId**|String|Certificate ID|
|**status**|String|Status|
|**name**|String|Name|
|**description**|String|Description|
|**headers**|String[]|HTTP Extension Header|
|**healthCheck**|String|Health check status, with the value on|off|
|**healthCheckTimeout**|Integer|Maximum Time-out Period of Health Check Response, Unit: s|
|**healthCheckInterval**|Integer|Maximum Interval of Health Check Response, Unit: s|
|**healthyThreshold**|Integer|Health Check Result with Threshold of success|
|**unhealthyThreshold**|Integer|Health Check Result with Threshold of fail|
|**healthCheckUri**|String|Health Check URI|
|**healthCheckHttpCode**|String|HTTP Status Code of Normal Health Check|
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
