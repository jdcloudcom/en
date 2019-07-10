# updateAg


## Description
Modify information of an availability group

## Request Method
PATCH

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups/{agId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|
|**agId**|String|True| |Availability Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description, cannot exceed 256 characters in length|
|**name**|String|False| |Name of Availability Group, only supporting Chinese characters, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters|


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
