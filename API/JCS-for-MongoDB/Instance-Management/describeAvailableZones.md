# describeAvailableZones


## Description
Get AZ

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/availableZones

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**availableZones**|AvailableZones[]| |
### AvailableZones
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone|
|**canSale**|Boolean|Is it available for sale|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
