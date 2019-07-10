# deleteAg


## Description
Delete Availability Group based on id and please make sure that all VM Instances of AG are deleted

## Request Method
DELETE

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups/{agId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|
|**agId**|String|True| |Availability Group ID|

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
