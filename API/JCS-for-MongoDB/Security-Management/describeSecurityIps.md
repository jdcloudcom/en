# describeSecurityIps


## Description
Query Instance Access White List

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/securityIps

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**securityIps**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
