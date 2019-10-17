# modifyMonitorStatus


## Description
Monitoring item operation set, include: suspension, starting, manual recovery and manual switch

## Request Method
PUT

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitor/{monitorId}/status

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|
|**monitorId**|String|True| |Monitoring Item ID, please get it with the describeMonitor API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**action**|String|True| |stop, start, manual recover, manual switch, batch operation is not supported in manual recover and manual switch|
|**switchTarget**|String|False| |Host value of monitoring item, required for manual switch|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
