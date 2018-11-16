# modifyInstanceSpec


## Description
Change instance type

## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceSpec

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceClass**|String|True| |The instance type under monthly package shall not be smaller than the current type.|
|**instanceStorageGB**|Integer|True| |The storage space under monthly package shall not be smaller than the current type.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**instanceId**|String| |
|**orderId**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
