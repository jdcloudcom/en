# modifyParameterGroupAttribute


## Description
Modify parameter set name and description<br>- Support MySQL only

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}:modifyParameterGroupAttribute

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupName**|String|True| |Parameter Set Name|
|**description**|String|False| |Parameter Set Description|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
