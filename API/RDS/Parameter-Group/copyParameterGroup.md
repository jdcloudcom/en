# copyParameterGroup


## Description
Copy parameter group<br>- Only support MySQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups:copyParameterGroup

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupId**|String|True| |Parameter Group ID|
|**parameterGroupName**|String|True| |Name of Parameter Group|
|**description**|String|False| |Description of Parameter Group|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String| |

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
