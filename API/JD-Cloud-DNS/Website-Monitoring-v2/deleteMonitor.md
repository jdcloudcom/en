# deleteMonitor


## Description
Deletion of Monitoring Item

## Request Method
DELETE

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitor/{monitorId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|
|**monitorId**|String|True| |Monitoring Item ID, please get it with the describeMonitor API.|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
