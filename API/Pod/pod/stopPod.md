# stopPod


## Description
Stop a single instance in the operating status and the pod involved in a job can’t be started.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}:stopPod

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
