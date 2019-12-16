# createParameterGroup


## Description
Create a parameter group<br>- Only support MySQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**engine**|String|True| |Type of instance engine, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|True| |Version of instance engine, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**parameterGroupName**|String|True| |Name of Parameter Group|
|**description**|String|False| |Description of Parameter Group|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createParameterGroup#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
