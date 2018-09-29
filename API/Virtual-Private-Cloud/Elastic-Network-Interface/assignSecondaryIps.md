# assignSecondaryIps


## Description
Assign secondary IP API to network interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}:assignSecondaryIps

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|True| |networkInterface ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**force**|Boolean|False|True|When secondary ip is occupied by other interfaces, whether to preempt it or not. false: non-preemption for reallocation, true: preemption for reallocation, default preemption for reallocation. Default value: true|
|**secondaryIpCount**|Number|False| |Assign Automatically Allocated Number of Secondary IP|
|**secondaryIps**|String[]|False| |Assign Allocated Secondary IP Address|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**200**|Successful Operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource Not Found|
