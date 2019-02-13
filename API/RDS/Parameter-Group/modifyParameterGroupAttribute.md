# modifyParameterGroupAttribute


## Description
Modify parameter set name and description<br>- Support MySQL only

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}:modifyParameterGroupAttribute

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupId**|String|True| |Parameter Group ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Parameter Set Description|
|**parameterGroupName**|String|True| |Parameter Set Name|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
