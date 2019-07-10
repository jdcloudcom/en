# setInstanceTemplate


## Description
Modify instance template of availability group

## Request Method
POST

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups/{agId}:setInstanceTemplate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|
|**agId**|String|True| |Availability Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceTemplateId**|String|True| |Instance Template id|


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
