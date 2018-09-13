# describeAvailableZones


## Description
Get AZ

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/availableZones

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**availableZones**|[AvailableZones[]](##AvailableZones)||
### <a name="AvailableZones">AvailableZones</a>
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone|
|**canSale**|Boolean|Is it available for sale|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
