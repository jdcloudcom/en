# modifyParameterGroupParameters


## Description
Modify parameters of parameter group<br>- Only support MySQL

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameters**|[Parameter[]](#Parameter)|True| |Modified Parameters|

### <a name="Parameter">Parameter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Parameter Name|
|**value**|String|True| |Modified Parameter Value|

## Response parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
