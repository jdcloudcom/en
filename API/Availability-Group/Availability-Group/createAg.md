# createAg


## Description
Create an availability group

## Request Method
POST

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**azs**|String[]|True| |Availability zones supported, at least one|
|**agName**|String|True| |Name of Availability Group, only supporting Chinese characters, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters|
|**agType**|String|False| |Availability Group type, supporting vm|
|**instanceTemplateId**|String|True| |Instance Template Id|
|**description**|String|False| |Description, cannot exceed 256 characters in length|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**agId**|String|Created Availability Group id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
