# assignSecondaryIps


## Description
Assign secondary IP API to network interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}:assignSecondaryIps

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**networkInterfaceId**|String|True| |networkInterface ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**force**|Boolean|False|True|When secondary ip is occupied by other interfaces, whether to preempt it or not. false: non-preemption for reallocation, true: preemption for reallocation, default preemption for reallocation. Default value: true|
|**secondaryIps**|String[]|False| |Assign Allocated Secondary IP Address|
|**secondaryIpCount**|Number|False| |Assign Automatically Allocated Number of Secondary IP|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
